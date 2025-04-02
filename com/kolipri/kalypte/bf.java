package com.kolipri.kalypte;

public final class bf extends com.kolipri.kt.g implements com.kolipri.kt.b, cl {
   protected d a = null;
   protected cl f = null;
   protected boolean g = false;
   protected String h = null;
   protected String i = "";
   protected String E = "";
   public com.kolipri.kpr.f F = new com.kolipri.kpr.f();
   public com.kolipri.kpr.f G = new com.kolipri.kpr.f();
   public com.kolipri.kpr.f H = new com.kolipri.kpr.f();
   public int I;

   public bf(com.kolipri.kt.r var1, String var2) {
      super(var1);
      new com.kolipri.kpr.f();
      this.I = 0;
      this.i = var2;
      if (this.i.equals("email")) {
         this.E = " has several email,\n please select the primary email address.";
      } else {
         this.E = " has several numbers,\n please select the primary mobile number.";
      }
   }

   public final void a(cl var1) {
      this.f = var1;
   }

   private void e() {
      ((com.kolipri.kt.ab)super.c).c("* " + this.h + this.E);
   }

   public final void a(com.kolipri.kpr.f var1) {
      this.F = var1;
      if (this.F.b() == 0) {
         this.I();
         this.f();
      } else {
         com.kolipri.kimp.p var2 = (com.kolipri.kimp.p)this.F.b(this.I);
         this.H = this.a(this.I);
         if (this.i.equals("email")) {
            this.a("* " + this.h + " has several email address,\n please select the primary email address.");
         } else {
            this.a("* " + this.h + " has several numbers,\n please select the primary mobile number.");
         }

         this.a = new d(super.b_, var2, this.H);
         this.b(true);
         this.a.b = this.e(this.I);
         this.a.d = this;
         this.a.g = this.i;
         this.a.a(this);
         super.a((com.kolipri.kt.af)this.a);
         this.w();
      }
   }

   private void G() {
      this.g = false;
      if (this.F.b() == 0) {
         this.f();
         this.I();
      } else {
         ++this.I;
         if (this.I >= this.F.b()) {
            this.I = 0;
         }

         this.H = this.a(this.I);
         this.e();
         com.kolipri.kimp.p var1 = (com.kolipri.kimp.p)this.F.b(this.I);
         this.a.c = var1;
         this.a.a = this.H;
         com.kolipri.kpr.f var2 = this.e(this.I);

         for(int var3 = 0; var2 != null && this.F != null && var3 < this.a.a.b(); ++var3) {
            if (var2.b() > 0 && this.a.a.b(var3).toString().equals(var2.b(0).toString())) {
               this.a.e(var3);
               break;
            }
         }
      }

      this.w();
   }

   private com.kolipri.kpr.f a(int var1) {
      com.kolipri.kimp.p var2 = (com.kolipri.kimp.p)this.F.b(var1);
      com.kolipri.kpr.f var3 = new com.kolipri.kpr.f();
      if (var2 != null) {
         new cb(super.b_);
         String var7 = "";
         if (var2.a("lastname") != null) {
            var7 = var2.a("lastname");
         }

         if (var7.length() > 0) {
            var7 = var7 + " ,";
         }

         if (var2.a("firstname") != null) {
            var7 = var7 + var2.a("firstname");
         }

         if (var7.length() == 0 && var2.a("displayname") != null) {
            var7 = var2.a("displayname");
         }

         this.h = var7;
         if (this.i.equals("mobile")) {
            if (var2.a("phone") != null) {
               var3 = cb.c(var2.a("phone").toString());
            }
         } else if (var2.a("email") != null) {
            var3 = cb.c(var2.a("email").toString());
         }
      }

      return var3;
   }

   private com.kolipri.kpr.f e(int var1) {
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      com.kolipri.kimp.p var3 = (com.kolipri.kimp.p)this.F.b(var1);
      if (this.i.equals("mobile")) {
         if (var3 != null && var3.a("mobile") != null) {
            new cb(super.b_);
            var2 = cb.c(var3.a("mobile"));
         }
      } else if (var3 != null && var3.a("custom-email") != null) {
         new cb(super.b_);
         var2 = cb.c(var3.a("custom-email"));
      }

      return var2;
   }

   private void H() {
      if (this.a != null) {
         com.kolipri.kimp.p var1 = (com.kolipri.kimp.p)this.F.b(this.I);
         com.kolipri.kimp.p var2;
         (var2 = new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var1);
         if (this.a.b != null) {
            String var3 = null;
            if (this.a.b.b(0) == null) {
               this.g = false;
               var2.b("mobile", "");
               var2.b("custom-email", "");
            } else {
               var3 = this.a.b.b(0).toString();
               this.g = true;
               if (this.i.equals("mobile")) {
                  var2.b("mobile", var3);
               } else {
                  var2.b("custom-email", var3);
               }
            }
         }

         this.F.a(this.I, var2);
         this.F.c((com.kolipri.kimp.p)this.F.b(this.I + 1));
      }

      this.w();
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Options", "OK");
   }

   public final void b(String var1) {
      if (this.F == null || this.F.b() == 0) {
         this.f();
      }

      if (var1.equals("Options")) {
         com.kolipri.kt.ae var6;
         (var6 = new com.kolipri.kt.ae(super.b_, "buddy-list-options")).a(30, (com.kolipri.kt.ai)null, "Auto Select Number");
         var6.a(34, (com.kolipri.kt.ai)null, "Auto Select All");
         var6.a(33, (com.kolipri.kt.ai)null, "Skip this Contact");
         var6.a(31, (com.kolipri.kt.ai)null, "Cancel Operation");
         var6.a(this);
         com.kolipri.kt.g var7;
         (var7 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var6);
         var7.a(super.b_.c());
      } else {
         if (var1.equals("OK")) {
            if (this.g) {
               this.G();
            }

            this.w();
            if (this.F == null) {
               this.f();
            }

            com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();

            for(int var3 = 0; this.F != null && var3 < this.F.b(); ++var3) {
               com.kolipri.kimp.p var4 = (com.kolipri.kimp.p)this.F.b(var3);
               (new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var4);
               if (var4 != null) {
                  if (!this.i.equals("mobile") || var4.a("mobile") != null && !var4.a("mobile").equals("")) {
                     if (this.i.equals("email") && (var4.a("custom-email") == null || var4.a("custom-email").equals(""))) {
                        var2.a(var4);
                     }
                  } else {
                     var2.a(var4);
                  }
               }
            }

            if (var2.b() != 0) {
               this.c("* Please select one number in the list");
               return;
            }

            this.I();
         } else if (var1.equals("Select")) {
            this.H();
         }

      }
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      switch(var2) {
      case 30:
         this.f(this.I);
         --this.I;
         this.G();
         this.w();
         break;
      case 31:
         this.f();
      case 32:
      default:
         break;
      case 33:
         this.F.c((com.kolipri.kimp.p)this.F.b(this.I));
         this.G();
         break;
      case 34:
         com.kolipri.kpr.f var3 = new com.kolipri.kpr.f();

         for(int var4 = 0; this.F != null && var4 < this.F.b(); ++var4) {
            com.kolipri.kimp.p var5 = (com.kolipri.kimp.p)this.F.b(var4);
            com.kolipri.kimp.p var6;
            (var6 = new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var5);
            if (var5 != null) {
               this.H = this.a(var4);
               boolean var7 = false;

               for(int var8 = 0; this.i.equals("mobile") && var8 < this.H.b(); ++var8) {
                  if (com.kolipri.kimp.e.b(this.H.b(var8).toString(), ((Kalypte)super.b_).h.a("kalypte.localprefixes"))) {
                     var6.b("mobile", this.H.b(var8).toString());
                     var3.a(var6);
                     var7 = true;
                     break;
                  }
               }

               if (this.i.equals("mobile") && !var7) {
                  if (c(this.H) == null) {
                     var6.b("mobile", this.H.b(0).toString());
                  } else {
                     var6.b("mobile", c(this.H));
                  }

                  var3.a(var6);
               } else if (this.i.equals("email")) {
                  var6.b("custom-email", this.H.b(0).toString());
                  var3.a(var6);
               }
            }
         }

         this.F = var3;
         this.I();
      }

      return true;
   }

   private static String c(com.kolipri.kpr.f var0) {
      String var1 = null;

      for(int var2 = 0; var0 != null && var2 < var0.b(); ++var2) {
         if (var0.b(var2).toString().length() > 10) {
            var1 = var0.b(var2).toString();
            break;
         }
      }

      return var1;
   }

   private void I() {
      for(int var1 = 0; this.G != null && var1 < this.G.b(); ++var1) {
         this.F.a(this.G.b(var1));
      }

      if (this.F != null && this.F.b() > 0 && this.f != null) {
         this.f.b(this.F);
      }

      this.f();
   }

   private void f(int var1) {
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();

      for(int var3 = 0; this.F != null && var3 < this.F.b(); ++var3) {
         if (var3 == var1) {
            com.kolipri.kimp.p var4 = (com.kolipri.kimp.p)this.F.b(var3);
            com.kolipri.kimp.p var5;
            (var5 = new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var4);
            if (var4 != null) {
               this.H = this.a(var3);
               boolean var6 = false;

               for(int var7 = 0; this.i.equals("mobile") && var7 < this.H.b(); ++var7) {
                  if (com.kolipri.kimp.e.b(this.H.b(var7).toString(), ((Kalypte)super.b_).h.a("kalypte.localprefixes"))) {
                     var5.b("mobile", this.H.b(var7).toString());
                     var2.a(var5);
                     var6 = true;
                     break;
                  }
               }

               if (!var6 && this.i.equals("mobile")) {
                  if (c(this.H) == null) {
                     var5.b("mobile", this.H.b(0).toString());
                  } else {
                     var5.b("mobile", c(this.H));
                  }

                  var2.a(var5);
               } else if (this.i.equals("email")) {
                  var5.b("custom-email", this.H.b(0).toString());
                  var2.a(var5);
               }
            }
         } else {
            var2.a(this.F.b(var3));
         }
      }

      this.F = var2;
   }

   public final void b(com.kolipri.kpr.f var1) {
      this.f();
   }

   private void c(String var1) {
      if (var1 != null) {
         com.kolipri.kt.a var2;
         (var2 = new com.kolipri.kt.a(super.b_)).a();
         var2.a(var1);
         var2.a(super.b_.c());
      }

   }
}
