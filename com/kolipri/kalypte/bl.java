package com.kolipri.kalypte;

public final class bl implements com.kolipri.kt.b, com.kolipri.kt.o, dl, f {
   protected com.kolipri.kt.r a = null;
   protected String b = "";
   protected String c;
   protected String d = "";
   protected String e;
   protected String f;
   protected String g = "";
   protected String h = "";
   protected com.kolipri.kpr.f i = new com.kolipri.kpr.f();
   protected com.kolipri.kpr.f j = new com.kolipri.kpr.f();
   protected boolean k = true;
   protected boolean l = false;

   public bl(com.kolipri.kt.r var1, String var2, String var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.f = var2 == null ? "" : var2;
      this.g = this.f;
      com.kolipri.kimp.p var4 = ((Kalypte)this.a).k.a("username", this.g);
      this.g = var4 != null ? var4.d() : this.g;
   }

   public final void d(String var1) {
      this.d = var1;
   }

   private void e() {
      this.b = "";
      new com.kolipri.kpr.f();
      com.kolipri.kimp.s var5 = new com.kolipri.kimp.s();
      if (this.i != null && this.i.b() > 0) {
         com.kolipri.kimp.p var6;
         if ((var6 = (com.kolipri.kimp.p)this.i.b(0)) != null && var6.f()) {
            var5.c = var6.a("username");
            var5.j = "im";
            var5.g = var6.a("location");
         } else if (var6 != null && var6.g()) {
            if (var6.a("yahoo-id") != null) {
               var5.c = var6.a("yahoo-id");
               var5.j = "yahoo";
            } else if (var6.a("msn-id") != null) {
               var5.c = var6.a("msn-id");
               var5.j = "msn";
            }
         } else if (var6 != null && var6.j()) {
            var5.c = var6.c(((Kalypte)this.a).h.a("kalypte.countrycode"));
            var5.j = "sms";
         }

         var5.d = this.d;
         var5.l = this.i;
         var5.e = "random";
         var5.r = this.l;
         if (var5.c != null) {
            ((Kalypte)this.a).i.a(var5);
         }
      }

   }

   private void f() {
      com.kolipri.kimp.s var5;
      if (!this.c.equals("email")) {
         if (this.b != null && this.c.equals("chatroom")) {
            ((Kalypte)this.a).i.a(com.kolipri.kimp.u.c(this.b, this.d));
         } else {
            if (!this.c.equals("sms")) {
               com.kolipri.kimp.p var4 = ((Kalypte)this.a).k.a("username", this.b);
               this.i.b(var4);
               (var5 = new com.kolipri.kimp.s()).d = this.d;
               var5.e = this.c;
               var5.c = this.b;
               var5.r = this.l;
               var5.l = this.i;
               if (var4 != null && var4.a("location") != null) {
                  this.e = var4.a("location");
                  var5.g = this.e;
               }

               ((Kalypte)this.a).i.a(var5);
               if (this.c.equals("im")) {
                  ((Kalypte)this.a).g(this.b);
               }

               return;
            }

            (new aj(this.a)).a(this.b, this.d);
         }
      } else {
         new cb(this.a);
         this.f = this.g == null ? "" : this.g;
         var5 = null;

         int var10;
         com.kolipri.kimp.p var11;
         for(var10 = 0; var10 < this.i.b(); ++var10) {
            if ((var11 = (com.kolipri.kimp.p)this.i.b(var10)) != null && var11.c() != null) {
               if (this.f.length() > 0) {
                  this.f = this.f + ",";
               }

               this.f = this.f + var11.c();
            }
         }

         this.h = "";

         for(var10 = 0; var10 < this.j.b(); ++var10) {
            if ((var11 = (com.kolipri.kimp.p)this.j.b(var10)) != null && var11.c() != null) {
               if (this.h.length() > 0) {
                  this.h = this.h + ",";
               }

               this.h = this.h + var11.c();
               this.i.a(var11);
            }
         }

         com.kolipri.kimp.s var6;
         (var6 = new com.kolipri.kimp.s()).d = this.d;
         var6.e = this.c;
         ((Kalypte)this.a).k.a("username", this.f);
         com.kolipri.kimp.p var9 = ((Kalypte)this.a).s();
         var6.c = this.f;
         var6.h = this.h;
         var6.l = this.i;
         var6.r = this.l;
         var6.e = "email";
         var6.b = var9.d() == null ? "" : var9.d();
         ((Kalypte)this.a).i.a(var6);
      }

   }

   private void g() {
      com.kolipri.kt.ad var1;
      (var1 = new com.kolipri.kt.ad(this.a)).a();
      var1.b("Type your message");
      if (this.c != null && this.c.equals("chatroom")) {
         var1.b(160);
      } else {
         var1.b(700);
      }

      var1.c(this.d);
      var1.a((com.kolipri.kt.o)this);
      var1.i = "Options";
      var1.b();
   }

   protected final void c() {
      com.kolipri.kt.ae var1 = new com.kolipri.kt.ae(this.a, "message-options");
      if ((this.b == null || this.b.length() <= 0) && this.i.b() <= 0) {
         var1.a(21, (com.kolipri.kt.ai)null, "Set Recipient");
      } else {
         var1.a(10, (com.kolipri.kt.ai)null, "Send Message");
      }

      var1.a(20, (com.kolipri.kt.ai)null, "Edit Message");
      if (this.c.equals("im") || this.c.equals("smsr") || this.c.equals("yahoo") || this.c.equals("sms") || this.c.equals("msn") || this.c.equals("email") || this.c.equals("random")) {
         if (this.c.equals("email")) {
            var1.a(21, (com.kolipri.kt.ai)null, "Add Recipient");
            var1.a(22, (com.kolipri.kt.ai)null, "Add Cc Recipient");
            var1.a(27, (com.kolipri.kt.ai)null, "Show/Hide CC Recipients");
         } else if (!this.c.equals("chat")) {
            var1.a(21, (com.kolipri.kt.ai)null, "Add Recipient");
            var1.a(27, (com.kolipri.kt.ai)null, "Show/Hide Recipients");
         }
      }

      var1.a(30, (com.kolipri.kt.ai)null, "Add Emoticon");
      var1.a(this);
      com.kolipri.kt.g var2 = new com.kolipri.kt.g(this.a);
      String var4 = null;
      String var3 = this.d.length() <= 15 ? this.d : this.d.substring(0, 13) + "..";
      String var5 = null;
      com.kolipri.kimp.p var6;
      var5 = (var6 = ((Kalypte)this.a).k.a("username", this.f)) != null ? var6.d() : this.f;
      if (this.c.equals("chatroom")) {
         this.f = "[Chatroom '" + this.f + "']";
      }

      if (this.l && this.f != null && !this.c.equals("email")) {
         var5 = "(hidden) " + var5;
      }

      if (this.j.b() > 0 && this.c.equals("email")) {
         if (this.l) {
            var4 = "(hidden) " + this.h;
         } else {
            var4 = this.h;
         }
      }

      var2.a("- To: " + (var5 == null ? "(no recipient set)" : var5) + (var4 != null ? "\n- Cc: " + var4 : "") + "\n" + var3 + "\n");
      var2.a((com.kolipri.kt.af)var1);
      var2.c(8);
      var2.a(this.a.c());
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      cf var3;
      switch(var2) {
      case 10:
         if (this.c.equals("random")) {
            this.e();
         } else {
            this.f();
         }
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 23:
      case 24:
      case 25:
      case 26:
      case 28:
      case 29:
      default:
         break;
      case 20:
         this.g();
         break;
      case 21:
         this.k = true;
         var3 = new cf(this.a);
         if (this.c.equals("yahoo")) {
            var3.a((com.kolipri.kpr.f)((Kalypte)this.a).k.c("yahoo-id"), (String)null);
         } else if (this.c.equals("msn")) {
            var3.a((com.kolipri.kpr.f)((Kalypte)this.a).k.c("msn-id"), (String)null);
         } else if (this.c.equals("email")) {
            var3.a((com.kolipri.kpr.f)((Kalypte)this.a).k.c("email"), (String)null);
         } else if (!this.c.equals("sms") && !this.c.equals("smsr") && !this.c.equals("email") && !this.c.equals("random")) {
            var3.a((com.kolipri.kpr.f)((Kalypte)this.a).k.c("username"), (String)null);
         } else {
            var3.a((com.kolipri.kpr.f)((Kalypte)this.a).k.c("sms"), (String)null);
         }

         var3.a((dl)this);
         var3.a(this.a.c());
         break;
      case 22:
         this.k = false;
         (var3 = new cf(this.a)).a((com.kolipri.kpr.f)((Kalypte)this.a).k.c("email"), (String)null);
         var3.a((dl)this);
         var3.a(this.a.c());
         break;
      case 27:
         this.l = !this.l;
         this.c();
         break;
      case 30:
         this.h();
      }

      return true;
   }

   public final void a(String var1) {
      this.d = this.d + var1;
      this.g();
   }

   public final void a_(String var1) {
      this.d = var1;
      this.c();
   }

   public final void c_() {
      this.h();
   }

   public final void c(String var1) {
      this.d = var1;
   }

   private void h() {
      az var1;
      (var1 = new az(this.a)).a(this);
      var1.a();
      var1.a(this.a.c());
   }

   public final void a(com.kolipri.kpr.f var1) {
      new com.kolipri.kpr.f();
      Object var2 = null;
      if (var1 != null) {
         this.b(var1);
      }

   }

   private void b(com.kolipri.kpr.f var1) {
      for(int var4 = 0; var1 != null && var4 < var1.b(); ++var4) {
         com.kolipri.kimp.p var5;
         if ((var5 = (com.kolipri.kimp.p)var1.b(var4)) != null) {
            if (!this.k) {
               this.j.a(var5);
            } else if (this.k) {
               this.i.a(var5);
            }
         }
      }

      this.a(true);
   }

   public final void a(boolean var1) {
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      com.kolipri.kpr.f var3 = new com.kolipri.kpr.f();
      boolean var4 = true;
      String var6 = this.b != null && !this.b.equals("") ? ", " : "";
      com.kolipri.kimp.p var7 = null;

      int var8;
      for(var8 = 0; this.i != null && var8 < this.i.b(); ++var8) {
         if ((var7 = (com.kolipri.kimp.p)this.i.b(var8)) != null && !this.c.equals("email") && (var7.j() || var7.f() || var7.g())) {
            if (!this.c.equals("smsr") && !this.c.equals("sms") && !var7.j()) {
               if (var7.a("username") != null) {
                  var2.a(var7.a("username"));
               } else if (var7.g()) {
                  if (var7.h()) {
                     var2.a(var7.a("yahoo-id"));
                  } else if (var7.i()) {
                     var2.a(var7.a("msn-id"));
                  }
               }
            } else if (var7.c(((Kalypte)this.a).h.a("kalypte.countrycode")) != null) {
               var2.a(var7.c(((Kalypte)this.a).h.a("kalypte.countrycode")));
            }
         } else if (var7 != null && this.c.equals("email") && var7.c() != null) {
            var2.a(var7.c());
         }
      }

      for(var8 = 0; this.j != null && var8 < this.j.b(); ++var8) {
         if ((var7 = (com.kolipri.kimp.p)this.j.b(var8)) != null && var7.c() != null) {
            var3.a(var7.c());
         }
      }

      String var10 = var6;

      int var9;
      for(var9 = 0; var9 < var2.b(); ++var9) {
         if (var9 >= 3) {
            var10 = var10 + ",,,,";
            break;
         }

         if (!var4) {
            var10 = var10 + ", ";
         }

         var4 = false;
         var10 = var10 + var2.b(var9);
      }

      this.e(var10);
      var10 = "";
      var4 = true;

      for(var9 = 0; var9 < var3.b(); ++var9) {
         if (var9 >= 3) {
            var10 = var10 + ",,,,";
            break;
         }

         if (!var4) {
            var10 = var10 + ", ";
         }

         var4 = false;
         var10 = var10 + var3.b(var9);
      }

      this.f(var10);
      if (var1) {
         this.c();
      }

   }

   private void e(String var1) {
      if (var1 != null) {
         this.f = this.g + var1;
      }

   }

   private void f(String var1) {
      if (var1 != null) {
         this.h = var1;
      }

   }

   public final void e_() {
      this.c();
   }

   public final void d() {
      this.g();
   }
}
