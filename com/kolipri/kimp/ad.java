package com.kolipri.kimp;

import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;

public final class ad {
   public String a = null;

   public ad(String var1) {
      this.a = var1;
   }

   private String b(p var1) {
      return "HIST-" + this.a + "-" + var1.a("amaz-cid");
   }

   private void c(p var1) {
      boolean var2 = false;
      int var4 = 0;

      try {
         RecordStore var5;
         if ((var5 = RecordStore.openRecordStore(this.b(var1), true)) != null) {
            RecordEnumeration var6;
            if (var5.getNumRecords() > 100 && (var6 = var5.enumerateRecords((RecordFilter)null, (RecordComparator)null, false)) != null) {
               while(var6.hasPreviousElement()) {
                  int var7 = var6.previousRecordId();
                  var5.deleteRecord(var7);
                  if (++var4 == 10) {
                     break;
                  }
               }

               var6.destroy();
            }

            var5.closeRecordStore();
         }

      } catch (Exception var8) {
         var8.toString();
      }
   }

   public final void a(p var1, s var2) {
      if (var1 != null && var2 != null && var1.a("amaz-cid") != null) {
         this.c(var1);
         String var3 = this.b(var1);
         byte[] var4;
         if ((var4 = var2.a()) != null) {
            try {
               RecordStore var5;
               if ((var5 = RecordStore.openRecordStore(var3, true)) != null) {
                  var5.addRecord(var4, 0, var4.length);
                  var5.closeRecordStore();
               }

               return;
            } catch (Exception var6) {
               var6.toString();
            }
         }
      }

   }

   public final o a(p var1) {
      return new o(this.b(var1));
   }

   public final com.kolipri.kpr.f a(p var1, int var2) {
      com.kolipri.kpr.f var3 = new com.kolipri.kpr.f();
      o var4;
      s var5;
      if ((var4 = this.a(var1)) != null) {
         while((var5 = var4.a()) != null) {
            var3.b(var5);
            if (var3.b() > var2) {
               var3.a(var3.b() - 1);
            }
         }
      }

      return var3;
   }

   public static void a() {
      String[] var0 = RecordStore.listRecordStores();

      for(int var1 = 0; var1 < var0.length; ++var1) {
         try {
            if (var0[var1].startsWith("HIST-")) {
               RecordStore.deleteRecordStore(var0[var1]);
            }
         } catch (Exception var3) {
            var3.toString();
         }
      }

   }
}
