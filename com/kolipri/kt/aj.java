package com.kolipri.kt;

import java.util.Enumeration;
import java.util.Hashtable;

public final class aj {
   protected com.kolipri.kpr.m a = null;
   protected r b = null;
   public String c = null;
   protected Hashtable d = new Hashtable();

   public aj(r var1) {
      this.b = var1;
   }

   public static com.kolipri.kpr.f a() {
      com.kolipri.kpr.f var0;
      (var0 = new com.kolipri.kpr.f()).a("black");
      var0.a("dolphins");
      var0.a("hearts");
      var0.a("roses");
      var0.a("uzzap");
      return var0;
   }

   private int e(String var1) {
      (new StringBuffer()).append("Reading theme settings from '").append(var1).append("'..").toString();
      this.a.b("/themes/" + var1 + "/theme.ini");
      return 0;
   }

   public final void a(String var1) {
      this.a = new com.kolipri.kpr.m();
      this.e("default");
      if (var1 != null && !var1.equals("default")) {
         this.e(var1);
      }

      this.c = var1;
      this.b();
      if (this.b.c() != null) {
         this.b.c().e();
         this.b.c().repaint();
      }

   }

   private void b() {
      Enumeration var1 = this.d.keys();

      while(var1.hasMoreElements()) {
         String var2;
         ai var3;
         if ((var2 = (String)var1.nextElement()) != null && (var3 = (ai)this.d.get(var2)) != null && !this.a(var3, var2)) {
            (new StringBuffer()).append("FAILED to update bitmap '").append(var2).append("'!!").toString();
         }
      }

   }

   private boolean a(ai var1, String var2) {
      boolean var3 = false;
      if (this.c != null) {
         var3 = var1.a("/themes/" + this.c + "/" + var2 + ".png");
      }

      if (!var3 && (this.c == null || !this.c.equals("default"))) {
         var3 = var1.a("/themes/default/" + var2 + ".png");
      }

      return var3;
   }

   private ai f(String var1) {
      ai var2 = new ai(this.b);
      if (!this.a(var2, var1)) {
         var2 = null;
      }

      return var2;
   }

   public final ai b(String var1) {
      ai var2 = null;
      if (var1 != null && (var2 = (ai)this.d.get(var1)) == null && (var2 = this.f(var1)) != null) {
         this.d.put(var1, var2);
      }

      return var2;
   }

   private String g(String var1) {
      String var2 = null;
      if (this.a != null) {
         var2 = this.a.a(var1);
      }

      return var2;
   }

   public final ao c(String var1) {
      return ao.b(this.g(var1));
   }

   public final j a(int var1, String var2) {
      j var3 = null;
      String var4;
      if ((var4 = this.g(var2)) != null) {
         try {
            var3 = new j(var1, Integer.parseInt(var4));
         } catch (Exception var6) {
            var3 = null;
         }
      }

      return var3;
   }

   public final j d(String var1) {
      j var2 = null;
      String var3;
      if ((var3 = this.g(var1)) != null) {
         try {
            var2 = new j(Integer.parseInt(var3));
         } catch (Exception var5) {
            var2 = null;
         }
      }

      return var2;
   }
}
