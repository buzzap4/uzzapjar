package com.kolipri.kalypte;

public final class bb extends com.kolipri.kt.i implements com.kolipri.kimp.j, com.kolipri.kt.b {
   private <undefinedtype> a = null;

   public bb(com.kolipri.kt.r var1) {
      super(var1, "frame", (String)null);
      this.d("kt.tabbedpanel.background.color");
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
      ((Kalypte)super.b_).a("smart", true);
      ((Kalypte)super.b_).a("yahoo", false);
      ((Kalypte)super.b_).a("msn", false);
   }

   public final void f() {
      super.f();
      ((Kalypte)super.b_).j.b(this);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("", "Options");
   }

   public final void b() {
      if (this.a != null) {
         this.a.f();
      }

   }

   public final void b(String var1) {
      if (var1.equals("Options")) {
         com.kolipri.kt.ae var2;
         (var2 = new com.kolipri.kt.ae(super.b_, "status-display-options")).a(20, (com.kolipri.kt.ai)null, "Log Off");
         var2.a(30, (com.kolipri.kt.ai)null, "Exit Application");
         var2.a(this);
         com.kolipri.kt.g var3;
         (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var2);
         var3.a(this.v());
      }

   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      switch(var2) {
      case 20:
         ((Kalypte)super.b_).a("smart", false);
         ((Kalypte)super.b_).q();
         break;
      case 30:
         ((Kalypte)super.b_).a("smart", false);
         super.b_.j();
      }

      return true;
   }

   public final void a(com.kolipri.kimp.m var1) {
      if (var1 instanceof com.kolipri.kimp.y) {
         this.w();
      }

   }

   private String a(String var1) {
      String var2 = var1;
      if (var1.equals("idle")) {
         var2 = "Not connected";
      } else if (var1.equals("init")) {
         var2 = "Starting";
      } else if (var1.equals("connecting")) {
         var2 = "Connecting..";
      } else if (var1.equals("waiting")) {
         var2 = "Connecting..";
      } else if (var1.equals("login")) {
         var2 = "Authenticating..";
      } else if (var1.equals("reinit")) {
         var2 = "Initializing..";
      } else if (var1.equals("online")) {
         if (((Kalypte)super.b_).i != null && ((Kalypte)super.b_).i.c().equals("register")) {
            ((Kalypte)super.b_).b("smart", true);
            if (((Kalypte)super.b_).i != null && ((Kalypte)super.b_).i.d() != null) {
               if (((Kalypte)super.b_).i.d().equals("password-reset")) {
                  var2 = "Request sent..";
               } else if (((Kalypte)super.b_).i.d().equals("change-mobile")) {
                  var2 = "Request sent..";
               } else if (((Kalypte)super.b_).i.d().equals("validation")) {
                  var2 = "Request sent..";
               } else if (((Kalypte)super.b_).i.d().equals("pin-request")) {
                  var2 = "Request sent..";
                  if (this.a == null) {
                     this.a = new com.kolipri.kt.a(this, this.t(), this) {
                        private bb e = null;

                        public {
                           this.e = var3;
                        }

                        public final void a() {
                           super.a();
                           this.a("After receiving your Pin please Login to Enter.");
                        }

                        public final void a(com.kolipri.kt.x var1) {
                           var1.a("OK", "");
                        }

                        public final void b(String var1) {
                           if (var1 != null) {
                              ((Kalypte)super.b_).q();
                              super.f();
                              if (this.e != null) {
                                 this.e.b();
                              }
                           }

                           super.f();
                        }
                     };
                     this.a.a();
                     this.a.a(super.b_.c());
                  }
               } else {
                  var2 = "Registering..";
               }
            } else {
               var2 = "Registering..";
            }
         } else {
            var2 = "";
         }
      } else if (var1.equals("disabled")) {
         var2 = "Disconnected";
      }

      return var2;
   }

   public final void a(com.kolipri.kt.e var1) {
      super.a(var1);
      int var2 = 0;
      String var5 = this.a(((Kalypte)super.b_).r());
      com.kolipri.kt.ai var6 = super.b_.a.b("logo-large");
      com.kolipri.kt.j var7 = this.e("kt.default.font");
      if (var6.a().a > this.s().a) {
         var6 = null;
      }

      if (var6 != null) {
         var2 = 0 + var6.a().b + 8;
      }

      var2 += var7.b;
      int var3 = (this.s().b - var2) / 2;
      if (var6 != null) {
         var1.a(new com.kolipri.kt.ag((this.s().a - var6.a().a) / 2, var3), var6);
         var3 += var6.a().b + 8;
      }

      String var8 = null;
      if (((Kalypte)super.b_).i != null) {
         var8 = ((Kalypte)super.b_).i.c();
      }

      com.kolipri.kt.ag var10001;
      com.kolipri.kt.ao var10003;
      if (var8 != null) {
         if (var8.equals("register")) {
            if (((Kalypte)super.b_).i != null && ((Kalypte)super.b_).i.d() != null) {
               if (((Kalypte)super.b_).i.d().equals("password-reset")) {
                  var8 = "[Password Reset]";
               } else if (((Kalypte)super.b_).i.d().equals("change-mobile")) {
                  var8 = "[Change mobile]";
               } else if (((Kalypte)super.b_).i.d().equals("validation")) {
                  var8 = "[Validating]";
               } else if (((Kalypte)super.b_).i.d().equals("pin-request")) {
                  var8 = "[Pin Request]";
               } else {
                  var8 = "[Registering]";
               }
            } else {
               var8 = "[Registering]";
            }
         }

         var10001 = new com.kolipri.kt.ag(this.s().a / 2, var3);
         var10003 = this.f("kalypte.statusdisplay.font.color");
         var1.getClass();
         var1.getClass();
         var1.a(var10001, var7, var10003, var8, 4);
         var3 += var7.b + 4;
      }

      var10001 = new com.kolipri.kt.ag(this.s().a / 2, var3);
      var10003 = this.f("kalypte.statusdisplay.font.color");
      var1.getClass();
      var1.getClass();
      var1.a(var10001, var7, var10003, var5, 4);
   }
}
