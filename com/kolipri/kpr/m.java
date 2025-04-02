package com.kolipri.kpr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;

public final class m extends b {
   protected String b = null;

   private boolean a(StringBuffer var1) {
      boolean var2 = false;
      StringBuffer var3 = new StringBuffer();
      StringBuffer var4 = new StringBuffer();

      int var5;
      for(var5 = 0; var5 < var1.length(); ++var5) {
         if (var1.charAt(var5) == '=') {
            ++var5;
            break;
         }

         var3.append(var1.charAt(var5));
      }

      while(var5 < var1.length()) {
         var4.append(var1.charAt(var5));
         ++var5;
      }

      if (var3.length() > 0) {
         this.b(var3.toString(), var4.toString());
         var2 = true;
      }

      return var2;
   }

   private static int a(InputStreamReader var0) {
      boolean var1 = false;

      int var4;
      try {
         var4 = var0.read();
      } catch (Exception var3) {
         var4 = -1;
      }

      return var4;
   }

   private int a(InputStream var1) {
      int var2 = 0;
      InputStreamReader var3 = null;

      try {
         var3 = new InputStreamReader(var1, "UTF-8");
      } catch (UnsupportedEncodingException var7) {
         var3 = null;
      }

      if (var3 != null) {
         StringBuffer var5 = new StringBuffer();

         while(true) {
            char var6;
            do {
               int var4;
               if ((var4 = a(var3)) == -1) {
                  if (var5.length() > 0 && this.a(var5)) {
                     ++var2;
                  }

                  return var2;
               }

               var6 = (char)var4;
            } while(var5.length() < 1 && (var6 == ' ' || var6 == '#' || var6 == '\t'));

            if (var6 != '\r') {
               if (var6 == '\n') {
                  if (var5.length() > 0 && this.a(var5)) {
                     ++var2;
                  }

                  var5 = new StringBuffer();
               } else {
                  var5.append(var6);
               }
            }
         }
      } else {
         return var2;
      }
   }

   public final int b(String var1) {
      int var2 = 0;
      InputStream var3;
      if ((var3 = this.getClass().getResourceAsStream(var1)) != null) {
         var2 = this.a(var3);

         try {
            var3.close();
         } catch (IOException var5) {
         }
      }

      return var2;
   }

   private boolean a(OutputStream var1) {
      boolean var2 = false;

      try {
         OutputStreamWriter var3 = new OutputStreamWriter(var1, "UTF-8");

         for(int var4 = 0; var4 < this.b(); ++var4) {
            String var5 = "" + this.a(var4) + "=" + this.b(var4) + "\n";
            var3.write(var5);
         }

         var2 = true;
      } catch (Exception var6) {
         var6.toString();
         var2 = false;
      }

      return var2;
   }

   private byte[] d() {
      byte[] var1 = null;
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      if (this.a((OutputStream)var2)) {
         var1 = var2.toByteArray();

         try {
            var2.close();
         } catch (Exception var4) {
            var4.toString();
         }
      }

      return var1;
   }

   private boolean d(String var1) {
      byte[] var3 = this.d();
      (new StringBuffer()).append("Writing ").append(var3.length).append(" bytes to record store '").append(var1).append("'..").toString();
      if (var3 != null) {
         try {
            RecordStore.deleteRecordStore(var1);
         } catch (Exception var6) {
            var6.toString();
         }

         try {
            RecordStore var4;
            if ((var4 = RecordStore.openRecordStore(var1, true)) != null) {
               var4.addRecord(var3, 0, var3.length);
               var4.closeRecordStore();
            }
         } catch (Exception var5) {
            var5.toString();
         }
      }

      return false;
   }

   public final boolean c() {
      return this.b != null ? this.d(this.b) : false;
   }

   public final boolean c(String var1) {
      (new StringBuffer()).append("Reading configuration from '").append(var1).append("'..").toString();
      this.b = var1;
      boolean var2 = false;

      try {
         RecordStore var3;
         if ((var3 = RecordStore.openRecordStore(var1, true)) != null) {
            RecordEnumeration var4;
            byte[] var5;
            if ((var4 = var3.enumerateRecords((RecordFilter)null, (RecordComparator)null, false)).hasNextElement() && (var5 = var4.nextRecord()) != null) {
               int var6 = this.a((InputStream)(new ByteArrayInputStream(var5)));
               (new StringBuffer()).append("Read ").append(var6).append(" entries").toString();
               if (var6 > 0) {
                  var2 = true;
               }
            }

            var3.closeRecordStore();
         }
      } catch (Exception var7) {
         var7.toString();
      }

      return var2;
   }
}
