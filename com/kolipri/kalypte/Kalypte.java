package com.kolipri.kalypte;

public class Kalypte extends com.kolipri.kt.r implements com.kolipri.kimp.j {
   public com.kolipri.kpr.m h = new com.kolipri.kpr.m();
   public com.kolipri.kimp.v i = null;
   public at j = new at(this);
   public com.kolipri.kimp.aa k = new com.kolipri.kimp.aa();
   public com.kolipri.kpr.b l = new com.kolipri.kpr.b();
   public com.kolipri.kimp.ad m = new com.kolipri.kimp.ad("NULL");
   public com.kolipri.kpr.p n = new com.kolipri.kpr.p();
   protected com.kolipri.kimp.p o = null;
   protected com.kolipri.kimp.p p = null;
   protected com.kolipri.kimp.p q = null;
   protected com.kolipri.kimp.p r = null;
   protected com.kolipri.kimp.p s = null;
   protected com.kolipri.kimp.p t;
   protected com.kolipri.kpr.b u = new com.kolipri.kpr.b();
   protected cw v = null;
   protected boolean w = true;
   public al x = null;
   public boolean y = false;
   public String z = null;
   private String A = null;
   private bs B;
   private boolean C = false;

   public Kalypte() {
      this.j.a((com.kolipri.kimp.j)this);
   }

   public final void a(String var1) {
      this.A = var1;
      if (this.o != null) {
         this.h.b(this.o.a("username") + ".amazilia-pin", var1);
         this.h.c();
      }

   }

   public final String m() {
      return this.A;
   }

   public final void a() {
      if (this.i != null && this.i.a() != null) {
         this.i.a().a();
      }

   }

   public final cw n() {
      return this.v;
   }

   public final void a(String var1, boolean var2) {
      if (this.v != null && var1 != null && this.v.d() != null) {
         this.v.d().a(var1, var2);
      }

   }

   public final void b(String var1, boolean var2) {
      if (this.v != null && var1 != null && this.v.d() != null) {
         this.v.d().b(var1, var2);
      }

   }

   public final void o() {
      com.kolipri.kimp.g var1;
      if (this.i != null && (var1 = this.i.a()) != null) {
         var1.g();
      }

   }

   public final void h() {
      this.o();
   }

   public final void i() {
      this.o();
   }

   public final boolean d() {
      boolean var1 = false;
      if (super.d()) {
         cw var2;
         (var2 = new cw(this)).b(super.b);
         var2.a();
         var2.a(super.b.b());
         var2.x();
         super.b.a((com.kolipri.kt.l)var2);
         var2.a(true);
         this.v = var2;
         var1 = true;
         this.h.b("amazilia.host", "connect.kolipri.com");
         this.h.b("amazilia.ports", "5222,8734,10873,40932,80,25,20,21,110,443,465");
         this.h.c();
         this.h.c("kalypte_config");
         String var3;
         if ((var3 = this.h.a("amazilia.username")) != null) {
            this.k.f = this.h.a(var3.toString() + ".frequent");
            this.k.l = this.h;
            if (this.h.a(var3.toString() + ".groups.chatterbox") == null || this.h.a(var3.toString() + ".groups.buddies") == null || this.h.a(var3.toString() + ".groups.most_frequent") == null || this.h.a(var3.toString() + ".groups.action_required") == null || this.h.a(var3.toString() + ".groups.other_contacts") == null) {
               cb var4;
               (var4 = new cb(this)).a();
               var4.b();
            }
         }

         if (this.h.a("kolipri.xmpp.autologin") != null && this.h.a("kolipri.xmpp.autologin").equals("yes")) {
            this.a(this.h.a("amazilia.username"), this.h.a("amazilia.password"));
         }

         String var7;
         if ((var7 = this.h.a("kalypte.theme")) != null && var7.length() > 0) {
            try {
               super.a.a(var7);
            } catch (Exception var6) {
               super.a.a("black");
            }
         }

         this.p();
      }

      return var1;
   }

   public final void p() {
      if (this.B != null) {
         this.B.b();
      }

      this.B = null;
      this.B = bs.a((com.kolipri.kt.r)this);
      this.B.a();
   }

   public final void a(com.kolipri.kimp.p var1) {
      this.o = var1;
   }

   public final void b(com.kolipri.kimp.p var1) {
      this.o = null;
      this.t = var1;
   }

   public final void c(com.kolipri.kimp.p var1) {
      this.q = var1;
      this.r = null;
      if (this.i != null) {
         this.i.d("validation");
      }

   }

   public final void d(com.kolipri.kimp.p var1) {
      this.r = var1;
      this.q = null;
      this.t = null;
      if (this.i != null) {
         this.i.d("pin-request");
      }

   }

   public final void e(com.kolipri.kimp.p var1) {
      this.s = var1;
      this.r = null;
      this.o = null;
      if (this.i != null) {
         this.i.d("change-mobile");
      }

   }

   public final void b(String var1) {
      this.z = var1;
      if (this.i != null) {
         this.i.d("password-reset");
      }

   }

   public final void a(String var1, String var2) {
      if (this.i != null) {
         this.i.e();
      }

      if (var1 == null) {
         var1 = new String("");
      }

      if (var2 == null) {
         var2 = new String("");
      }

      var1 = var1.toLowerCase();
      this.k.b();
      this.l.a();
      this.l.b("msn", "disabled");
      this.l.b("yahoo", "disabled");
      this.i = new com.kolipri.kimp.v();
      this.j.a((com.kolipri.kimp.m)(new com.kolipri.kimp.y("init")));
      String var3 = this.h.a("kolipri.xmpp.host_list");
      this.i.b(var3 == null ? "connect.kolipri.com" : var3);
      this.i.c(this.h.a("amazilia.ports"));
      if (!var1.equals("register")) {
         this.h.b("amazilia.username", var1);
         this.h.b("amazilia.password", var2);
         this.h.c();
      }

      this.k.f = this.h.a(var1 + ".frequent");
      if (this.k.f == null) {
         this.h.b(var1 + ".frequent", "");
         this.h.c();
      }

      this.k.l = this.h;
      this.k.f = this.h.a(var1 + ".frequent");
      if (this.h.a(var1 + ".groups.chatterbox") == null || this.h.a(var1 + ".groups.buddies") == null || this.h.a(var1 + ".groups.most_frequent") == null || this.h.a(var1 + ".groups.action_required") == null || this.h.a(var1 + ".groups.other_contacts") == null) {
         cb var4;
         (var4 = new cb(this)).a();
         var4.b();
      }

      this.p = new com.kolipri.kimp.p();
      this.p.b("username", var1);
      this.p.b("password", var2);
      this.i.a(this.j, var1, var2);
   }

   public final void a(String var1, String var2, String var3) {
      if (this.i != null) {
         this.a(var1, true);
         String var4 = "";
         if (this.i != null) {
            var4 = this.i.c();
         }

         this.h.b(var4 + "." + var1 + ".username", var2);
         this.h.b(var4 + "." + var1 + ".password", var3);
         this.h.b(var4 + "." + var1 + ".active", var2.trim().length() == 0 && var3.trim().length() == 0 ? "no" : "yes");
         this.h.c();
         this.i.a(com.kolipri.kimp.l.a(var1, var2, var3));
      }

   }

   public final void c(String var1, boolean var2) {
      if (this.i != null) {
         this.i.a(com.kolipri.kimp.l.a(var1));
      }

      if (var2 && this.i != null) {
         this.h.b(this.i.c() + "." + var1 + ".active", "no");
         this.h.c();
      }

   }

   public final void c(String var1) {
      this.c(var1, true);
   }

   public final void b(String var1, String var2) {
      String var3 = this.i.c();
      if (var1 == null) {
         var1 = this.h.a(var3 + ".amazilia.status");
      }

      if (var2 == null) {
         var2 = this.h.a(var3 + ".amazilia.message");
      }

      if (var1 == null) {
         var1 = "available";
      }

      if (var2 == null) {
         var2 = "";
      }

      if (this.d("yahoo").equals("online")) {
         this.i.a(com.kolipri.kimp.l.b("yahoo", var1, var2));
      }

      if (this.d("msn").equals("online")) {
         this.i.a(com.kolipri.kimp.l.b("msn", var1, var2));
      }

   }

   public final void q() {
      this.w = true;
      this.y = false;
      this.c("yahoo", false);
      this.c("msn", false);
      if (this.i != null) {
         this.i.e();
      }

      this.k.b();
      this.k.f = "";
      this.l.a();
      this.m = new com.kolipri.kimp.ad("NULL");
      if (this.v != null) {
         this.v.z();
      }

   }

   public final String r() {
      String var1 = null;
      if (this.i != null) {
         com.kolipri.kimp.g var2;
         if ((var2 = this.i.a()) != null) {
            var1 = var2.d();
         } else {
            var1 = "init";
         }
      }

      if (var1 == null) {
         var1 = "disabled";
      }

      return var1;
   }

   public final String d(String var1) {
      String var2 = null;
      if (this.i != null) {
         var2 = this.l.a(var1);
      }

      if (var2 == null || var2.length() < 1) {
         var2 = "disabled";
      }

      return var2;
   }

   public final void e(String var1) {
      this.l.b(var1, "online");
      String var2 = "";
      if (this.i != null && this.i.c() != null) {
         var2 = this.i.c();
      }

      String var3 = "";
      String var4 = "";
      if (this.h.a(var2 + ".amazilia.status") != null) {
         var3 = this.h.a(var2 + ".amazilia.status");
      }

      if (this.h.a(var2 + ".amazilia.message") != null) {
         var4 = this.h.a(var2 + ".amazilia.message");
      }

      this.b(var3, var4);
   }

   public final void f(String var1) {
      this.l.b(var1, "disabled");
      this.k.b("type", var1);
   }

   protected final com.kolipri.kpr.f a(com.kolipri.kimp.q var1) {
      com.kolipri.kpr.f var2 = new com.kolipri.kpr.f();
      com.kolipri.kimp.p var3 = null;

      for(int var5 = 0; var5 < var1.b(); ++var5) {
         String var4;
         if ((var4 = var1.a(var5)) != null && var4.length() >= 1) {
            if (var4.equals("iq/vcard")) {
               if (var3 != null && var3.b() > 0) {
                  var2.a(var3);
               }

               var3 = new com.kolipri.kimp.p();
            } else if (var4.startsWith("iq/vcard/") && var3 != null && var4.length() > 9) {
               var3.b(var4.substring(9), var1.b(var5));
            }
         }
      }

      if (var3 != null) {
         if (var3.g()) {
            if (var3.h() && this.d("yahoo").equals("online") || var3.i() && this.d("msn").equals("online")) {
               var2.a(var3);
            }
         } else {
            var2.a(var3);
         }
      }

      return var2;
   }

   protected final void b(com.kolipri.kimp.q var1) {
      String var2 = var1.a("iq.type");
      String var3 = var1.a("iq/action.name");
      if (var2 == null) {
         var2 = new String("set");
      }

      if (var2 != null && var3 != null) {
         com.kolipri.kpr.f var18;
         if (this.i != null && var3.equals("query-private") && var2.equals("response") || var3.equals("save-private") && var2.equals("response")) {
            if ((var18 = this.a(var1)).b() > 0) {
               this.u.a((com.kolipri.kpr.b)var18.b(0));
            }

            if (this.w && var3.equals("query-private")) {
               this.w = false;
               if (v()) {
                  switch(this.u()) {
                  case 0:
                     ca var27;
                     (var27 = new ca(this)).a();
                     var27.a(this.c());
                     ak var23;
                     (var23 = new ak(this)).a();
                     var23.a(this.c());
                     break;
                  case 1:
                     this.x = new al(this);
                     if (this.x.d() > 0) {
                        this.x.b();
                        this.y = true;
                     }
                  case 2:
                  }
               }
            }
         } else {
            int var4;
            if (var3.equals("query-roster") && var2.equals("response") || var3.equals("profile-update") || var3.equals("save-contact") && var2.equals("response")) {
               var18 = this.a(var1);

               for(var4 = 0; var4 < var18.b(); ++var4) {
                  this.k.b((com.kolipri.kimp.p)var18.b(var4));
               }
            } else if (var3.equals("delete-contact") && var2.equals("response")) {
               var18 = this.a(var1);

               for(var4 = 0; var4 < var18.b(); ++var4) {
                  this.k.c((com.kolipri.kimp.p)var18.b(var4));
               }
            } else if (this.i != null && this.i.c() != null && (var3.equals("save-profile") && var2.equals("response") || var3.equals("query-profile") && var2.equals("response")) && var1.a("iq/vcard/username") != null && var1.a("iq/vcard/username").equals(this.i.c())) {
               if ((var18 = this.a(var1)).b() > 0) {
                  this.p.a((com.kolipri.kpr.b)((com.kolipri.kimp.p)var18.b(0)));
               }
            } else {
               String var5;
               String var6;
               String var7;
               if (var3.equals("pre-register") && var2.equals("response")) {
                  this.a(var1);
                  var5 = null;
                  var6 = var1.a("iq/vcard/mobile") == null ? "" : var1.a("iq/vcard/mobile");
                  var7 = var1.a("iq/vcard/username") == null ? "" : var1.a("iq/vcard/username");
                  this.t = null;
                  au var22 = new au(this, "register");
                  au.a(var6, var7);
                  var22.a();
                  var22.a(this.c());
                  if (var6.length() > 0 && var7.length() > 0) {
                     this.h.b(var7 + ".amazilia.registered-number", var6);
                     this.h.c();
                  }

                  com.kolipri.kt.a var26;
                  (var26 = new com.kolipri.kt.a(this)).a();
                  var26.a("* Validate Number\n\nWe will now verify your mobile number. You will shortly receive a Uzzap SMS that will validate your phone number automatically. While this happening, please complete your registration.");
                  var26.a(this.c());
               } else if (var3.equals("register") && var2.equals("response")) {
                  if (this.o != null) {
                     this.h.b("amazilia.username", this.o.a("username"));
                     this.h.b("amazilia.password", this.o.a("password"));
                     this.h.c();
                     this.a(this.o.a("username"), this.o.a("password"));
                  }

                  au.e();
                  this.o = null;
                  this.q = null;
                  this.r = null;
                  this.z = null;
                  this.t = null;
                  this.o = null;
               } else {
                  com.kolipri.kt.a var19;
                  if (var3.equals("validation") && var2.equals("error")) {
                     var5 = var1.a("iq/error.amaz-error");
                     var6 = "";
                     if (var5 != null && var5.equals("invalid-mobile")) {
                        var6 = "* Change mobile number\n\nInvalid format. Change cancelled.";
                     } else if (var5 != null && var5.equals("duplicate-mobile")) {
                        var6 = "* Change mobile\n\nNumber is already in use for another User ID. Change cancelled.";
                     } else if (var5 != null && var5.equals("invalid-parameters")) {
                        var6 = "* Change mobile number\n\nInvalid format. Change cancelled.";
                     } else if (var5 != null && var5.equals("database-error")) {
                        var6 = "* Failed to change mobile\n\nInternal error occur.";
                     } else if (var1.a("iq/error") != null && var1.a("iq/error").length() > 0) {
                        var6 = var1.a("iq/error");
                     }

                     if (var6 != null && var6.length() > 0) {
                        (var19 = new com.kolipri.kt.a(this)).a();
                        var19.a(var6);
                        var19.a(this.c());
                        if (this.i != null && this.i.c() != null && this.i.c().equals("register")) {
                           this.q();
                        }

                        this.s = null;
                     }
                  } else {
                     cb var9;
                     if (var3.equals("rename-group")) {
                        if (this.a(var1).b() > 0) {
                           var6 = var1.a("iq/vcard/new-name") == null ? "" : var1.a("iq/vcard/new-name");
                           var7 = var1.a("iq/vcard/old-name") == null ? "" : var1.a("iq/vcard/old-name");
                           com.kolipri.kpr.f var8 = this.k.d(var7);
                           if (!var6.equals("")) {
                              (var9 = new cb(this)).a();
                              var9.a(var7, var6);
                              this.k.e(var6);
                              this.k.d();
                           }

                           this.k.b(var7);

                           for(int var24 = 0; var8 != null && var24 < var8.b(); ++var24) {
                              com.kolipri.kimp.p var10 = (com.kolipri.kimp.p)var8.b(var24);
                              com.kolipri.kimp.p var11;
                              (var11 = new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var10);
                              var11.b = var10.b;
                              String var12 = "";
                              if (var11.a("groups") != null) {
                                 var12 = var11.a("groups");
                              }

                              new cb(this);
                              new com.kolipri.kpr.f();
                              com.kolipri.kpr.f var14 = cb.c(var12);

                              for(int var16 = 0; var14 != null && var16 < var14.b(); ++var16) {
                                 String var17;
                                 if ((var17 = var14.b(var16).toString()).equals(var7)) {
                                    var14.c(var17);
                                 }
                              }

                              var14.a(var6);
                              String var15 = cb.a(var14);
                              var11.b("groups", var15 == null ? "" : var15);
                              this.k.a(var11);
                           }

                           this.k.d();
                        }
                     } else if (var3.equals("validation") && var2.equals("response")) {
                        var5 = "";
                        var6 = null;
                        if (this.s != null) {
                           var5 = this.s.a("mobile");
                           var6 = this.s.a("username");
                           this.h.b(var6.toString() + ".amazilia-registered-number", var5.toString());
                           this.h.c();
                           this.s = null;
                        }

                        if (this.i != null && this.i.c() != null && this.i.c().equals("register")) {
                           ai var20;
                           (var20 = new ai(this, var5)).c("pin");
                           var20.a();
                           var20.a(this.c());
                        } else {
                           (var19 = new com.kolipri.kt.a(this)).a();
                           var19.a("Change mobile\n\nRequest accepted. Your new mobile number will now be validated prior to use. An SMS will be sent to " + var5.toString() + " your new mobile number");
                           var19.a(this.c());
                        }
                     } else if ((var3.equals("register") || var3.equals("pre-register")) && var2.equals("error")) {
                        var5 = var1.a("iq/error.amaz-error");
                        var6 = null;
                        if (var5 != null && var5.equals("duplicate-username")) {
                           var6 = "* Failed to register\n\nUser ID already in use";
                        } else if (var5 != null && var5.equals("invalid-mobile")) {
                           var6 = "* Failed to register\n\nMobile provided is in invalid format.";
                        } else if (var5 != null && var5.equals("invalid-username")) {
                           var6 = "* Failed to register\n\nUser ID provided is in invalid format.";
                        } else if (var5 != null && var5.equals("invalid-parameters")) {
                           var6 = "* Failed to register\n\nSome information needed is missing.";
                        } else if (var5 != null && var5.equals("empty-username")) {
                           var6 = "* Failed to register\n\nUser ID not provided.";
                        } else if (var5 != null && var5.equals("empty-password")) {
                           var6 = "* Failed to register\n\nPassword not provided.";
                        } else if (var5 != null && var5.equals("empty-mobile")) {
                           var6 = "* Failed to register\n\nMobile not provided.";
                        } else if (var5 != null && var5.equals("failed-to-create")) {
                           var6 = "* Failed to register\n\nRegistration failed for unknown reasons.";
                        } else if (var5 != null && var5.equals("duplicate-mobile")) {
                           var6 = "Your mobile number is already Registered, Please proceed to \"Login to Network\"\n\nTo retrieve your account details, please proceed to the \"Forgotten Password\" Option from the front screen and enter your mobile number. Your User ID and Password will be sent to your mobile address";
                        } else if (var5 != null && var5.equals("register-invalid-pin")) {
                           if (this.o != null) {
                              this.h.b("amazilia.username", this.o.a("username"));
                              this.h.b("amazilia.password", this.o.a("password"));
                              this.h.b(this.o.a("username") + ".amazilia.registered-number", this.o.a("mobile"));
                              this.h.c();
                           }

                           this.q();
                           var6 = "* Mobile Validation\n\nWe have not been able to validate your mobile number.Please wait for the SMS message that should arrive with a validation PIN.  You can log in using your new ID and password then enter the PIN to confirm your number.If you think you may have entered your mobile number incorrectly, you can Login and use the Change Number option.";
                        } else if (var1.a("iq/error") != null && var1.a("iq/error").length() > 0) {
                           var6 = var1.a("iq/error");
                        } else {
                           var6 = "* Failed to register\n\nFailed to register your user account. Please double check all the data entered and try again.";
                        }

                        if (var3.equals("pre-register")) {
                           var7 = var1.a("iq/vcard/mobile") == null ? "" : var1.a("iq/vcard/mobile");
                           String var21 = var1.a("iq/vcard/username") == null ? "" : var1.a("iq/vcard/username");
                           var9 = null;
                           au var25;
                           if (var5 != null && (var5.equals("duplicate-username") || var5.equals("empty-username") || var5.equals("invalid-username"))) {
                              var25 = new au(this, "username");
                           } else {
                              var25 = new au(this, "pre-register");
                           }

                           au.c(var6);
                           au.a(var7, var21);
                           var25.a();
                           var25.a(this.c());
                        } else if (var6 != null && var6.length() > 0) {
                           (var19 = new com.kolipri.kt.a(this)).a();
                           var19.a(var6);
                           var19.a(this.c());
                        }
                     }
                  }
               }
            }
         }
      }

      if (!var3.equals("update-idle-state") && !var3.equals("profile-update")) {
         this.a();
      }

   }

   protected final boolean c(com.kolipri.kimp.q var1) {
      boolean var2 = false;
      String var3 = var1.a("iq.type");
      String var4 = var1.a("iq.amaz-protocol");
      String var5 = var1.a("iq/action.name");
      String var6 = var1.a("iq/error.amaz-error");
      String var7 = "";
      if (var4 != null && var6 != null) {
         String var8 = "";
         if (var4.equals("yahoo")) {
            var8 = "* Yahoo!";
         } else if (var4.equals("msn")) {
            var8 = "* MSN";
         }

         if (var1.a("iq/error") != null && var1.a("iq/error").length() > 0) {
            var7 = var1.a("iq/error");
         } else if (var6.equals("authentication-failed")) {
            var7 = "Invalid username and password.";
         } else if (var6.equals("connection-failed")) {
            var7 = "Server is down. Please try again later.";
         } else if (var6.equals("connection-lost")) {
            var7 = "Lost connection to server.";
         } else if (var6.equals("on-maintenance")) {
            var7 = "Service is under maintenance. Please try again later.";
         } else if (var6.equals("unknown-error")) {
            var7 = "Lost connection to server.";
         }

         if (this.i != null && this.i.c() != null) {
            this.h.b(this.i.c() + "." + var4 + ".active", "no");
            this.h.c();
         }

         if (var7.trim().length() > 0) {
            com.kolipri.kt.a var9;
            (var9 = new com.kolipri.kt.a(this)).a();
            var9.a(var8 + "\n\n" + var7);
            var9.a(this.c());
         }
      } else if (var3 != null && var4 != null && var5 != null && var3.equals("response")) {
         if (var5.equals("login")) {
            this.e(var4);
            var2 = true;
         } else if (var5.equals("logout")) {
            this.f(var4);
            var2 = true;
         }
      }

      return var2;
   }

   protected final void d(com.kolipri.kimp.q var1) {
      try {
         if (var1.a("error/conflict") != null) {
            this.q();
         } else {
            String var3;
            String var4;
            if (var1.a("iq/kolipri-config") != null) {
               var3 = null;
               var4 = null;

               for(int var8 = 0; var8 < var1.b(); ++var8) {
                  if (var1.a(var8) != null) {
                     if (var1.a(var8).equals("iq/kolipri-config")) {
                        if (var3 != null && var4 != null) {
                           this.h.b(var3, var4);
                        }

                        var3 = null;
                        var4 = null;
                     } else if (var1.a(var8).equals("iq/kolipri-config.value")) {
                        var4 = var1.b(var8);
                     } else if (var1.a(var8).equals("iq/kolipri-config.key")) {
                        var3 = var1.b(var8);
                     }
                  }
               }

               this.h.c();
            } else if (var1.a("failure.xmlns") != null && var1.a("failure.xmlns").equals("urn:ietf:params:xml:ns:xmpp-sasl") && var1.a("failure") != null) {
               String var2 = "";
               if (var1.a("failure/not-validated") != null) {
                  this.o = null;
                  var3 = this.h.a("amazilia.username");
                  var4 = this.h.a(var3.toString() + ".amazilia-registered-number");
                  if (var3 != null && var4 != null && this.m() != null) {
                     com.kolipri.kimp.p var9;
                     (var9 = new com.kolipri.kimp.p()).b("username", var3);
                     var9.b("mobile", var4);
                     var9.b("pin", this.m() == null ? "" : this.m());
                     this.c(var9);
                     this.a("register", "register");
                  } else {
                     this.q();
                     ai var5;
                     (var5 = new ai(this)).c("mobile");
                     var5.a();
                     var5.a(this.c());
                  }
               } else if (var1.a("failure/temporary-auth-failure") != null) {
                  var2 = "* Login failed\n\nPlease retry later.";
               } else if (var1.a("failure/invalid-apn") != null) {
                  this.q();
               } else if (var1.a("failure/invalid-credentials") != null && var1.a("failure/invalid-credentials.reason") != null) {
                  if (var1.a("failure/invalid-credentials.reason").equals("userid-not-found")) {
                     var2 = "* Login failed\n\n";
                     var2 = var2 + "The User ID is not registered. Please re-enter or proceed to \"Register a New Account\".";
                  } else if (var1.a("failure/invalid-credentials") != null && var1.a("failure/invalid-credentials").length() > 0) {
                     var2 = var1.a("iq/error");
                  } else {
                     var2 = var1.a("failure/invalid-credentials.reason");
                  }
               } else {
                  var2 = "The password entered is incorrect. Please try again or proceed to the \"Forgotten Password\" option from the front screen and enter your User ID. Your password will be sent to your email address.";
               }

               if (var2 != null && var2.length() > 0) {
                  com.kolipri.kt.a var7;
                  (var7 = new com.kolipri.kt.a(this)).a();
                  var7.a(var2);
                  var7.a(this.c());
                  this.q();
               }

               this.a();
            } else if (var1.a("iq.amaz-protocol") != null && var1.a("iq.amaz-protocol").equals("validation")) {
               this.a();
               this.f(var1);
            } else if (var1.a("iq.amaz-protocol") != null && var1.a("iq.amaz-protocol").equals("accounts")) {
               this.a();
               this.e(var1);
            } else if (var1.a("iq.amaz-protocol") != null && var1.a("iq.amaz-protocol").equals("subscription")) {
               this.a();
               this.g(var1);
            } else {
               if (var1.a("iq.amaz-protocol") == null || !var1.a("iq.amaz-protocol").equals("registry")) {
                  this.c(var1);
                  return;
               }

               this.b(var1);
            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public final void e(com.kolipri.kimp.q var1) {
      String var2 = var1.a("iq.type");
      String var3 = var1.a("iq/error.amaz-error");
      String var4 = "";
      if (var3 != null && var2.equals("error")) {
         if (var3.equals("no-email")) {
            var4 = "* Forgotten Password\nThere is no email address defined on your account.\nPlease contact Smart Customer Care on *888.";
         } else {
            var4 = "* Forgotten Password\nThe Username or mobile number you entered is not currently registered.  Please try again or proceed to ‘Register a New Account’.";
         }
      } else if (var2.equals("response")) {
         var4 = "* Forgotten Password\nYour account details will be sent to the email address registered for your account:" + var1.a("iq/vcard/email") + "\nIf this address is incorrect please contact Smart Customer Care on *888";
      }

      if (var4 != null && var4 != "") {
         com.kolipri.kt.a var5;
         (var5 = new com.kolipri.kt.a(this)).a();
         var5.a(var4);
         var5.a(this.c());
         this.q();
      }

      this.z = null;
   }

   public final void f(com.kolipri.kimp.q var1) {
      String var2 = var1.a("iq.type");
      var1.a("iq/action.name");
      String var4 = var1.a("iq/error.amaz-error");
      String var5 = "";
      if (var4 != null && var2.equals("error")) {
         if (var4 != null && var4.equals("code-not-found")) {
            (new ai(this)).a("Invalid PIN. Your Pin was incorrect, please try again.", "pin", "OK", "", (String)null);
            this.q();
         } else if (var4 != null && var4.equals("validation-code-not-sent")) {
            var5 = "* Failed to validate\n\nValidation code not sent";
         } else if (var4 != null && var4.equals("invalid-mobile")) {
            var5 = "* Failed to validated\n\nYour mobile number is already Registered, please proceed to \"Login to Network\" To retrieve your account details, please proceed to the \"Forgotten Password\" Option from the front screen and enter your mobile number.  Your User ID and Password will be sent to your email address";
         } else if (var4 != null && var4.equals("duplicate-mobile")) {
            var5 = "Your mobile number is already Registered, Please proceed to \"Login to Network\"\n\nTo retrieve your account details, please proceed to the \"Forgotten Password\" Option from the front screen and enter your mobile number. Your User ID and Password will be sent to your mobile address";
         } else if (var4 != null && var4.equals("404")) {
            var5 = "* Failed to validate\n\nValidationBot is down";
         } else if (var1.a("iq/error") != null && var1.a("iq/error").length() > 0) {
            var5 = var1.a("iq/error");
         } else {
            var5 = "* Unknown Error\n\nUnknown system error.";
         }

         if (var5 != null && var5 != "") {
            com.kolipri.kt.a var6;
            (var6 = new com.kolipri.kt.a(this)).a();
            var6.a(var5);
            var6.a(this.c());
            this.q();
         }
      } else if (var2.equals("response")) {
         this.C = true;
         this.q();
      }

      this.r = null;
      this.s = null;
      this.z = null;
   }

   public final void g(com.kolipri.kimp.q var1) {
      String var2 = var1.a("iq.type");
      String var3 = var1.a("iq/action.name");
      String var4 = var1.a("iq/error.amaz-error");
      String var5 = null;
      if (var2 != null && var2.equals("response")) {
         if (var3 != null && var3.equals("subscribe")) {
            String var6 = var1.a("iq/vcard/name") == null ? "" : var1.a("iq/vcard/name");
            String var7 = var1.a("iq/vcard/price") == null ? "" : var1.a("iq/vcard/price");
            String var8 = var1.a("iq/vcard/auto_renew") != null && var1.a("iq/vcard/auto_renew").equals("yes") ? "yes" : "no";
            if (var1.a("iq/vcard/confirmed") != null && var1.a("iq/vcard/confirmed").equals("yes")) {
               String var11 = var1.a("iq/vcard/strdate") == null ? "" : var1.a("iq/vcard/strdate");
               var5 = "* Successful Purchase\n\nThank you for purchasing " + var6 + " package.";
               if (var8.equals("no")) {
                  var5 = var5 + " Your package will expire on " + var11 + "\n\nYou did not select Auto-Renew. When your package expires you will be automatically on transactional billing.";
               } else {
                  var5 = var5 + "\n\nYou selected Auto-Renew so your package will automatically be renewed upon expiry. You can cancel Auto-Renew by selecting Auto-Renew from the Subscription Menu.";
               }
            } else {
               l var9;
               (var9 = new l(this, var6, var7, var8)).a();
               var9.a(this.c());
            }
         }
      } else if (var4 != null && var2 != null && var2.equals("error") && !var3.equals("inquire-history")) {
         if (var1.a("iq/error") != null && var1.a("iq/error").length() > 0) {
            var5 = var1.a("iq/error");
         } else if (var4.equals("invalid-mobile")) {
            var5 = "* Invalid Mobile Number Format\nThe mobile number you registered has an invalid format";
         } else if (var4.equals("out-of-network")) {
            var5 = "* Off Network User\n\nLog on to uzzap.com for more details. Local operator data browsing rates apply.";
         } else if (var4.equals("invalid-parameters")) {
            var5 = "* Application Error\n\nVcard values are incomplete or in invalid format.";
         } else if (var4.equals("not-available")) {
            var5 = "* Request Failed\n\nSmart Billing cannot be contacted. Please try again later.";
         } else if (var4.equals("insufficient-credits")) {
            var5 = "* Request Failed\n\nYour purchase request failed. Please check you have sufficient load before trying again.";
         } else if (var4.equals("not-active")) {
            var5 = "* Inactive Mobile Number\n\nThe mobile number you registered is no longer active.";
         } else if (var4.equals("invalid-package")) {
            var5 = "* Invalid Package\n\nSelected package does not exist.";
         } else if (var4.equals("on-free-trial")) {
            var5 = "* Beta Trial Period\n\nThis service is currently in a free Beta trial period.  There are currently no charges for data or sending messages.  Even after the Beta it will always be free to login and to receive messages!";
         } else if (var4.equals("no-subscription")) {
            var5 = "* Billing Status\n\nYou are not subscribed to a package. You will be charged on a per transaction basis for messages sent.";
         } else if ((var4 == null || !var4.equals("unknown-error")) && var4 != null && var4.equals("database-error")) {
            var5 = "* Database Error\n\nDatabase transaction failed.";
         } else {
            var5 = "* Unknown Error\n\nUnknown system error.";
         }
      }

      if (var5 != null && var5.length() > 0) {
         com.kolipri.kt.a var10;
         (var10 = new com.kolipri.kt.a(this)).a();
         var10.a(var5);
         var10.b = "";
         var10.c = "Close";
         var10.y();
         var10.a(this.c());
      }

   }

   protected final void a(com.kolipri.kimp.s var1) {
      if (var1.n && this.i != null && var1.a != null && !var1.a.equals(this.i.c())) {
         (new StringBuffer()).append("Buddy invitation from '").append(var1.a).append("'").toString();
         com.kolipri.kimp.p var2;
         if ((var2 = this.k.a("username", var1.a)) != null) {
            if (var1.o) {
               String var3;
               if ((var3 = var2.a("authorized")) == null || !var3.equals("yes")) {
                  var2.b("authorized", "yes");
                  this.i.a(com.kolipri.kimp.ae.d(var2));
               }

               return;
            }
         } else {
            (var2 = new com.kolipri.kimp.p()).b("username", var1.a);
            if (var1.o) {
               var2.b("abm", "yes");
               var2.b("authorized", "yes");
            }

            this.i.a(com.kolipri.kimp.ae.d(var2));
         }
      }

   }

   public final void a(com.kolipri.kimp.m var1) {
      if (var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null) {
         this.d(((com.kolipri.kimp.d)var1).a);
      } else if (var1 instanceof com.kolipri.kimp.s) {
         this.a();
         this.a((com.kolipri.kimp.s)var1);
      } else {
         if (var1 instanceof com.kolipri.kimp.y && ((com.kolipri.kimp.y)var1).a.equals("disabled")) {
            if (this.C && this.q != null) {
               this.q = null;
               this.C = false;
               this.a(this.h.a("amazilia.username"), this.h.a("amazilia.password"));
               return;
            }
         } else if (var1 instanceof com.kolipri.kimp.y && ((com.kolipri.kimp.y)var1).a.equals("online")) {
            if (this.t != null) {
               this.t = null;
               return;
            }

            if (this.q != null) {
               this.i.a(com.kolipri.kimp.k.a(this.q));
               this.i.d("validation");
               return;
            }

            if (this.s != null) {
               this.i.a(com.kolipri.kimp.ae.b(this.s.a("mobile"), this.s.a("username")));
               this.i.d("change-mobile");
               return;
            }

            if (this.z != null) {
               this.i.a(com.kolipri.kimp.n.a(this.z));
               this.z = null;
               return;
            }

            if (this.r != null) {
               this.i.a(com.kolipri.kimp.k.b(this.r));
               this.r = null;
               this.i.d("pin-request");
               return;
            }

            if (this.i != null && !this.i.c().equals("register")) {
               this.i.a(com.kolipri.kimp.ae.a());
            }

            this.a("smart", false);
            String var2 = this.i.c();
            String var3 = this.h.a(var2 + ".amazilia.status");
            String var4 = this.h.a(var2 + ".amazilia.message");
            this.m = new com.kolipri.kimp.ad(var2);
            if (var3 == null) {
               var3 = "freeforchat";
            }

            this.c(var3, var4);
            String var6 = this.h.a(var2 + ".yahoo.username");
            String var7 = this.h.a(var2 + ".yahoo.password");
            String var5 = this.h.a(var2 + ".yahoo.active");
            String var9 = this.h.a(var2 + ".msn.username");
            String var10 = this.h.a(var2 + ".msn.password");
            String var8 = this.h.a(var2 + ".msn.active");
            if (var5 != null && var5.equals("yes") && var6 != null && var7 != null) {
               this.a("yahoo", var6, var7);
            }

            if (var8 != null && var8.equals("yes") && var9 != null && var10 != null) {
               this.a("msn", var9, var10);
            }
         }

      }
   }

   public final void c(String var1, String var2) {
      (new StringBuffer()).append("SETSTATUS: STATUS(").append(var1).append(") MESSAGE(").append(var2).append(")").toString();
      if (var2 == null) {
         var2 = new String("");
      }

      if (var2 != null || var1 != null) {
         String var3 = null;
         if (this.i != null && this.i.c() != null) {
            var3 = this.i.c();
         }

         if (var3 == null) {
            var3 = "unknown";
         }

         if (var2 != null) {
            this.h.b(var3 + ".amazilia.message", var2);
         }

         if (var1 != null) {
            this.h.b(var3 + ".amazilia.status", var1);
         }

         this.h.c();
         this.i.a(com.kolipri.kimp.ae.a(var1, var2));
         this.b(var1, var2);
      }

   }

   public final com.kolipri.kimp.p s() {
      return this.p;
   }

   public final boolean t() {
      boolean var1 = false;
      if (this.k != null && this.k.c() > this.k.a()) {
         var1 = true;
      }

      return var1;
   }

   public final int u() {
      byte var1 = 0;
      if (this.u != null) {
         String var2;
         if ((var2 = this.u.a("abm-active")) != null && var2.equals("yes")) {
            var1 = 1;
         } else if (var2 != null && var2.equals("no")) {
            var1 = 2;
         }
      }

      return var1;
   }

   public static boolean v() {
      boolean var0 = false;

      try {
         if (Class.forName("javax.microedition.pim.PIM") != null) {
            var0 = true;
         }
      } catch (Exception var2) {
         var0 = false;
      }

      return var0;
   }

   public static boolean w() {
      boolean var0 = false;

      try {
         if (Class.forName("javax.wireless.messaging.TextMessage") != null) {
            var0 = true;
         }
      } catch (Exception var2) {
         var0 = false;
      }

      return var0;
   }

   public final void g(String var1) {
      new com.kolipri.kpr.f();
      com.kolipri.kpr.f var2 = null;
      String var3 = this.h.a("amazilia.username");
      String var4 = null;
      String var5 = "";
      boolean var6 = false;
      var4 = this.h.a(var3.toString() + ".frequent");
      if (var1 != null) {
         new cb(this);
         var2 = cb.c(var4);

         int var8;
         for(var8 = 0; var8 < var2.b() && var2.b() > 0; ++var8) {
            if (var1.equals(var2.b(var8))) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            var2.a(var1);
         }

         if (var2.b() > 5) {
            var2.a(0);
         }

         for(var8 = 0; var8 < var2.b(); ++var8) {
            if (var5.length() > 0) {
               var5 = var5 + ",";
            }

            var5 = var5 + var2.b(var8);
         }

         this.h.b(var3.toString() + ".frequent", var5);
         this.h.c();
         this.k.f = this.h.a(var3.toString() + ".frequent");
      }

      this.k.e("most_frequent");
   }

   public final void h(String var1) {
      String var2 = null;
      String var3 = this.h.a("amazilia.username");
      var2 = this.h.a(var3.toString() + ".frequent");
      new cb(this);
      com.kolipri.kpr.f var5;
      (var5 = cb.c(var2)).c(var1);
      String var6 = "";

      for(int var7 = 0; var5 != null && var7 < var5.b(); ++var7) {
         if (var6.length() > 0) {
            var6 = var6 + ",";
         }

         var6 = var6 + var5.b(var7);
      }

      this.h.b(var3.toString() + ".frequent", var6);
      this.h.c();
      this.k.f = var6;
      this.k.e("most_frequent");
   }
}
