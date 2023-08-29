package com.cms.base_service.common.utils;


public class Sequence
{
/*  12 */   private final long twepoch = 1288834974657L;


  
/*  16 */   private final long workerIdBits = 5L;


  
/*  20 */   private final long datacenterIdBits = 5L;


  
/*  24 */   private final long maxWorkerId = 31L;


  
/*  28 */   private final long maxDatacenterId = 31L;


  
/*  32 */   private final long sequenceBits = 12L;


  
/*  36 */   private final long workerIdShift = 12L;


  
/*  40 */   private final long datacenterIdShift = 17L;


  
/*  44 */   private final long timestampLeftShift = 22L;


  
/*  48 */   private final long sequenceMask = 4095L;



  
  private long workerId;


  
  private long datacenterId;


  
/*  61 */   private long sequence = 0L;


  
/*  65 */   private long lastTimestamp = -1L;




  
  public Sequence(long workerId, long datacenterId) {
/*  72 */     if (workerId > 31L || workerId < 0L) {
/*  73 */       throw new IllegalArgumentException(String.format("worker Id can't be greater than %d or less than 0", new Object[] { Long.valueOf(31L) }));
    }
    
/*  76 */     if (datacenterId > 31L || datacenterId < 0L) {
/*  77 */       throw new IllegalArgumentException(String.format("datacenter Id can't be greater than %d or less than 0", new Object[] { Long.valueOf(31L) }));
    }
    
/*  80 */     this.workerId = workerId;
/*  81 */     this.datacenterId = datacenterId;
  }





  
  public synchronized long nextId() {
/*  90 */     long timestamp = timeGen();

    
/*  93 */     if (timestamp < this.lastTimestamp) {
/*  94 */       long offset = this.lastTimestamp - timestamp;
/*  95 */       if (offset <= 5L) {
        try {
/*  97 */           wait(offset << 1L);
/*  98 */           timestamp = timeGen();
/*  99 */           if (timestamp < this.lastTimestamp) {
/* 100 */             throw new RuntimeException(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", new Object[] { Long.valueOf(offset) }));
          }
/* 102 */         } catch (Exception e) {
/* 103 */           throw new RuntimeException(e);
        } 
      } else {
/* 106 */         throw new RuntimeException(String.format("Clock moved backwards.  Refusing to generate id for %d milliseconds", new Object[] { Long.valueOf(offset) }));
      } 
    } 


    
/* 112 */     if (this.lastTimestamp == timestamp) {
/* 113 */       this.sequence = this.sequence + 1L & 0xFFFL;
      
/* 115 */       if (this.sequence == 0L)
      {
/* 117 */         timestamp = tilNextMillis(this.lastTimestamp);
      }
    } else {
/* 120 */       this.sequence = 0L;
    } 















    
/* 138 */     this.lastTimestamp = timestamp;

    
/* 141 */     return timestamp - 1288834974657L << 22L | this.datacenterId << 17L | this.workerId << 12L | this.sequence;
  }









  
  protected long tilNextMillis(long lastTimestamp) {
/* 154 */     long timestamp = timeGen();
/* 155 */     while (timestamp <= lastTimestamp) {
/* 156 */       timestamp = timeGen();
    }
    
/* 159 */     return timestamp;
  }





  
  protected long timeGen() {
/* 168 */     return SystemClock.now();
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\Sequence.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */