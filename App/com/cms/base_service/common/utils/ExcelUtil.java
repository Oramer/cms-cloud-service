/*      */ package com.cms.base_service.common.utils;
/*      */
/*      */
/*      */ import com.cms.base_service.common.model.RestResult;
/*      */ import com.cms.base_service.common.utils.Convert;
/*      */ import com.cms.base_service.common.utils.DateUtils;
/*      */ import com.cms.base_service.common.utils.DictUtils;
/*      */ import com.cms.base_service.common.utils.ReflectUtils;
/*      */ import com.cms.base_service.common.utils.StringUtils;
/*      */ import com.cms.base_service.common.utils.file.FileTypeUtils;
/*      */ import com.cms.base_service.common.utils.file.FileUtils;
/*      */ import com.cms.base_service.common.utils.file.ImageUtils;
/*      */ import com.cms.base_service.common.utils.poi.ExcelHandlerAdapter;
/*      */ import com.cms.base_service.exception.BusinessException;
/*      */ import com.cms.base_service.framework.aspectj.lang.annotation.Excel;
import com.cms.base_service.framework.aspectj.lang.annotation.Excels;
/*      */ import com.cms.base_service.framework.config.CmsConfig;
/*      */ import java.io.Closeable;
/*      */ import java.io.File;
/*      */ import java.io.FileOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.OutputStream;
/*      */ import java.lang.reflect.Field;
/*      */ import java.lang.reflect.Method;
/*      */ import java.math.BigDecimal;
/*      */ import java.text.DecimalFormat;
/*      */ import java.time.LocalDate;
/*      */ import java.time.LocalDateTime;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Arrays;
/*      */ import java.util.Comparator;
/*      */ import java.util.Date;
/*      */ import java.util.HashMap;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import java.util.UUID;
/*      */ import java.util.stream.Collectors;
/*      */ import javax.servlet.http.HttpServletResponse;
/*      */ import org.apache.commons.lang3.RegExUtils;
/*      */ import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
/*      */ import org.apache.poi.hssf.usermodel.HSSFPicture;
/*      */ import org.apache.poi.hssf.usermodel.HSSFPictureData;
/*      */ import org.apache.poi.hssf.usermodel.HSSFShape;
/*      */ import org.apache.poi.hssf.usermodel.HSSFSheet;
/*      */ import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/*      */ import org.apache.poi.ooxml.POIXMLDocumentPart;
/*      */ import org.apache.poi.ss.usermodel.BorderStyle;
/*      */ import org.apache.poi.ss.usermodel.Cell;
/*      */ import org.apache.poi.ss.usermodel.CellStyle;
/*      */ import org.apache.poi.ss.usermodel.CellType;
/*      */ import org.apache.poi.ss.usermodel.ClientAnchor;
/*      */ import org.apache.poi.ss.usermodel.DataValidation;
/*      */ import org.apache.poi.ss.usermodel.DataValidationConstraint;
/*      */ import org.apache.poi.ss.usermodel.DataValidationHelper;
/*      */ import org.apache.poi.ss.usermodel.DateUtil;
/*      */ import org.apache.poi.ss.usermodel.Drawing;
/*      */ import org.apache.poi.ss.usermodel.FillPatternType;
/*      */ import org.apache.poi.ss.usermodel.Font;
/*      */ import org.apache.poi.ss.usermodel.HorizontalAlignment;
/*      */ import org.apache.poi.ss.usermodel.IndexedColors;
/*      */ import org.apache.poi.ss.usermodel.PictureData;
/*      */ import org.apache.poi.ss.usermodel.Row;
/*      */ import org.apache.poi.ss.usermodel.Sheet;
/*      */ import org.apache.poi.ss.usermodel.VerticalAlignment;
/*      */ import org.apache.poi.ss.usermodel.Workbook;
/*      */ import org.apache.poi.ss.usermodel.WorkbookFactory;
/*      */ import org.apache.poi.ss.util.CellRangeAddress;
/*      */ import org.apache.poi.ss.util.CellRangeAddressList;
/*      */ import org.apache.poi.util.IOUtils;
/*      */ import org.apache.poi.xssf.streaming.SXSSFWorkbook;
/*      */ import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
/*      */ import org.apache.poi.xssf.usermodel.XSSFDrawing;
/*      */ import org.apache.poi.xssf.usermodel.XSSFPicture;
/*      */ import org.apache.poi.xssf.usermodel.XSSFShape;
/*      */ import org.apache.poi.xssf.usermodel.XSSFSheet;
/*      */ import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/*      */ import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;
/*      */ import org.slf4j.Logger;
/*      */ import org.slf4j.LoggerFactory;
/*      */
/*      */
/*      */ public class ExcelUtil<T>
/*      */ {
/*   86 */   private static final Logger log = LoggerFactory.getLogger(com.cms.base_service.common.utils.ExcelUtil.class);
/*      */
/*      */   public static final String FORMULA_REGEX_STR = "=|-|\\+|@";
/*      */
/*   90 */   public static final String[] FORMULA_STR = new String[] { "=", "-", "+", "@" };
/*      */
/*      */
/*      */
/*      */
/*      */   public static final int sheetSize = 65536;
/*      */
/*      */
/*      */
/*      */
/*      */   private String sheetName;
/*      */
/*      */
/*      */
/*      */
/*      */   private Excel.Type type;
/*      */
/*      */
/*      */
/*      */
/*      */   private Workbook wb;
/*      */
/*      */
/*      */
/*      */
/*      */   private Sheet sheet;
/*      */
/*      */
/*      */
/*      */
/*      */   private Map<String, CellStyle> styles;
/*      */
/*      */
/*      */
/*      */
/*      */   private List<T> list;
/*      */
/*      */
/*      */
/*      */
/*      */   private List<Object[]> fields;
/*      */
/*      */
/*      */
/*      */
/*      */   private int rownum;
/*      */
/*      */
/*      */
/*      */
/*      */   private String title;
/*      */
/*      */
/*      */
/*      */
/*      */   private short maxHeight;
/*      */
/*      */
/*      */
/*      */
/*  150 */   private Map<Integer, Double> statistics = new HashMap<>();
/*      */
/*      */
/*      */
/*      */
/*  155 */   private static final DecimalFormat DOUBLE_FORMAT = new DecimalFormat("######0.00");
/*      */
/*      */
/*      */   public Class<T> clazz;
/*      */
/*      */
/*      */
/*      */   public ExcelUtil(Class<T> clazz) {
/*  163 */     this.clazz = clazz;
/*      */   }
/*      */
/*      */   public void init(List<T> list, String sheetName, String title, Excel.Type type) {
/*  167 */     if (list == null) {
/*  168 */       list = new ArrayList<>();
/*      */     }
/*  170 */     this.list = list;
/*  171 */     this.sheetName = sheetName;
/*  172 */     this.type = type;
/*  173 */     this.title = title;
/*  174 */     createExcelField();
/*  175 */     createWorkbook();
/*  176 */     createTitle();
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public void createTitle() {
/*  183 */     if (StringUtils.isNotEmpty(this.title)) {
/*  184 */       Row titleRow = this.sheet.createRow((this.rownum == 0) ? this.rownum++ : 0);
/*  185 */       titleRow.setHeightInPoints(30.0F);
/*  186 */       Cell titleCell = titleRow.createCell(0);
/*  187 */       titleCell.setCellStyle(this.styles.get("title"));
/*  188 */       titleCell.setCellValue(this.title);
/*  189 */       this.sheet.addMergedRegion(new CellRangeAddress(titleRow.getRowNum(), titleRow.getRowNum(), titleRow.getRowNum(), this.fields
/*  190 */             .size() - 1));
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public List<T> importExcel(InputStream is) throws Exception {
/*  201 */     return importExcel(is, 0);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public List<T> importExcel(InputStream is, int titleNum) throws Exception {
/*  212 */     return importExcel("", is, titleNum);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public List<T> importExcel(String sheetName, InputStream is, int titleNum) throws Exception {
/*      */     Map<String, PictureData> pictures;
/*  224 */     this.type = Excel.Type.IMPORT;
/*  225 */     this.wb = WorkbookFactory.create(is);
/*  226 */     List<T> list = new ArrayList<>();
/*      */
/*  228 */     Sheet sheet = StringUtils.isNotEmpty(sheetName) ? this.wb.getSheet(sheetName) : this.wb.getSheetAt(0);
/*  229 */     if (sheet == null) {
/*  230 */       throw new IOException("文件sheet不存在");
/*      */     }
/*  232 */     boolean isXSSFWorkbook = !(this.wb instanceof HSSFWorkbook);
/*      */
/*  234 */     if (isXSSFWorkbook) {
/*  235 */       pictures = getSheetPictures07((XSSFSheet)sheet, (XSSFWorkbook)this.wb);
/*      */     } else {
/*  237 */       pictures = getSheetPictures03((HSSFSheet)sheet, (HSSFWorkbook)this.wb);
/*      */     }
/*      */
/*  240 */     int rows = sheet.getLastRowNum();
/*      */
/*  242 */     if (rows > 0) {
/*      */
/*  244 */       Map<String, Integer> cellMap = new HashMap<>();
/*      */
/*  246 */       Row heard = sheet.getRow(titleNum);
/*  247 */       for (int i = 0; i < heard.getPhysicalNumberOfCells(); i++) {
/*  248 */         Cell cell = heard.getCell(i);
/*  249 */         if (StringUtils.isNotNull(cell)) {
/*  250 */           String value = getCellValue(heard, i).toString();
/*  251 */           cellMap.put(value, Integer.valueOf(i));
/*      */         } else {
/*  253 */           cellMap.put(null, Integer.valueOf(i));
/*      */         }
/*      */       }
/*      */
/*  257 */       List<Object[]> fields = getFields();
/*  258 */       Map<Integer, Object[]> fieldsMap = (Map)new HashMap<>();
/*  259 */       for (Object[] objects : fields) {
/*  260 */         Excel attr = (Excel)objects[1];
/*  261 */         Integer column = cellMap.get(attr.name());
/*  262 */         if (column != null) {
/*  263 */           fieldsMap.put(column, objects);
/*      */         }
/*      */       }
/*  266 */       for (int j = titleNum + 1; j <= rows; j++) {
/*      */
/*  268 */         Row row = sheet.getRow(j);
/*      */
/*  270 */         if (!isRowEmpty(row)) {
/*      */
/*      */
/*  273 */           T entity = null;
/*  274 */           for (Map.Entry<Integer, Object[]> entry : fieldsMap.entrySet()) {
/*  275 */             Object val = getCellValue(row, ((Integer)entry.getKey()).intValue());
/*      */
/*      */
/*  278 */             entity = (entity == null) ? this.clazz.newInstance() : entity;
/*      */
/*  280 */             Field field = (Field)((Object[])entry.getValue())[0];
/*  281 */             Excel attr = (Excel)((Object[])entry.getValue())[1];
/*      */
/*  283 */             Class<?> fieldType = field.getType();
/*  284 */             if (String.class == fieldType) {
/*  285 */               String s = Convert.toStr(val);
/*  286 */               if (StringUtils.endsWith(s, ".0")) {
/*  287 */                 val = StringUtils.substringBefore(s, ".0");
/*      */               } else {
/*  289 */                 String dateFormat = ((Excel)field.<Excel>getAnnotation(Excel.class)).dateFormat();
/*  290 */                 if (StringUtils.isNotEmpty(dateFormat)) {
/*  291 */                   val = parseDateToStr(dateFormat, val);
/*      */                 } else {
/*  293 */                   val = Convert.toStr(val);
/*      */                 }
/*      */               }
/*  296 */             } else if ((int.class == fieldType || Integer.class == fieldType) && StringUtils.isNumeric(Convert.toStr(val))) {
/*  297 */               val = Convert.toInt(val);
/*  298 */             } else if ((long.class == fieldType || Long.class == fieldType) && StringUtils.isNumeric(Convert.toStr(val))) {
/*  299 */               val = Convert.toLong(val);
/*  300 */             } else if (double.class == fieldType || Double.class == fieldType) {
/*  301 */               val = Convert.toDouble(val);
/*  302 */             } else if (float.class == fieldType || Float.class == fieldType) {
/*  303 */               val = Convert.toFloat(val);
/*  304 */             } else if (BigDecimal.class == fieldType) {
/*  305 */               val = Convert.toBigDecimal(val);
/*  306 */             } else if (Date.class == fieldType) {
/*  307 */               if (val instanceof String) {
/*  308 */                 val = DateUtils.parseDate(val);
/*  309 */               } else if (val instanceof Double) {
/*  310 */                 val = DateUtil.getJavaDate(((Double)val).doubleValue());
/*      */               }
/*  312 */             } else if (boolean.class == fieldType || Boolean.class == fieldType) {
/*  313 */               val = Convert.toBool(val, Boolean.valueOf(false));
/*      */             }
/*  315 */             if (StringUtils.isNotNull(fieldType)) {
/*  316 */               String propertyName = field.getName();
/*  317 */               if (StringUtils.isNotEmpty(attr.targetAttr())) {
/*  318 */                 propertyName = field.getName() + "." + attr.targetAttr();
/*  319 */               } else if (StringUtils.isNotEmpty(attr.readConverterExp())) {
/*  320 */                 val = reverseByExp(Convert.toStr(val), attr.readConverterExp(), attr.separator());
/*  321 */               } else if (StringUtils.isNotEmpty(attr.dictType())) {
/*  322 */                 val = reverseDictByExp(Convert.toStr(val), attr.dictType(), attr.separator());
/*  323 */               } else if (!attr.handler().equals(ExcelHandlerAdapter.class)) {
/*  324 */                 val = dataFormatHandlerAdapter(val, attr);
/*  325 */               } else if (Excel.ColumnType.IMAGE == attr.cellType() && StringUtils.isNotEmpty(pictures)) {
/*  326 */                 PictureData image = pictures.get(row.getRowNum() + "_" + entry.getKey());
/*  327 */                 if (image == null) {
/*  328 */                   val = "";
/*      */                 } else {
/*  330 */                   byte[] data = image.getData();
/*  331 */                   val = FileUtils.writeImportBytes(data);
/*      */                 }
/*      */               }
/*  334 */               ReflectUtils.invokeSetter(entity, propertyName, val);
/*      */             }
/*      */           }
/*  337 */           list.add(entity);
/*      */         }
/*      */       }
/*  340 */     }  return list;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public RestResult exportExcel(List<T> list, String sheetName) {
/*  351 */     return exportExcel(list, sheetName, "");
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public RestResult exportExcel(List<T> list, String sheetName, String title) {
/*  363 */     init(list, sheetName, title, Excel.Type.EXPORT);
/*  364 */     return exportExcel();
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void exportExcel(HttpServletResponse response, List<T> list, String sheetName) {
/*  376 */     exportExcel(response, list, sheetName, "");
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void exportExcel(HttpServletResponse response, List<T> list, String sheetName, String title) {
/*  389 */     response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
/*  390 */     response.setCharacterEncoding("utf-8");
/*  391 */     init(list, sheetName, title, Excel.Type.EXPORT);
/*  392 */     exportExcel(response);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public RestResult importTemplateExcel(String sheetName) {
/*  402 */     return importTemplateExcel(sheetName, "");
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public RestResult importTemplateExcel(String sheetName, String title) {
/*  413 */     init(null, sheetName, title, Excel.Type.IMPORT);
/*  414 */     return exportExcel();
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void importTemplateExcel(HttpServletResponse response, String sheetName) {
/*  424 */     importTemplateExcel(response, sheetName, "");
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void importTemplateExcel(HttpServletResponse response, String sheetName, String title) {
/*  435 */     response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
/*  436 */     response.setCharacterEncoding("utf-8");
/*  437 */     init(null, sheetName, title, Excel.Type.IMPORT);
/*  438 */     exportExcel(response);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void exportExcel(HttpServletResponse response) {
/*      */     try {
/*  448 */       writeSheet();
/*  449 */       this.wb.write((OutputStream)response.getOutputStream());
/*  450 */     } catch (Exception e) {
/*  451 */       log.error("导出Excel异常{}", e.getMessage());
/*      */     } finally {
/*  453 */       IOUtils.closeQuietly((Closeable)this.wb);
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public RestResult exportExcel() {
/*  463 */     OutputStream out = null;
/*      */     try {
/*  465 */       writeSheet();
/*  466 */       String filename = encodingFilename(this.sheetName);
/*  467 */       out = new FileOutputStream(getAbsoluteFile(filename));
/*  468 */       this.wb.write(out);
/*  469 */       return RestResult.ok(filename);
/*  470 */     } catch (Exception e) {
/*  471 */       log.error("导出Excel异常{}", e.getMessage());
/*  472 */       throw new BusinessException("导出Excel失败，请联系网站管理员！");
/*      */     } finally {
/*  474 */       IOUtils.closeQuietly((Closeable)this.wb);
/*  475 */       IOUtils.closeQuietly(out);
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void writeSheet() {
/*  484 */     int sheetNo = Math.max(1, (int)Math.ceil(this.list.size() * 1.0D / 65536.0D));
/*  485 */     for (int index = 0; index < sheetNo; index++) {
/*  486 */       createSheet(sheetNo, index);
/*      */
/*      */
/*  489 */       Row row = this.sheet.createRow(this.rownum);
/*  490 */       int column = 0;
/*      */
/*  492 */       for (Object[] os : this.fields) {
/*  493 */         Excel excel = (Excel)os[1];
/*  494 */         createCell(excel, row, column++);
/*      */       }
/*  496 */       if (Excel.Type.EXPORT.equals(this.type)) {
/*  497 */         fillExcelData(index, row);
/*  498 */         addStatisticsRow();
/*      */       }
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void fillExcelData(int index, Row row) {
/*  510 */     int startNo = index * 65536;
/*  511 */     int endNo = Math.min(startNo + 65536, this.list.size());
/*  512 */     for (int i = startNo; i < endNo; i++) {
/*  513 */       row = this.sheet.createRow(i + 1 + this.rownum - startNo);
/*      */
/*  515 */       T vo = this.list.get(i);
/*  516 */       int column = 0;
/*  517 */       for (Object[] os : this.fields) {
/*  518 */         Field field = (Field)os[0];
/*  519 */         Excel excel = (Excel)os[1];
/*  520 */         addCell(excel, row, vo, field, column++);
/*      */       }
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   private Map<String, CellStyle> createStyles(Workbook wb) {
/*  533 */     Map<String, CellStyle> styles = new HashMap<>();
/*  534 */     CellStyle style = wb.createCellStyle();
/*  535 */     style.setAlignment(HorizontalAlignment.CENTER);
/*  536 */     style.setVerticalAlignment(VerticalAlignment.CENTER);
/*  537 */     Font titleFont = wb.createFont();
/*  538 */     titleFont.setFontName("Arial");
/*  539 */     titleFont.setFontHeightInPoints((short)16);
/*  540 */     titleFont.setBold(true);
/*  541 */     style.setFont(titleFont);
/*  542 */     styles.put("title", style);
/*      */
/*  544 */     style = wb.createCellStyle();
/*  545 */     style.setAlignment(HorizontalAlignment.CENTER);
/*  546 */     style.setVerticalAlignment(VerticalAlignment.CENTER);
/*  547 */     style.setBorderRight(BorderStyle.THIN);
/*  548 */     style.setRightBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());
/*  549 */     style.setBorderLeft(BorderStyle.THIN);
/*  550 */     style.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());
/*  551 */     style.setBorderTop(BorderStyle.THIN);
/*  552 */     style.setTopBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());
/*  553 */     style.setBorderBottom(BorderStyle.THIN);
/*  554 */     style.setBottomBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());
/*  555 */     Font dataFont = wb.createFont();
/*  556 */     dataFont.setFontName("Arial");
/*  557 */     dataFont.setFontHeightInPoints((short)10);
/*  558 */     style.setFont(dataFont);
/*  559 */     styles.put("data", style);
/*      */
/*  561 */     style = wb.createCellStyle();
/*  562 */     style.cloneStyleFrom(styles.get("data"));
/*  563 */     style.setAlignment(HorizontalAlignment.CENTER);
/*  564 */     style.setVerticalAlignment(VerticalAlignment.CENTER);
/*  565 */     style.setFillForegroundColor(IndexedColors.GREY_50_PERCENT.getIndex());
/*  566 */     style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
/*  567 */     Font headerFont = wb.createFont();
/*  568 */     headerFont.setFontName("Arial");
/*  569 */     headerFont.setFontHeightInPoints((short)10);
/*  570 */     headerFont.setBold(true);
/*  571 */     headerFont.setColor(IndexedColors.WHITE.getIndex());
/*  572 */     style.setFont(headerFont);
/*  573 */     styles.put("header", style);
/*      */
/*  575 */     style = wb.createCellStyle();
/*  576 */     style.setAlignment(HorizontalAlignment.CENTER);
/*  577 */     style.setVerticalAlignment(VerticalAlignment.CENTER);
/*  578 */     Font totalFont = wb.createFont();
/*  579 */     totalFont.setFontName("Arial");
/*  580 */     totalFont.setFontHeightInPoints((short)10);
/*  581 */     style.setFont(totalFont);
/*  582 */     styles.put("total", style);
/*      */
/*  584 */     styles.putAll(annotationStyles(wb));
/*      */
/*  586 */     return styles;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   private Map<String, CellStyle> annotationStyles(Workbook wb) {
/*  596 */     Map<String, CellStyle> styles = new HashMap<>();
/*  597 */     for (Object[] os : this.fields) {
/*  598 */       Excel excel = (Excel)os[1];
/*  599 */       String key = "data_" + excel.align() + "_" + excel.color();
/*  600 */       if (!styles.containsKey(key)) {
/*  601 */         CellStyle style = wb.createCellStyle();
/*  602 */         style = wb.createCellStyle();
/*  603 */         style.setAlignment(excel.align());
/*  604 */         style.setVerticalAlignment(VerticalAlignment.CENTER);
/*  605 */         style.setBorderRight(BorderStyle.THIN);
/*  606 */         style.setRightBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());
/*  607 */         style.setBorderLeft(BorderStyle.THIN);
/*  608 */         style.setLeftBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());
/*  609 */         style.setBorderTop(BorderStyle.THIN);
/*  610 */         style.setTopBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());
/*  611 */         style.setBorderBottom(BorderStyle.THIN);
/*  612 */         style.setBottomBorderColor(IndexedColors.GREY_50_PERCENT.getIndex());
/*  613 */         Font dataFont = wb.createFont();
/*  614 */         dataFont.setFontName("Arial");
/*  615 */         dataFont.setFontHeightInPoints((short)10);
/*  616 */         dataFont.setColor((excel.color()).index);
/*  617 */         style.setFont(dataFont);
/*  618 */         styles.put(key, style);
/*      */       }
/*      */     }
/*  621 */     return styles;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public Cell createCell(Excel attr, Row row, int column) {
/*  629 */     Cell cell = row.createCell(column);
/*      */
/*  631 */     cell.setCellValue(attr.name());
/*  632 */     setDataValidation(attr, row, column);
/*  633 */     cell.setCellStyle(this.styles.get("header"));
/*  634 */     return cell;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void setCellVo(Object value, Excel attr, Cell cell) {
/*  645 */     if (Excel.ColumnType.STRING == attr.cellType()) {
/*  646 */       String cellValue = Convert.toStr(value);
/*      */
/*  648 */       if (StringUtils.startsWithAny(cellValue, (CharSequence[])FORMULA_STR)) {
/*  649 */         cellValue = RegExUtils.replaceFirst(cellValue, "=|-|\\+|@", "\t$0");
/*      */       }
/*  651 */       cell.setCellValue(StringUtils.isNull(cellValue) ? attr.defaultValue() : (cellValue + attr.suffix()));
/*  652 */     } else if (Excel.ColumnType.NUMERIC == attr.cellType()) {
/*  653 */       if (StringUtils.isNotNull(value)) {
/*  654 */         cell.setCellValue(StringUtils.contains(Convert.toStr(value), ".") ? Convert.toDouble(value).doubleValue() : Convert.toInt(value).intValue());
/*      */       }
/*  656 */     } else if (Excel.ColumnType.IMAGE == attr.cellType()) {
/*  657 */       XSSFClientAnchor xSSFClientAnchor = new XSSFClientAnchor(0, 0, 0, 0, (short)cell.getColumnIndex(), cell.getRow().getRowNum(), (short)(cell.getColumnIndex() + 1), cell.getRow().getRowNum() + 1);
/*  658 */       String imagePath = Convert.toStr(value);
/*  659 */       if (StringUtils.isNotEmpty(imagePath)) {
/*  660 */         byte[] data = ImageUtils.getImage(imagePath);
/*  661 */         getDrawingPatriarch(cell.getSheet()).createPicture((ClientAnchor)xSSFClientAnchor, cell
/*  662 */             .getSheet().getWorkbook().addPicture(data, getImageType(data)));
/*      */       }
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public static Drawing<?> getDrawingPatriarch(Sheet sheet) {
/*  671 */     if (sheet.getDrawingPatriarch() == null) {
/*  672 */       sheet.createDrawingPatriarch();
/*      */     }
/*  674 */     return sheet.getDrawingPatriarch();
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public int getImageType(byte[] value) {
/*  681 */     String type = FileTypeUtils.getFileExtendName(value);
/*  682 */     if ("JPG".equalsIgnoreCase(type))
/*  683 */       return 5;
/*  684 */     if ("PNG".equalsIgnoreCase(type)) {
/*  685 */       return 6;
/*      */     }
/*  687 */     return 5;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public void setDataValidation(Excel attr, Row row, int column) {
/*  694 */     if (attr.name().indexOf("注：") >= 0) {
/*  695 */       this.sheet.setColumnWidth(column, 6000);
/*      */     } else {
/*      */
/*  698 */       this.sheet.setColumnWidth(column, (int)((attr.width() + 0.72D) * 256.0D));
/*      */     }
/*  700 */     if (StringUtils.isNotEmpty(attr.prompt()) || (attr.combo()).length > 0)
/*      */     {
/*  702 */       setPromptOrValidation(this.sheet, attr.combo(), attr.prompt(), 1, 100, column, column);
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public Cell addCell(Excel attr, Row row, T vo, Field field, int column) {
/*  710 */     Cell cell = null;
/*      */
/*      */     try {
/*  713 */       row.setHeight(this.maxHeight);
/*      */
/*  715 */       if (attr.isExport()) {
/*      */
/*  717 */         cell = row.createCell(column);
/*  718 */         cell.setCellStyle(this.styles.get("data_" + attr.align() + "_" + attr.color()));
/*      */
/*      */
/*  721 */         Object value = getTargetValue(vo, field, attr);
/*  722 */         String dateFormat = attr.dateFormat();
/*  723 */         String readConverterExp = attr.readConverterExp();
/*  724 */         String separator = attr.separator();
/*  725 */         String dictType = attr.dictType();
/*  726 */         if (StringUtils.isNotEmpty(dateFormat) && StringUtils.isNotNull(value)) {
/*  727 */           cell.setCellValue(parseDateToStr(dateFormat, value));
/*  728 */         } else if (StringUtils.isNotEmpty(readConverterExp) && StringUtils.isNotNull(value)) {
/*  729 */           cell.setCellValue(convertByExp(Convert.toStr(value), readConverterExp, separator));
/*  730 */         } else if (StringUtils.isNotEmpty(dictType) && StringUtils.isNotNull(value)) {
/*  731 */           cell.setCellValue(convertDictByExp(Convert.toStr(value), dictType, separator));
/*  732 */         } else if (value instanceof BigDecimal && -1 != attr.scale()) {
/*  733 */           cell.setCellValue(((BigDecimal)value).setScale(attr.scale(), attr.roundingMode()).toString());
/*  734 */         } else if (!attr.handler().equals(ExcelHandlerAdapter.class)) {
/*  735 */           cell.setCellValue(dataFormatHandlerAdapter(value, attr));
/*      */         } else {
/*      */
/*  738 */           setCellVo(value, attr, cell);
/*      */         }
/*  740 */         addStatisticsData(Integer.valueOf(column), Convert.toStr(value), attr);
/*      */       }
/*  742 */     } catch (Exception e) {
/*  743 */       log.error("导出Excel失败{}", e);
/*      */     }
/*  745 */     return cell;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void setPromptOrValidation(Sheet sheet, String[] textlist, String promptContent, int firstRow, int endRow, int firstCol, int endCol) {
/*  761 */     DataValidationHelper helper = sheet.getDataValidationHelper();
/*  762 */     DataValidationConstraint constraint = (textlist.length > 0) ? helper.createExplicitListConstraint(textlist) : helper.createCustomConstraint("DD1");
/*  763 */     CellRangeAddressList regions = new CellRangeAddressList(firstRow, endRow, firstCol, endCol);
/*  764 */     DataValidation dataValidation = helper.createValidation(constraint, regions);
/*  765 */     if (StringUtils.isNotEmpty(promptContent)) {
/*      */
/*  767 */       dataValidation.createPromptBox("", promptContent);
/*  768 */       dataValidation.setShowPromptBox(true);
/*      */     }
/*      */
/*  771 */     if (dataValidation instanceof org.apache.poi.xssf.usermodel.XSSFDataValidation) {
/*  772 */       dataValidation.setSuppressDropDownArrow(true);
/*  773 */       dataValidation.setShowErrorBox(true);
/*      */     } else {
/*  775 */       dataValidation.setSuppressDropDownArrow(false);
/*      */     }
/*  777 */     sheet.addValidationData(dataValidation);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public static String convertByExp(String propertyValue, String converterExp, String separator) {
/*  789 */     StringBuilder propertyString = new StringBuilder();
/*  790 */     String[] convertSource = converterExp.split(",");
/*  791 */     for (String item : convertSource) {
/*  792 */       String[] itemArray = item.split("=");
/*  793 */       if (StringUtils.containsAny(separator, propertyValue)) {
/*  794 */         for (String value : propertyValue.split(separator)) {
/*  795 */           if (itemArray[0].equals(value)) {
/*  796 */             propertyString.append(itemArray[1] + separator);
/*      */
/*      */             break;
/*      */           }
/*      */         }
/*  801 */       } else if (itemArray[0].equals(propertyValue)) {
/*  802 */         return itemArray[1];
/*      */       }
/*      */     }
/*      */
/*  806 */     return StringUtils.stripEnd(propertyString.toString(), separator);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public static String reverseByExp(String propertyValue, String converterExp, String separator) {
/*  818 */     StringBuilder propertyString = new StringBuilder();
/*  819 */     String[] convertSource = converterExp.split(",");
/*  820 */     for (String item : convertSource) {
/*  821 */       String[] itemArray = item.split("=");
/*  822 */       if (StringUtils.containsAny(separator, propertyValue)) {
/*  823 */         for (String value : propertyValue.split(separator)) {
/*  824 */           if (itemArray[1].equals(value)) {
/*  825 */             propertyString.append(itemArray[0] + separator);
/*      */
/*      */             break;
/*      */           }
/*      */         }
/*  830 */       } else if (itemArray[1].equals(propertyValue)) {
/*  831 */         return itemArray[0];
/*      */       }
/*      */     }
/*      */
/*  835 */     return StringUtils.stripEnd(propertyString.toString(), separator);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public static String convertDictByExp(String dictValue, String dictType, String separator) {
/*  847 */     return DictUtils.getDictLabel(dictType, dictValue, separator);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public static String reverseDictByExp(String dictLabel, String dictType, String separator) {
/*  859 */     return DictUtils.getDictValue(dictType, dictLabel, separator);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public String dataFormatHandlerAdapter(Object value, Excel excel) {
/*      */     try {
/*  871 */       Object instance = excel.handler().newInstance();
/*  872 */       Method formatMethod = excel.handler().getMethod("format", new Class[] { Object.class, String[].class });
/*  873 */       value = formatMethod.invoke(instance, new Object[] { value, excel.args() });
/*  874 */     } catch (Exception e) {
/*  875 */       log.error("不能格式化数据 " + excel.handler(), e.getMessage());
/*      */     }
/*  877 */     return Convert.toStr(value);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   private void addStatisticsData(Integer index, String text, Excel entity) {
/*  884 */     if (entity != null && entity.isStatistics()) {
/*  885 */       Double temp = Double.valueOf(0.0D);
/*  886 */       if (!this.statistics.containsKey(index)) {
/*  887 */         this.statistics.put(index, temp);
/*      */       }
/*      */       try {
/*  890 */         temp = Double.valueOf(text);
/*  891 */       } catch (NumberFormatException numberFormatException) {}
/*      */
/*  893 */       this.statistics.put(index, Double.valueOf(((Double)this.statistics.get(index)).doubleValue() + temp.doubleValue()));
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public void addStatisticsRow() {
/*  901 */     if (this.statistics.size() > 0) {
/*  902 */       Row row = this.sheet.createRow(this.sheet.getLastRowNum() + 1);
/*  903 */       Set<Integer> keys = this.statistics.keySet();
/*  904 */       Cell cell = row.createCell(0);
/*  905 */       cell.setCellStyle(this.styles.get("total"));
/*  906 */       cell.setCellValue("合计");
/*      */
/*  908 */       for (Integer key : keys) {
/*  909 */         cell = row.createCell(key.intValue());
/*  910 */         cell.setCellStyle(this.styles.get("total"));
/*  911 */         cell.setCellValue(DOUBLE_FORMAT.format(this.statistics.get(key)));
/*      */       }
/*  913 */       this.statistics.clear();
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public String encodingFilename(String filename) {
/*  921 */     filename = UUID.randomUUID().toString() + "_" + filename + ".xlsx";
/*  922 */     return filename;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public String getAbsoluteFile(String filename) {
/*  931 */     String downloadPath = CmsConfig.getDownloadPath() + filename;
/*  932 */     File desc = new File(downloadPath);
/*  933 */     if (!desc.getParentFile().exists()) {
/*  934 */       desc.getParentFile().mkdirs();
/*      */     }
/*  936 */     return downloadPath;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   private Object getTargetValue(T vo, Field field, Excel excel) throws Exception {
/*  949 */     Object o = field.get(vo);
/*  950 */     if (StringUtils.isNotEmpty(excel.targetAttr())) {
/*  951 */       String target = excel.targetAttr();
/*  952 */       if (target.contains(".")) {
/*  953 */         String[] targets = target.split("[.]");
/*  954 */         for (String name : targets) {
/*  955 */           o = getValue(o, name);
/*      */         }
/*      */       } else {
/*  958 */         o = getValue(o, target);
/*      */       }
/*      */     }
/*  961 */     return o;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   private Object getValue(Object o, String name) throws Exception {
/*  973 */     if (StringUtils.isNotNull(o) && StringUtils.isNotEmpty(name)) {
/*  974 */       Class<?> clazz = o.getClass();
/*  975 */       Field field = clazz.getDeclaredField(name);
/*  976 */       field.setAccessible(true);
/*  977 */       o = field.get(o);
/*      */     }
/*  979 */     return o;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   private void createExcelField() {
/*  986 */     this.fields = getFields();
/*  987 */     this.fields = (List<Object[]>)this.fields.stream().sorted(Comparator.comparing(objects -> Integer.valueOf(((Excel)objects[1]).sort()))).collect(Collectors.toList());
/*  988 */     this.maxHeight = getRowHeight();
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public List<Object[]> getFields() {
/*  995 */     List<Object[]> fields = new ArrayList();
/*  996 */     List<Field> tempFields = new ArrayList<>();
/*  997 */     tempFields.addAll(Arrays.asList(this.clazz.getSuperclass().getDeclaredFields()));
/*  998 */     tempFields.addAll(Arrays.asList(this.clazz.getDeclaredFields()));
/*  999 */     for (Field field : tempFields) {
/*      */
/* 1001 */       if (field.isAnnotationPresent((Class)Excel.class)) {
/* 1002 */         Excel attr = field.<Excel>getAnnotation(Excel.class);
/* 1003 */         if (attr != null && (attr.type() == Excel.Type.ALL || attr.type() == this.type)) {
/* 1004 */           field.setAccessible(true);
/* 1005 */           fields.add(new Object[] { field, attr });
/*      */         }
/*      */       }
/*      */
/*      */
/* 1010 */       if (field.isAnnotationPresent((Class)Excels.class)) {
/* 1011 */         Excels attrs = field.<Excels>getAnnotation(Excels.class);
/* 1012 */         Excel[] excels = (Excel[])attrs.value();
/* 1013 */         for (Excel attr : excels) {
/* 1014 */           if (attr != null && (attr.type() == Excel.Type.ALL || attr.type() == this.type)) {
/* 1015 */             field.setAccessible(true);
/* 1016 */             fields.add(new Object[] { field, attr });
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 1021 */     return fields;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public short getRowHeight() {
/* 1028 */     double maxHeight = 0.0D;
/* 1029 */     for (Object[] os : this.fields) {
/* 1030 */       Excel excel = (Excel)os[1];
/* 1031 */       maxHeight = Math.max(maxHeight, excel.height());
/*      */     }
/* 1033 */     return (short)(int)(maxHeight * 20.0D);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */   public void createWorkbook() {
/* 1040 */     this.wb = (Workbook)new SXSSFWorkbook(500);
/* 1041 */     this.sheet = this.wb.createSheet();
/* 1042 */     this.wb.setSheetName(0, this.sheetName);
/* 1043 */     this.styles = createStyles(this.wb);
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public void createSheet(int sheetNo, int index) {
/* 1054 */     if (sheetNo > 1 && index > 0) {
/* 1055 */       this.sheet = this.wb.createSheet();
/* 1056 */       createTitle();
/* 1057 */       this.wb.setSheetName(index, this.sheetName + index);
/*      */     }
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public Object getCellValue(Row row, int column) {
/* 1069 */     if (row == null) {
/* 1070 */       return row;
/*      */     }
/* 1072 */     Object val = "";
/*      */     try {
/* 1074 */       Cell cell = row.getCell(column);
/* 1075 */       if (StringUtils.isNotNull(cell)) {
/* 1076 */         if (cell.getCellType() == CellType.NUMERIC || cell.getCellType() == CellType.FORMULA) {
/* 1077 */           val = Double.valueOf(cell.getNumericCellValue());
/* 1078 */           if (DateUtil.isCellDateFormatted(cell)) {
/* 1079 */             val = DateUtil.getJavaDate(((Double)val).doubleValue());
/*      */           }
/* 1081 */           else if (((Double)val).doubleValue() % 1.0D != 0.0D) {
/* 1082 */             val = new BigDecimal(val.toString());
/*      */           } else {
/* 1084 */             val = (new DecimalFormat("0")).format(val);
/*      */           }
/*      */
/* 1087 */         } else if (cell.getCellType() == CellType.STRING) {
/* 1088 */           val = cell.getStringCellValue();
/* 1089 */         } else if (cell.getCellType() == CellType.BOOLEAN) {
/* 1090 */           val = Boolean.valueOf(cell.getBooleanCellValue());
/* 1091 */         } else if (cell.getCellType() == CellType.ERROR) {
/* 1092 */           val = Byte.valueOf(cell.getErrorCellValue());
/*      */         }
/*      */
/*      */       }
/* 1096 */     } catch (Exception e) {
/* 1097 */       return val;
/*      */     }
/* 1099 */     return val;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   private boolean isRowEmpty(Row row) {
/* 1109 */     if (row == null) {
/* 1110 */       return true;
/*      */     }
/* 1112 */     for (int i = row.getFirstCellNum(); i < row.getLastCellNum(); i++) {
/* 1113 */       Cell cell = row.getCell(i);
/* 1114 */       if (cell != null && cell.getCellType() != CellType.BLANK) {
/* 1115 */         return false;
/*      */       }
/*      */     }
/* 1118 */     return true;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public static Map<String, PictureData> getSheetPictures03(HSSFSheet sheet, HSSFWorkbook workbook) {
/* 1129 */     Map<String, PictureData> sheetIndexPicMap = new HashMap<>();
/* 1130 */     List<HSSFPictureData> pictures = workbook.getAllPictures();
/* 1131 */     if (!pictures.isEmpty()) {
/* 1132 */       for (HSSFShape shape : sheet.getDrawingPatriarch().getChildren()) {
/* 1133 */         HSSFClientAnchor anchor = (HSSFClientAnchor)shape.getAnchor();
/* 1134 */         if (shape instanceof HSSFPicture) {
/* 1135 */           HSSFPicture pic = (HSSFPicture)shape;
/* 1136 */           int pictureIndex = pic.getPictureIndex() - 1;
/* 1137 */           HSSFPictureData picData = pictures.get(pictureIndex);
/* 1138 */           String picIndex = String.valueOf(anchor.getRow1()) + "_" + String.valueOf(anchor.getCol1());
/* 1139 */           sheetIndexPicMap.put(picIndex, picData);
/*      */         }
/*      */       }
/* 1142 */       return sheetIndexPicMap;
/*      */     }
/* 1144 */     return sheetIndexPicMap;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public static Map<String, PictureData> getSheetPictures07(XSSFSheet sheet, XSSFWorkbook workbook) {
/* 1156 */     Map<String, PictureData> sheetIndexPicMap = new HashMap<>();
/* 1157 */     for (POIXMLDocumentPart dr : sheet.getRelations()) {
/* 1158 */       if (dr instanceof XSSFDrawing) {
/* 1159 */         XSSFDrawing drawing = (XSSFDrawing)dr;
/* 1160 */         List<XSSFShape> shapes = drawing.getShapes();
/* 1161 */         for (XSSFShape shape : shapes) {
/* 1162 */           if (shape instanceof XSSFPicture) {
/* 1163 */             XSSFPicture pic = (XSSFPicture)shape;
/* 1164 */             XSSFClientAnchor anchor = pic.getPreferredSize();
/* 1165 */             CTMarker ctMarker = anchor.getFrom();
/* 1166 */             String picIndex = ctMarker.getRow() + "_" + ctMarker.getCol();
/* 1167 */             sheetIndexPicMap.put(picIndex, pic.getPictureData());
/*      */           }
/*      */         }
/*      */       }
/*      */     }
/* 1172 */     return sheetIndexPicMap;
/*      */   }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */   public String parseDateToStr(String dateFormat, Object val) {
/*      */     String str;
/* 1183 */     if (val == null) {
/* 1184 */       return "";
/*      */     }
/*      */
/* 1187 */     if (val instanceof Date) {
/* 1188 */       str = DateUtils.parseDateToStr(dateFormat, (Date)val);
/* 1189 */     } else if (val instanceof LocalDateTime) {
/* 1190 */       str = DateUtils.parseDateToStr(dateFormat, DateUtils.toDate((LocalDateTime)val));
/* 1191 */     } else if (val instanceof LocalDate) {
/* 1192 */       str = DateUtils.parseDateToStr(dateFormat, DateUtils.toDate((LocalDate)val));
/*      */     } else {
/* 1194 */       str = val.toString();
/*      */     }
/* 1196 */     return str;
/*      */   }
/*      */ }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\ExcelUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */