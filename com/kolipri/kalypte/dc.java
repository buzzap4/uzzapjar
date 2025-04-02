package com.kolipri.kalypte;

public final class dc extends com.kolipri.kt.ab implements com.kolipri.kt.b {
   protected com.kolipri.kimp.s h = null;
   protected com.kolipri.kpr.f i = new com.kolipri.kpr.f();

   public dc(com.kolipri.kt.r var1) {
      super(var1);
   }

   private com.kolipri.kimp.p a(String var1, String var2) {
      com.kolipri.kimp.p var3 = null;
      com.kolipri.kimp.p var10000;
      if (var1 != null && var1.equals("im")) {
         var10000 = ((Kalypte)super.b_).k.a("username", var2);
      } else if (var1 == null || !var1.equals("sms") && !var1.equals("smsr")) {
         if (var1 != null && var1.equals("yahoo")) {
            var10000 = ((Kalypte)super.b_).k.a("yahoo-id", var2);
         } else if (var1 != null && var1.equals("msn")) {
            var10000 = ((Kalypte)super.b_).k.a("msn", var2);
         } else {
            if (var1 == null || !var1.equals("email")) {
               return var3;
            }

            var10000 = ((Kalypte)super.b_).k.a("email", var2) == null ? ((Kalypte)super.b_).k.a("custom-email", var2) : ((Kalypte)super.b_).k.a("email", var2);
         }
      } else {
         if ((var3 = ((Kalypte)super.b_).k.a("mobile", var2)) != null) {
            return var3;
         }

         var10000 = ((Kalypte)super.b_).k.a("custom-mobile", var2);
      }

      var3 = var10000;
      return var3;
   }

   public final void a(com.kolipri.kimp.s var1) {
      super.a();
      this.h = new com.kolipri.kimp.s(var1);
      com.kolipri.kimp.p var2 = ((Kalypte)super.b_).k.a("username", var1.a);
      if (var1.f != null) {
         this.d("- Time: " + com.kolipri.kpr.d.b(Long.parseLong(var1.f)) + "\n\n");
      }

      this.d(var1.d == null ? "" : var1.d);
      this.d("\n\n");
      if (var2 != null) {
         this.d("- From: " + var2.d() + " (" + var1.a + ")\n");
      } else {
         this.d("- From: " + var1.a + "\n");
      }

      ((Kalypte)super.b_).k.a("username", var1.c);
      new cb(this.t());
      com.kolipri.kpr.f var4 = new com.kolipri.kpr.f();
      if (var1.h != null) {
         var4 = cb.c(this.h.h);
      }

      boolean var5 = true;
      this.d("- To: ");

      for(int var6 = 0; var4 != null && var6 < var4.b(); ++var6) {
         String var7;
         if ((var7 = var4.b(var6).toString()) != null) {
            com.kolipri.kimp.p var8;
            if ((var8 = this.a(var1.e, var7)) == null && var1.e.equals("im")) {
               (var8 = new com.kolipri.kimp.p()).b("username", var7);
            }

            if (var8 != null) {
               if (!var5) {
                  this.d(", ");
               }

               this.d("\n- ");
               this.d(var8.d() + (var8.a("username") != null ? "- ( " + var8.a("username") + " )" : ""));
               if (!((Kalypte)super.b_).i.c().equals(var8.a("username"))) {
                  this.i.a(var8);
               }

               var5 = false;
            }
         }
      }

      this.d("\n");
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Options", "Buddies");
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Buddies")) {
         bu var4;
         if ((var4 = bu.f(this)) != null) {
            var4.H();
         }

      } else {
         if (var1 != null && var1.equals("Options")) {
            com.kolipri.kt.ae var2 = new com.kolipri.kt.ae(super.b_, "message-options");
            if (this.h.a != null && !this.h.a.equals(((Kalypte)super.b_).i.c())) {
               var2.a(10, (com.kolipri.kt.ai)null, "Send Reply");
            }

            if (this.h != null && this.h.e.equals("im")) {
               var2.a(20, (com.kolipri.kt.ai)null, "Reply All");
            }

            var2.a(30, (com.kolipri.kt.ai)null, "Forward Message");
            var2.a(99, (com.kolipri.kt.ai)null, "Close Tab");
            var2.a(this);
            com.kolipri.kt.g var3;
            (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var2);
            var3.a(super.b_.c());
         }

      }
   }

   public final boolean a(com.kolipri.kt.al var1) {
      if (var1.b != 5 && var1.b >= 1 && var1.b <= 7) {
         return super.a(var1);
      } else {
         (new bl(super.b_, this.h.a, this.h.e)).d();
         return true;
      }
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (!var1.a().equals("message-options")) {
         return false;
      } else {
         com.kolipri.kimp.p var3;
         if (var2 == 10) {
            if (this.h.e != null && this.h.e.equals("email") && (var3 = ((Kalypte)super.b_).k.a("username", this.h.a)) != null && var3.c() != null) {
               this.h.a = var3.c();
            }

            (new bl(super.b_, this.h.a, this.h.e)).d();
         } else {
            bl var4;
            if (var2 == 20) {
               if (this.h.a != null && this.h.a.equals(((Kalypte)super.b_).i.c()) && this.i != null && this.i.b() > 0 && (var3 = (com.kolipri.kimp.p)this.i.b(0)) != null) {
                  if (this.h.e != null && this.h.e.equals("im")) {
                     this.h.a = var3.a("username");
                  } else {
                     this.h.a = var3.c();
                  }

                  this.i.c(var3);
               }

               var4 = new bl(super.b_, this.h.a, this.h.e);
               if (this.i != null && this.i.b() > 0) {
                  var4.i = this.i;
               }

               var4.a(false);
               var4.d();
            } else if (var2 == 30) {
               (var4 = new bl(super.b_, (String)null, "random")).d(this.h.d);
               var4.d();
            } else if (var2 == 99) {
               this.D();
            }
         }

         return true;
      }
   }

   public final String E() {
      return "Stored Message";
   }
}
