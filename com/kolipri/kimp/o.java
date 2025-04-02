package com.kolipri.kimp;

import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;

public final class o {
   protected RecordStore a = null;
   protected RecordEnumeration b = null;

   public o(String var1) {
      this.a(var1);
   }

   private void a(String var1) {
      try {
         this.a = RecordStore.openRecordStore(var1, false);
         if (this.a != null) {
            this.b = this.a.enumerateRecords((RecordFilter)null, new RecordComparator(this, null) {
               public final int compare(byte[] var1, byte[] var2) {
                  boolean var3 = false;
                  s var4 = s.a(var1);
                  s var5 = s.a(var2);
                  byte var10;
                  if (var4 != null && var4.f != null || var5 != null && var5.f != null) {
                     if (var4 != null && var4.f != null) {
                        if (var5 != null && var5.f != null) {
                           long var6 = Long.parseLong(var4.f);
                           long var8 = Long.parseLong(var5.f);
                           if (var6 < var8) {
                              var10 = -1;
                           } else if (var6 > var8) {
                              var10 = 1;
                           } else {
                              var10 = 0;
                           }
                        } else {
                           var10 = -1;
                        }
                     } else {
                        var10 = 1;
                     }
                  } else {
                     var10 = 0;
                  }

                  return var10;
               }
            }, false);
         }

      } catch (Exception var3) {
      }
   }

   public final s a() {
      s var1 = null;

      try {
         byte[] var2;
         if (this.b != null && this.b.hasNextElement() && (var2 = this.b.nextRecord()) != null) {
            var1 = s.a(var2);
         }
      } catch (Exception var3) {
      }

      if (var1 == null) {
         this.b();
      }

      return var1;
   }

   public final void b() {
      if (this.a != null) {
         try {
            this.a.closeRecordStore();
         } catch (Exception var2) {
         }
      }

      this.a = null;
      this.b = null;
   }
}
