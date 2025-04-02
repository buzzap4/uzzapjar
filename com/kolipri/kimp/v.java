package com.kolipri.kimp;

public final class v extends Thread {
   protected String a = "localhost";
   protected String b = "5222";
   protected String c = null;
   protected String d = null;
   protected String e = null;
   protected boolean f = true;
   protected g g = null;
   protected j h = null;
   protected com.kolipri.kpr.h i = new com.kolipri.kpr.h();
   protected com.kolipri.kpr.c j = new com.kolipri.kpr.c();
   protected String k;

   public final synchronized g a() {
      return this.g;
   }

   public final void a(s var1) {
      boolean var2 = true;
      this.a(var1.b());
      var1.t = this.k;
      var1.f = Long.toString(com.kolipri.kpr.d.a());
      this.j.b((Object)var1);
      if (var1.a == null || var1.a.length() < 1) {
         var1.a = this.c;
         if (var1.n) {
            var2 = false;
         }
      }

      if (var1.b == null || var1.b.length() < 1) {
         var1.b = var1.a;
      }

      if (this.h != null && var2) {
         this.h.a(var1);
      }

   }

   public final void a(String var1) {
      if (var1 != null && var1.startsWith("<message ")) {
         StringBuffer var2;
         (var2 = new StringBuffer()).append("<message ");
         if (this.g != null) {
            var2.append("amaz-msg-id=\"");
            this.k = this.c() + "_" + System.currentTimeMillis() / 1000L + "_" + this.g.c();
            var2.append(this.k);
            var2.append("\" ");
         }

         var2.append(var1.substring(9));
         var1 = var2.toString();
      }

      this.i.a(var1);
   }

   public final int b() {
      synchronized(this.j) {
         int var2 = this.j.c();
         if (this.j.c() > 0) {
            for(com.kolipri.kpr.e var3 = this.j.a(); var3 != null; var3 = com.kolipri.kpr.c.b(var3)) {
               if (((s)var3.c).c.equals("admin")) {
                  --var2;
               }
            }
         }

         return var2;
      }
   }

   public final String c() {
      return this.c;
   }

   public final void b(String var1) {
      this.a = var1;
   }

   public final void c(String var1) {
      this.b = var1;
   }

   public final String d() {
      return this.e;
   }

   public final void d(String var1) {
      this.e = var1;
   }

   public final void run() {
      synchronized(this) {
         this.g = new g(this.h, this.i, this.j);
         this.g.a(this.a, this.b, this.c, this.d);
      }

      while(this.f) {
         this.g.h();
         com.kolipri.kpr.d.a(1000);
      }

      this.g.f();
   }

   public final boolean a(j var1, String var2, String var3) {
      this.h = var1;
      this.c = var2;
      this.d = var3;
      this.f = true;
      this.start();
      return true;
   }

   public final synchronized void e() {
      this.f = false;
   }

   public final int f() {
      return this.g.k;
   }
}
