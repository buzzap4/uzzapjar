package com.kolipri.kalypte;

public final class p implements com.kolipri.kt.b, com.kolipri.kt.o, f, dl {
   protected com.kolipri.kt.r a = null;
   private af f = null;
   public String b = "";
   public String c = "";
   public com.kolipri.kpr.f d = new com.kolipri.kpr.f();
   public com.kolipri.kpr.f e = new com.kolipri.kpr.f();
   private String g = "";
   private String h = "";
   private com.kolipri.kt.g i = null;
   private boolean j = false;

   public p(com.kolipri.kt.r var1, com.kolipri.kpr.f var2, String var3, String var4) {
      this.a = var1;
      this.d = var2;
      this.g = var3;
      this.h = var4;
   }

   private void d() {
      String var1 = null;
      var1 = c(this.e);
      this.b = "- Whispers:\n" + this.b + "\n- To: " + var1 + "\n";

      for(int var2 = 0; var2 < this.e.b(); ++var2) {
         com.kolipri.kimp.p var3;
         if ((var3 = (com.kolipri.kimp.p)this.e.b(var2)) != null && var3.a("username") != null) {
            ((Kalypte)this.a).i.a(com.kolipri.kimp.u.a(this.g, this.b, var3.a("username"), var1, this.h));
         }
      }

      StringBuffer var4;
      (var4 = new StringBuffer()).append("* ");
      var4.append(this.h);
      String var5 = com.kolipri.kpr.d.b(-1L);
      var4.append(" (");
      var4.append(var5);
      var4.append("):\n");
      var4.append(this.b);
      if (this.f != null) {
         this.f.d(var4.toString());
      }

      if (this.i != null) {
         this.i.f();
      }

   }

   public final void a(af var1) {
      this.f = var1;
   }

   private void e() {
      com.kolipri.kt.ad var1;
      (var1 = new com.kolipri.kt.ad(this.a)).a();
      var1.b("Type your message");
      var1.b(160);
      var1.c(this.b);
      var1.a((com.kolipri.kt.o)this);
      var1.i = "Options";
      var1.b();
   }

   private void f() {
      if (this.i != null) {
         this.i.f();
      }

      com.kolipri.kt.ae var1;
      (var1 = new com.kolipri.kt.ae(this.a, "message-options")).a(1, (com.kolipri.kt.ai)null, "Send Whisper");
      var1.a(5, (com.kolipri.kt.ai)null, "Edit Message");
      var1.a(2, (com.kolipri.kt.ai)null, "Add Recipients");
      var1.a(3, (com.kolipri.kt.ai)null, "Add Emoticon");
      var1.a(this);
      this.i = new com.kolipri.kt.g(this.a);
      String var2 = null;
      var2 = this.b.length() <= 15 ? this.b : this.b.substring(0, 13) + "..";
      this.i.a("- To: " + this.c + "\n" + var2);
      this.i.a((com.kolipri.kt.af)var1);
      this.i.c(8);
      this.i.a(this.a.c());
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      switch(var2) {
      case 1:
         if (this.e.b() != 0) {
            this.d();
         } else {
            this.g();
         }
         break;
      case 2:
         this.g();
         break;
      case 3:
         az var3;
         (var3 = new az(this.a)).a(this);
         var3.a();
         var3.a(this.a.c());
      case 4:
      default:
         break;
      case 5:
         this.e();
      }

      return true;
   }

   private void g() {
      cf var1;
      (var1 = new cf(this.a)).a((com.kolipri.kpr.f)this.d, (String)null);
      var1.a(this.a.c());
      var1.a((dl)this);
      var1.w();
   }

   public final void a(String var1) {
      this.b = this.b + var1;
      this.e();
   }

   public final void a_(String var1) {
      this.b = var1;
      this.f();
   }

   public final void c_() {
      this.f();
   }

   public final void c(String var1) {
   }

   private void b(com.kolipri.kpr.f var1) {
      String var2 = "";
      boolean var3 = true;

      for(int var4 = 0; var1 != null && var4 < var1.b(); ++var4) {
         com.kolipri.kimp.p var5;
         if ((var5 = (com.kolipri.kimp.p)var1.b(var4)) != null) {
            if (var4 >= 3) {
               var2 = var2 + ",,,,";
               break;
            }

            if (!var3) {
               var2 = var2 + ", ";
            }

            var3 = false;
            var2 = var2 + var5.a("username").toString();
         }
      }

      if (var2 != null) {
         this.c = var2;
      }

      this.f();
   }

   private static String c(com.kolipri.kpr.f var0) {
      String var1 = "";

      for(int var2 = 0; var0 != null && var2 < var0.b(); ++var2) {
         com.kolipri.kimp.p var3;
         if ((var3 = (com.kolipri.kimp.p)var0.b(var2)) != null) {
            if (var1.length() > 0) {
               var1 = var1 + ",";
            }

            var1 = var1 + var3.a("username").toString();
         }
      }

      return var1;
   }

   public final void a(com.kolipri.kpr.f var1) {
      for(int var2 = 0; var1 != null && var2 < var1.b(); ++var2) {
         com.kolipri.kimp.p var3;
         if ((var3 = (com.kolipri.kimp.p)var1.b(var2)) != null && var3.a("username") != null) {
            this.a(var3);
         }
      }

      this.b(this.e);
      if (this.j) {
         this.e();
      }

      this.j = false;
   }

   public final void e_() {
      this.f();
   }

   private void a(com.kolipri.kimp.p var1) {
      boolean var2 = false;

      for(int var3 = 0; this.e != null && var3 < this.e.b(); ++var3) {
         com.kolipri.kimp.p var4;
         if ((var4 = (com.kolipri.kimp.p)this.e.b(var3)) != null && var4.a("username") != null && var4.a("username").equals(var1.a("username"))) {
            var2 = true;
         }
      }

      if (!var2) {
         this.e.a(var1);
      }

   }

   public final void c() {
      this.g();
      this.j = true;
   }
}
