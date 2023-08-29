package com.cms.base_service.common.utils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;








public final class HTMLFilter
{
  private static final int REGEX_FLAGS_SI = 34;
/*  23 */   private static final Pattern P_COMMENTS = Pattern.compile("<!--(.*?)-->", 32);
/*  24 */   private static final Pattern P_COMMENT = Pattern.compile("^!--(.*)--$", 34);
/*  25 */   private static final Pattern P_TAGS = Pattern.compile("<(.*?)>", 32);
/*  26 */   private static final Pattern P_END_TAG = Pattern.compile("^/([a-z0-9]+)", 34);
/*  27 */   private static final Pattern P_START_TAG = Pattern.compile("^([a-z0-9]+)(.*?)(/?)$", 34);
/*  28 */   private static final Pattern P_QUOTED_ATTRIBUTES = Pattern.compile("([a-z0-9]+)=([\"'])(.*?)\\2", 34);
/*  29 */   private static final Pattern P_UNQUOTED_ATTRIBUTES = Pattern.compile("([a-z0-9]+)(=)([^\"\\s']+)", 34);
/*  30 */   private static final Pattern P_PROTOCOL = Pattern.compile("^([^:]+):", 34);
/*  31 */   private static final Pattern P_ENTITY = Pattern.compile("&#(\\d+);?");
/*  32 */   private static final Pattern P_ENTITY_UNICODE = Pattern.compile("&#x([0-9a-f]+);?");
/*  33 */   private static final Pattern P_ENCODE = Pattern.compile("%([0-9a-f]{2});?");
/*  34 */   private static final Pattern P_VALID_ENTITIES = Pattern.compile("&([^&;]*)(?=(;|&|$))");
/*  35 */   private static final Pattern P_VALID_QUOTES = Pattern.compile("(>|^)([^<]+?)(<|$)", 32);
/*  36 */   private static final Pattern P_END_ARROW = Pattern.compile("^>");
/*  37 */   private static final Pattern P_BODY_TO_END = Pattern.compile("<([^>]*?)(?=<|$)");
/*  38 */   private static final Pattern P_XML_CONTENT = Pattern.compile("(^|>)([^<]*?)(?=>)");
/*  39 */   private static final Pattern P_STRAY_LEFT_ARROW = Pattern.compile("<([^>]*?)(?=<|$)");
/*  40 */   private static final Pattern P_STRAY_RIGHT_ARROW = Pattern.compile("(^|>)([^<]*?)(?=>)");
/*  41 */   private static final Pattern P_AMP = Pattern.compile("&");
/*  42 */   private static final Pattern P_QUOTE = Pattern.compile("\"");
/*  43 */   private static final Pattern P_LEFT_ARROW = Pattern.compile("<");
/*  44 */   private static final Pattern P_RIGHT_ARROW = Pattern.compile(">");
/*  45 */   private static final Pattern P_BOTH_ARROWS = Pattern.compile("<>");

  
/*  48 */   private static final ConcurrentMap<String, Pattern> P_REMOVE_PAIR_BLANKS = new ConcurrentHashMap<>();
/*  49 */   private static final ConcurrentMap<String, Pattern> P_REMOVE_SELF_BLANKS = new ConcurrentHashMap<>();



  
  private final Map<String, List<String>> vAllowed;


  
/*  58 */   private final Map<String, Integer> vTagCounts = new HashMap<>();


  
  private final String[] vSelfClosingTags;


  
  private final String[] vNeedClosingTags;


  
  private final String[] vDisallowed;


  
  private final String[] vProtocolAtts;


  
  private final String[] vAllowedProtocols;


  
  private final String[] vRemoveBlanks;


  
  private final String[] vAllowedEntities;


  
  private final boolean stripComment;


  
  private final boolean encodeQuotes;


  
  private final boolean alwaysMakeTags;


  
  public HTMLFilter() {
/* 103 */     this.vAllowed = new HashMap<>();
    
/* 105 */     ArrayList<String> a_atts = new ArrayList<>();
/* 106 */     a_atts.add("href");
/* 107 */     a_atts.add("target");
/* 108 */     this.vAllowed.put("a", a_atts);
    
/* 110 */     ArrayList<String> img_atts = new ArrayList<>();
/* 111 */     img_atts.add("src");
/* 112 */     img_atts.add("width");
/* 113 */     img_atts.add("height");
/* 114 */     img_atts.add("alt");
/* 115 */     this.vAllowed.put("img", img_atts);
    
/* 117 */     ArrayList<String> no_atts = new ArrayList<>();
/* 118 */     this.vAllowed.put("b", no_atts);
/* 119 */     this.vAllowed.put("strong", no_atts);
/* 120 */     this.vAllowed.put("i", no_atts);
/* 121 */     this.vAllowed.put("em", no_atts);
    
/* 123 */     this.vSelfClosingTags = new String[] { "img" };
/* 124 */     this.vNeedClosingTags = new String[] { "a", "b", "strong", "i", "em" };
/* 125 */     this.vDisallowed = new String[0];
/* 126 */     this.vAllowedProtocols = new String[] { "http", "mailto", "https" };
/* 127 */     this.vProtocolAtts = new String[] { "src", "href" };
/* 128 */     this.vRemoveBlanks = new String[] { "a", "b", "strong", "i", "em" };
/* 129 */     this.vAllowedEntities = new String[] { "amp", "gt", "lt", "quot" };
/* 130 */     this.stripComment = true;
/* 131 */     this.encodeQuotes = true;
/* 132 */     this.alwaysMakeTags = false;
  }







  
  public HTMLFilter(Map<String, Object> conf) {
/* 143 */     assert conf.containsKey("vAllowed") : "configuration requires vAllowed";
/* 144 */     assert conf.containsKey("vSelfClosingTags") : "configuration requires vSelfClosingTags";
/* 145 */     assert conf.containsKey("vNeedClosingTags") : "configuration requires vNeedClosingTags";
/* 146 */     assert conf.containsKey("vDisallowed") : "configuration requires vDisallowed";
/* 147 */     assert conf.containsKey("vAllowedProtocols") : "configuration requires vAllowedProtocols";
/* 148 */     assert conf.containsKey("vProtocolAtts") : "configuration requires vProtocolAtts";
/* 149 */     assert conf.containsKey("vRemoveBlanks") : "configuration requires vRemoveBlanks";
/* 150 */     assert conf.containsKey("vAllowedEntities") : "configuration requires vAllowedEntities";
    
/* 152 */     this.vAllowed = Collections.unmodifiableMap((HashMap)conf.get("vAllowed"));
/* 153 */     this.vSelfClosingTags = (String[])conf.get("vSelfClosingTags");
/* 154 */     this.vNeedClosingTags = (String[])conf.get("vNeedClosingTags");
/* 155 */     this.vDisallowed = (String[])conf.get("vDisallowed");
/* 156 */     this.vAllowedProtocols = (String[])conf.get("vAllowedProtocols");
/* 157 */     this.vProtocolAtts = (String[])conf.get("vProtocolAtts");
/* 158 */     this.vRemoveBlanks = (String[])conf.get("vRemoveBlanks");
/* 159 */     this.vAllowedEntities = (String[])conf.get("vAllowedEntities");
/* 160 */     this.stripComment = conf.containsKey("stripComment") ? ((Boolean)conf.get("stripComment")).booleanValue() : true;
/* 161 */     this.encodeQuotes = conf.containsKey("encodeQuotes") ? ((Boolean)conf.get("encodeQuotes")).booleanValue() : true;
/* 162 */     this.alwaysMakeTags = conf.containsKey("alwaysMakeTags") ? ((Boolean)conf.get("alwaysMakeTags")).booleanValue() : true;
  }
  
  private void reset() {
/* 166 */     this.vTagCounts.clear();
  }


  
  public static String chr(int decimal) {
/* 172 */     return String.valueOf((char)decimal);
  }
  
  public static String htmlSpecialChars(String s) {
/* 176 */     String result = s;
/* 177 */     result = regexReplace(P_AMP, "&amp;", result);
/* 178 */     result = regexReplace(P_QUOTE, "&quot;", result);
/* 179 */     result = regexReplace(P_LEFT_ARROW, "&lt;", result);
/* 180 */     result = regexReplace(P_RIGHT_ARROW, "&gt;", result);
/* 181 */     return result;
  }








  
  public String filter(String input) {
/* 193 */     reset();
/* 194 */     String s = input;
    
/* 196 */     s = escapeComments(s);
    
/* 198 */     s = balanceHTML(s);
    
/* 200 */     s = checkTags(s);
    
/* 202 */     s = processRemoveBlanks(s);


    
/* 206 */     return s;
  }
  
  public boolean isAlwaysMakeTags() {
/* 210 */     return this.alwaysMakeTags;
  }
  
  public boolean isStripComments() {
/* 214 */     return this.stripComment;
  }
  
  private String escapeComments(String s) {
/* 218 */     Matcher m = P_COMMENTS.matcher(s);
/* 219 */     StringBuffer buf = new StringBuffer();
/* 220 */     if (m.find()) {
/* 221 */       String match = m.group(1);
/* 222 */       m.appendReplacement(buf, Matcher.quoteReplacement("<!--" + htmlSpecialChars(match) + "-->"));
    } 
/* 224 */     m.appendTail(buf);
    
/* 226 */     return buf.toString();
  }
  
  private String balanceHTML(String s) {
/* 230 */     if (this.alwaysMakeTags) {


      
/* 234 */       s = regexReplace(P_END_ARROW, "", s);
      
/* 236 */       s = regexReplace(P_BODY_TO_END, "<$1>", s);
/* 237 */       s = regexReplace(P_XML_CONTENT, "$1<$2", s);
    
    }
    else {

      
/* 243 */       s = regexReplace(P_STRAY_LEFT_ARROW, "&lt;$1", s);
/* 244 */       s = regexReplace(P_STRAY_RIGHT_ARROW, "$1$2&gt;<", s);





      
/* 251 */       s = regexReplace(P_BOTH_ARROWS, "", s);
    } 
    
/* 254 */     return s;
  }
  
  private String checkTags(String s) {
/* 258 */     Matcher m = P_TAGS.matcher(s);
    
/* 260 */     StringBuffer buf = new StringBuffer();
/* 261 */     while (m.find()) {
/* 262 */       String replaceStr = m.group(1);
/* 263 */       replaceStr = processTag(replaceStr);
/* 264 */       m.appendReplacement(buf, Matcher.quoteReplacement(replaceStr));
    } 
/* 266 */     m.appendTail(buf);


    
/* 270 */     StringBuilder sBuilder = new StringBuilder(buf.toString());
/* 271 */     for (String key : this.vTagCounts.keySet()) {
/* 272 */       for (int ii = 0; ii < ((Integer)this.vTagCounts.get(key)).intValue(); ii++) {
/* 273 */         sBuilder.append("</").append(key).append(">");
      }
    } 
/* 276 */     s = sBuilder.toString();
    
/* 278 */     return s;
  }
  
  private String processRemoveBlanks(String s) {
/* 282 */     String result = s;
/* 283 */     for (String tag : this.vRemoveBlanks) {
/* 284 */       if (!P_REMOVE_PAIR_BLANKS.containsKey(tag)) {
/* 285 */         P_REMOVE_PAIR_BLANKS.putIfAbsent(tag, Pattern.compile("<" + tag + "(\\s[^>]*)?></" + tag + ">"));
      }
/* 287 */       result = regexReplace(P_REMOVE_PAIR_BLANKS.get(tag), "", result);
/* 288 */       if (!P_REMOVE_SELF_BLANKS.containsKey(tag)) {
/* 289 */         P_REMOVE_SELF_BLANKS.putIfAbsent(tag, Pattern.compile("<" + tag + "(\\s[^>]*)?/>"));
      }
/* 291 */       result = regexReplace(P_REMOVE_SELF_BLANKS.get(tag), "", result);
    } 
    
/* 294 */     return result;
  }
  
  private static String regexReplace(Pattern regex_pattern, String replacement, String s) {
/* 298 */     Matcher m = regex_pattern.matcher(s);
/* 299 */     return m.replaceAll(replacement);
  }

  
  private String processTag(String s) {
/* 304 */     Matcher m = P_END_TAG.matcher(s);
/* 305 */     if (m.find()) {
/* 306 */       String name = m.group(1).toLowerCase();
/* 307 */       if (allowed(name) && 
/* 308 */         !inArray(name, this.vSelfClosingTags) && 
/* 309 */         this.vTagCounts.containsKey(name)) {
/* 310 */         this.vTagCounts.put(name, Integer.valueOf(((Integer)this.vTagCounts.get(name)).intValue() - 1));
/* 311 */         return "</" + name + ">";
      } 
    } 



    
/* 318 */     m = P_START_TAG.matcher(s);
/* 319 */     if (m.find()) {
/* 320 */       String name = m.group(1).toLowerCase();
/* 321 */       String body = m.group(2);
/* 322 */       String ending = m.group(3);

      
/* 325 */       if (allowed(name)) {
/* 326 */         StringBuilder params = new StringBuilder();
        
/* 328 */         Matcher m2 = P_QUOTED_ATTRIBUTES.matcher(body);
/* 329 */         Matcher m3 = P_UNQUOTED_ATTRIBUTES.matcher(body);
/* 330 */         List<String> paramNames = new ArrayList<>();
/* 331 */         List<String> paramValues = new ArrayList<>();
/* 332 */         while (m2.find()) {
/* 333 */           paramNames.add(m2.group(1));
/* 334 */           paramValues.add(m2.group(3));
        } 
/* 336 */         while (m3.find()) {
/* 337 */           paramNames.add(m3.group(1));
/* 338 */           paramValues.add(m3.group(3));
        } 

        
/* 342 */         for (int ii = 0; ii < paramNames.size(); ii++) {
/* 343 */           String paramName = ((String)paramNames.get(ii)).toLowerCase();
/* 344 */           String paramValue = paramValues.get(ii);




          
/* 350 */           if (allowedAttribute(name, paramName)) {
/* 351 */             if (inArray(paramName, this.vProtocolAtts)) {
/* 352 */               paramValue = processParamProtocol(paramValue);
            }
/* 354 */             params.append(' ').append(paramName).append("=\\\"").append(paramValue).append("\"");
          } 
        } 
        
/* 358 */         if (inArray(name, this.vSelfClosingTags)) {
/* 359 */           ending = " /";
        }
        
/* 362 */         if (inArray(name, this.vNeedClosingTags)) {
/* 363 */           ending = "";
        }
        
/* 366 */         if (ending == null || ending.length() < 1) {
/* 367 */           if (this.vTagCounts.containsKey(name)) {
/* 368 */             this.vTagCounts.put(name, Integer.valueOf(((Integer)this.vTagCounts.get(name)).intValue() + 1));
          } else {
/* 370 */             this.vTagCounts.put(name, Integer.valueOf(1));
          } 
        } else {
/* 373 */           ending = " /";
        } 
/* 375 */         return "<" + name + params + ending + ">";
      } 
/* 377 */       return "";
    } 


    
/* 382 */     m = P_COMMENT.matcher(s);
/* 383 */     if (!this.stripComment && m.find()) {
/* 384 */       return "<" + m.group() + ">";
    }
    
/* 387 */     return "";
  }
  
  private String processParamProtocol(String s) {
/* 391 */     s = decodeEntities(s);
/* 392 */     Matcher m = P_PROTOCOL.matcher(s);
/* 393 */     if (m.find()) {
/* 394 */       String protocol = m.group(1);
/* 395 */       if (!inArray(protocol, this.vAllowedProtocols)) {
        
/* 397 */         s = "#" + s.substring(protocol.length() + 1);
/* 398 */         if (s.startsWith("#//")) {
/* 399 */           s = "#" + s.substring(3);
        }
      } 
    } 
    
/* 404 */     return s;
  }
  
  private String decodeEntities(String s) {
/* 408 */     StringBuffer buf = new StringBuffer();
    
/* 410 */     Matcher m = P_ENTITY.matcher(s);
/* 411 */     while (m.find()) {
/* 412 */       String match = m.group(1);
/* 413 */       int decimal = Integer.decode(match).intValue();
/* 414 */       m.appendReplacement(buf, Matcher.quoteReplacement(chr(decimal)));
    } 
/* 416 */     m.appendTail(buf);
/* 417 */     s = buf.toString();
    
/* 419 */     buf = new StringBuffer();
/* 420 */     m = P_ENTITY_UNICODE.matcher(s);
/* 421 */     while (m.find()) {
/* 422 */       String match = m.group(1);
/* 423 */       int decimal = Integer.valueOf(match, 16).intValue();
/* 424 */       m.appendReplacement(buf, Matcher.quoteReplacement(chr(decimal)));
    } 
/* 426 */     m.appendTail(buf);
/* 427 */     s = buf.toString();
    
/* 429 */     buf = new StringBuffer();
/* 430 */     m = P_ENCODE.matcher(s);
/* 431 */     while (m.find()) {
/* 432 */       String match = m.group(1);
/* 433 */       int decimal = Integer.valueOf(match, 16).intValue();
/* 434 */       m.appendReplacement(buf, Matcher.quoteReplacement(chr(decimal)));
    } 
/* 436 */     m.appendTail(buf);
/* 437 */     s = buf.toString();
    
/* 439 */     s = validateEntities(s);
/* 440 */     return s;
  }
  
  private String validateEntities(String s) {
/* 444 */     StringBuffer buf = new StringBuffer();

    
/* 447 */     Matcher m = P_VALID_ENTITIES.matcher(s);
/* 448 */     while (m.find()) {
/* 449 */       String one = m.group(1);
/* 450 */       String two = m.group(2);
/* 451 */       m.appendReplacement(buf, Matcher.quoteReplacement(checkEntity(one, two)));
    } 
/* 453 */     m.appendTail(buf);
    
/* 455 */     return encodeQuotes(buf.toString());
  }
  
  private String encodeQuotes(String s) {
/* 459 */     if (this.encodeQuotes) {
/* 460 */       StringBuffer buf = new StringBuffer();
/* 461 */       Matcher m = P_VALID_QUOTES.matcher(s);
/* 462 */       while (m.find()) {
/* 463 */         String one = m.group(1);
/* 464 */         String two = m.group(2);
/* 465 */         String three = m.group(3);
        
/* 467 */         m.appendReplacement(buf, Matcher.quoteReplacement(one + two + three));
      } 
/* 469 */       m.appendTail(buf);
/* 470 */       return buf.toString();
    } 
/* 472 */     return s;
  }


  
  private String checkEntity(String preamble, String term) {
/* 478 */     return (";".equals(term) && isValidEntity(preamble)) ? ('&' + preamble) : ("&amp;" + preamble);
  }
  
  private boolean isValidEntity(String entity) {
/* 482 */     return inArray(entity, this.vAllowedEntities);
  }
  
  private static boolean inArray(String s, String[] array) {
/* 486 */     for (String item : array) {
/* 487 */       if (item != null && item.equals(s)) {
/* 488 */         return true;
      }
    } 
/* 491 */     return false;
  }
  
  private boolean allowed(String name) {
/* 495 */     return ((this.vAllowed.isEmpty() || this.vAllowed.containsKey(name)) && !inArray(name, this.vDisallowed));
  }
  
  private boolean allowedAttribute(String name, String paramName) {
/* 499 */     return (allowed(name) && (this.vAllowed.isEmpty() || ((List)this.vAllowed.get(name)).contains(paramName)));
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\HTMLFilter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */