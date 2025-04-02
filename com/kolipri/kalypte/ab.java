package com.kolipri.kalypte;

public final class ab extends com.kolipri.kt.v implements com.kolipri.kt.b, com.kolipri.kimp.j, cg, com.kolipri.kt.o {
   public String a = new String("");
   protected com.kolipri.kimp.p b = null;
   public int c = -1;

   public ab(com.kolipri.kt.r var1) {
      super(var1, new v(var1));
      super.e.a(this);
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
   }

   public final void f() {
      super.f();
      ((Kalypte)super.b_).j.b(this);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Options", "Menu");
   }

   private com.kolipri.kimp.p G() {
      return ((v)super.e).a_(super.f);
   }

   private void g(String var1) {
      com.kolipri.kimp.p var2;
      if ((var2 = this.G()) != null && var1 != null && var1.length() >= 1 && ((Kalypte)super.b_).i != null) {
         com.kolipri.kimp.s var3 = new com.kolipri.kimp.s();
         if (((Kalypte)super.b_).s() != null) {
            var3.b = ((Kalypte)super.b_).s().d();
         }

         if (var1.equals("yahoo")) {
            var3.c = var2.a("yahoo-id");
            var3.e = "yahoo";
            var3.q = true;
         } else if (var1.equals("msn")) {
            var3.c = var2.a("msn-id");
            var3.e = "msn";
            var3.q = true;
         } else if (var1.equals("smsr")) {
            var3.c = var2.c(((Kalypte)super.b_).h.a("kalypte.countrycode"));
            var3.q = true;
            var3.e = "smsr";
         } else if (var1.equals("sms")) {
            var3.c = var2.c(((Kalypte)super.b_).h.a("kalypte.countrycode"));
            var3.q = true;
            var3.e = "sms";
         } else if (var1.equals("email")) {
            var3.c = var2.c();
            var3.e = "email";
            var3.q = true;
         }

         var3.d = "Invitation was sent to your friend.";
         ((Kalypte)super.b_).i.a(var3);
      }
   }

   public final boolean a(com.kolipri.kt.al var1) {
      boolean var2 = false;
      var2 = super.a(var1);
      if (var1.b == 1 || var1.b == 2) {
         String var3 = ((v)super.e).h(super.f);
         this.a = var3;
      }

      return var2;
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      this.c = var2;
      com.kolipri.kimp.p var3;
      String var4;
      bu var18;
      if (var1.a().equals("buddylist")) {
         if (super.f == 0) {
            this.H();
         } else {
            com.kolipri.kimp.p var10000 = this.G();
            var3 = null;
            if (var10000 != null) {
               this.J();
            } else if ((var4 = ((v)var1).h(super.f)) != null) {
               this.a = var4;
               if (!((v)var1).a(var4)) {
                  this.i(var4);
               } else if (super.A != 0) {
                  int var5;
                  if ((var5 = super.f - super.g + 1) < 0) {
                     var5 = 0;
                  }

                  super.f = super.f;
                  this.a(var5, true);
               }

               ((v)var1).b(var4);
               this.w();
            }
         }
      } else {
         String var7;
         com.kolipri.kpr.f var8;
         String var20;
         if (var1.a().equals("buddyoptions")) {
            String var6;
            com.kolipri.kpr.f var9;
            com.kolipri.kpr.f var10;
            switch(var2) {
            case 0:
               if ((var3 = this.G()) != null && var3.a("amaz-cid") != null && ((Kalypte)super.b_).i != null) {
                  var3.b("authorized", "yes");
                  ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(var3));
               }

               this.L();
               break;
            case 1:
               if ((var3 = this.G()) != null) {
                  if ((var4 = var3.a("username")) != null && var4.length() > 0) {
                     cs.a(super.b_, var4, (String)null);
                  }

                  if (var3.a("abm") != null && var3.a("abm").equals("yes")) {
                     var3.b("abm", "");
                     ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(var3));
                  }
               }

               this.L();
               break;
            case 2:
               var3 = this.G();
               bl var21 = null;
               if (var3 != null) {
                  if (var3.a("username") != null) {
                     var21 = new bl(super.b_, var3.a("username"), "im");
                  } else if (var3.a("yahoo-id") != null) {
                     var21 = new bl(super.b_, var3.a("yahoo-id"), "yahoo");
                  } else if (var3.a("msn-id") != null) {
                     var21 = new bl(super.b_, var3.a("msn-id"), "msn");
                  }
               }

               if (var21 != null) {
                  var21.d();
               }

               this.L();
               break;
            case 3:
               if ((var3 = this.G()) != null && var3.c(((Kalypte)super.b_).h.a("kalypte.countrycode")) != null) {
                  (new bl(super.b_, var3.c(((Kalypte)super.b_).h.a("kalypte.countrycode")), "sms")).d();
               }

               this.L();
               break;
            case 4:
               if ((var3 = this.G()) != null) {
                  ao var19;
                  (var19 = new ao(super.b_, var3)).a();
                  var19.a(super.b_.c());
               }

               this.L();
               break;
            case 5:
               if ((var3 = this.G()) != null && (var18 = bu.f(this)) != null) {
                  var18.a(var3);
               }

               this.L();
            case 6:
            case 17:
            default:
               break;
            case 7:
               if ((var3 = this.G()) != null) {
                  cz var17;
                  (var17 = new cz(super.b_, var3)).a();
                  var17.a(this.v());
               }

               this.L();
               break;
            case 8:
               var3 = this.G();
               this.a(var3);
               break;
            case 9:
               if ((var3 = this.G()) != null) {
                  bj var16;
                  (var16 = new bj(super.b_)).c.a(new com.kolipri.kimp.p(var3));
                  var16.a((com.kolipri.kt.l)this);
               }

               this.L();
               break;
            case 10:
               this.g("yahoo");
               this.L();
               break;
            case 11:
               this.g("msn");
               this.L();
               break;
            case 12:
               this.g("smsr");
               this.L();
               break;
            case 13:
               this.g("sms");
               this.L();
               break;
            case 14:
               this.g("email");
               this.L();
               break;
            case 15:
               if ((var3 = this.G()) != null && var3.c() != null) {
                  (new bl(super.b_, var3.c(), "email")).d();
               }

               this.L();
               break;
            case 16:
               if ((var3 = this.G()) != null && var3.c(((Kalypte)super.b_).h.a("kalypte.countrycode")) != null) {
                  (new bl(super.b_, var3.c(((Kalypte)super.b_).h.a("kalypte.countrycode")), "smsr")).d();
               }

               this.L();
               break;
            case 18:
               if ((var3 = this.G()) != null) {
                  com.kolipri.kimp.p var15;
                  (var15 = new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var3);
                  boolean var22 = false;
                  var6 = "";
                  var7 = "";
                  if (var15.a("groups") != null) {
                     var6 = var15.a("groups");
                  }

                  if (var6 != null && var6.indexOf("chatterbox") > -1) {
                     var22 = false;
                  } else {
                     var22 = true;
                  }

                  var8 = null;
                  new cb(super.b_);
                  var9 = null;
                  var10 = cb.c(var6);
                  if (!var22) {
                     var10.c("chatterbox");
                  } else {
                     var10.a("chatterbox");
                  }

                  for(int var46 = 0; var10 != null && var46 < var10.b(); ++var46) {
                     if (var7.length() > 0) {
                        var7 = var7 + ",";
                     }

                     var7 = var7 + var10.b(var46);
                  }

                  var15.b("groups", var7 == null ? "" : var7);
                  ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(var15));
               }

               this.L();
               break;
            case 19:
               if ((var3 = this.G()) != null) {
                  this.b = var3;
                  dk var14 = new dk(super.b_, this);
                  var20 = "";
                  var6 = "";
                  var7 = "";
                  if (var3.a("groups") != null) {
                     var20 = var3.a("groups");
                  }

                  if (var3.a("username") != null) {
                     var7 = var3.a("username");
                  }

                  new cb(super.b_);
                  var8 = null;
                  var9 = cb.c(var20.toString());
                  new cb(super.b_);
                  var10 = null;
                  com.kolipri.kpr.f var11 = cb.c(((Kalypte)super.b_).k.f);

                  int var12;
                  for(var12 = 0; var11 != null && var12 < var11.b(); ++var12) {
                     if (var7 != null && var11.b(var12).equals(var7)) {
                        var9.a("most_frequent");
                        break;
                     }
                  }

                  for(var12 = 0; var9 != null && var12 < var9.b(); ++var12) {
                     if (var6.length() > 0) {
                        var6 = var6 + ",";
                     }

                     var6 = var6 + var9.b(var12);
                  }

                  var14.g(var6);
                  var14.a(super.b_.c());
               }

               this.L();
            }
         } else if (var1.a().equals("addbymobile")) {
            switch(var2) {
            case 70:
               (new cs(super.b_, "mobile")).c();
               break;
            case 71:
               (new x(super.b_)).c();
            }
         } else if (var1.a().equals("buddy-list-options")) {
            switch(var2) {
            case 30:
               if (((Kalypte)super.b_).t()) {
                  com.kolipri.kt.a var29;
                  (var29 = new com.kolipri.kt.a(this, super.b_, this) {
                     protected ab e = null;

                     public {
                        this.e = var3;
                     }

                     public final void a() {
                        super.a();
                        this.a("* Warning\n\nYour buddy list now has " + ((Kalypte)super.b_).k.c() + " contacts displayed. " + "Adding or inviting new buddies is allowed but you " + "won't be able to see them in your buddy list anymore.\n\n" + "Would you like to continue?");
                     }

                     public final void a(com.kolipri.kt.x var1) {
                        var1.a("Yes", "No");
                     }

                     public final void b(String var1) {
                        if (var1.equals("Yes")) {
                           this.e.d();
                        }

                        this.f();
                     }
                  }).a();
                  var29.a(super.b_.c());
               } else {
                  this.d();
               }
               break;
            case 32:
               this.H();
               break;
            case 37:
               this.I();
               break;
            case 39:
               cw var37;
               if ((var37 = ((Kalypte)super.b_).n()) != null && var37.b() != null) {
                  var37.b().K();
                  var37.g();
               }
               break;
            case 41:
               ah var25;
               (var25 = new ah(super.b_)).a();
               var25.a(super.b_.c());
               break;
            case 42:
               ck var24;
               if (super.m instanceof b && (var24 = ((b)super.m).b()) != null) {
                  var24.a("");
               }
               break;
            case 60:
               com.kolipri.kpr.f var23 = new com.kolipri.kpr.f();
               var4 = null;
               var20 = null;
               boolean var26 = false;
               if (super.f == 0) {
                  break;
               }

               var7 = null;
               var8 = this.h(this.a);
               int var34 = 0;

               for(; var8 != null && var34 < var8.b(); ++var34) {
                  com.kolipri.kimp.p var36;
                  if ((var36 = (com.kolipri.kimp.p)var8.b(var34)) != null && (var36.j() || var36.f() || var36.g())) {
                     if (var36.j()) {
                        var23.a(var36.c(((Kalypte)super.b_).h.a("kalypte.countrycode")));
                        if (var34 == 0) {
                           var36.c(((Kalypte)super.b_).h.a("kalypte.countrycode"));
                        }
                     } else if (var36.f()) {
                        var23.a(var36.a("username"));
                        if (var34 == 0) {
                           var36.a("username");
                        }
                     } else if (var36.g()) {
                        if (var36.h()) {
                           var23.a(var36.a("yahoo-id"));
                           if (var34 == 0) {
                              var36.a("yahoo-id");
                           }
                        } else if (var36.i()) {
                           var23.a(var36.a("msn-id"));
                        }

                        if (var34 == 0) {
                           var36.a("msn-id");
                        }
                     }

                     if (var34 == 0) {
                        com.kolipri.kimp.p var44 = new com.kolipri.kimp.p(var36);
                        var23.c(var44);
                     }
                  }
               }

               if (var8 != null && var8.b() > 0 && !this.a.equals("action_required")) {
                  bl var41;
                  (var41 = new bl(super.b_, "", "random")).i = var8;
                  var41.a(false);
                  var41.d();
               }
               break;
            case 62:
               this.J();
               break;
            case 99:
               this.K();
               this.w();
            }

            b var30;
            if ((var30 = (b)this.u()) != null) {
               var30.b().a("");
            }
         } else if (var1.a().equals("buddy-list-menu")) {
            switch(var2) {
            case 11:
               ((Kalypte)super.b_).q();
               break;
            case 40:
               com.kolipri.kalypte.z.a(super.b_);
            case 80:
            case 90:
            }
         }
      }

      if (var1.a().equals("add-buddy-options")) {
         switch(var2) {
         case 1:
            (new h(super.b_)).a("add-buddy-by-mobile");
            break;
         case 2:
            (new cs(super.b_, "username")).c();
            break;
         case 3:
            (new h(super.b_)).a("add-other-contact");
            break;
         case 4:
            (new br(super.b_)).c();
         }
      } else if (var1.a().equals("managegroup")) {
         cb var28;
         switch(var2) {
         case 62:
            bw var32;
            (var32 = new bw(super.b_, this.a, "renamegroup")).a();
            var32.b();
            break;
         case 63:
            this.j(this.a);
            break;
         case 64:
            com.kolipri.kpr.f var33 = this.h(this.a);
            cb var27;
            (var27 = new cb(super.b_)).a();
            var27.b(this.a);

            for(int var39 = 0; var33 != null && var39 < var33.b(); ++var39) {
               com.kolipri.kimp.p var31 = (com.kolipri.kimp.p)var33.b(var39);
               com.kolipri.kimp.p var43;
               (var43 = new com.kolipri.kimp.p()).a((com.kolipri.kpr.b)var31);
               String var45 = "";
               if (var43.a("groups") != null) {
                  var45 = var43.a("groups");
               }

               new cb(super.b_);
               new com.kolipri.kpr.f();
               com.kolipri.kpr.f var13;
               (var13 = cb.c(var45)).c(this.a);
               String var47 = cb.a(var13);
               var43.b("groups", var47);
               ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(var43));
            }

            ((Kalypte)super.b_).k.d();
            ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.c(this.a));
            this.w();
         case 65:
         default:
            break;
         case 66:
            (new cb(super.b_)).b();
            break;
         case 67:
            (var28 = new cb(super.b_)).a();
            var28.b("1", this.a);
            this.w();
            break;
         case 68:
            (var28 = new cb(super.b_)).a();
            var28.b("0", this.a);
            this.w();
         }
      } else if (var1.a().equals("statuses")) {
         switch(var2) {
         case 1:
            dj var42;
            (var42 = new dj(super.b_)).a();
            var42.a(super.b_.c());
            break;
         case 2:
            co var40;
            (var40 = new co(super.b_)).a();
            var40.a(super.b_.c());
            break;
         case 3:
            e var38;
            (var38 = new e(super.b_)).a();
            var38.b();
            break;
         case 20:
            ((Kalypte)super.b_).c("freeforchat", (String)null);
            break;
         case 30:
            ((Kalypte)super.b_).c("notavailable", (String)null);
            break;
         case 40:
            ((Kalypte)super.b_).c("offline", (String)null);
            break;
         case 100:
            db var35;
            (var35 = new db(super.b_)).a();
            var35.b();
            break;
         case 101:
            (new aa(super.b_)).a();
         }
      } else if (var1.a().equals("history-options")) {
         switch(var2) {
         case 1:
            if ((var3 = this.G()) != null && (var18 = bu.f(this)) != null) {
               var18.a(var3, "em");
            }
            break;
         case 2:
            if ((var3 = this.G()) != null && (var18 = bu.f(this)) != null) {
               var18.a(var3, "email");
            }
         }
      }

      return true;
   }

   public final void b(String var1) {
      if (var1.equals("Options")) {
         com.kolipri.kt.ae var5 = new com.kolipri.kt.ae(super.b_, "buddy-list-options");
         com.kolipri.kimp.p var3 = this.G();
         if (super.f != 0 && var3 != null) {
            var5.a(62, (com.kolipri.kt.ai)null, "Contact");
         }

         if (super.f != 0 && var3 == null && !this.a.equals("action_required")) {
            var5.a(60, (com.kolipri.kt.ai)null, "Send Group Message");
         }

         if (super.f != 0 && var3 == null) {
            var5.a(37, (com.kolipri.kt.ai)null, "Manage Groups");
         }

         var5.a(99, (com.kolipri.kt.ai)null, "New Group");
         var5.a(30, (com.kolipri.kt.ai)null, "Add/Invite Buddies");
         var5.a(41, (com.kolipri.kt.ai)null, "Clear Message History");
         if (((Kalypte)super.b_).k.d.length() > 0) {
            var5.a(42, (com.kolipri.kt.ai)null, "Clear Search Bar");
         }

         var5.a(39, (com.kolipri.kt.ai)null, "Uzzap Help");
         var5.a(this);
         com.kolipri.kt.g var4;
         (var4 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var5);
         var4.a(this.v());
      } else if (var1.equals("Menu")) {
         cw var2;
         if ((var2 = ((Kalypte)super.b_).n()) != null) {
            var2.G();
         }

      } else {
         if (var1.equals("Select")) {
            if (this.c == 1) {
               (new h(super.b_)).a("add-buddy-by-mobile");
               return;
            }

            if (this.c == 2) {
               (new cs(super.b_, "username")).c();
               return;
            }

            if (this.c == 3) {
               (new h(super.b_)).a("add-other-contact");
               return;
            }

            if (this.c == 4) {
               (new br(super.b_)).c();
            }
         }

      }
   }

   private void H() {
      com.kolipri.kt.ae var1;
      (var1 = new com.kolipri.kt.ae(super.b_, "statuses")).a(100, super.b_.a.b("statusmessage"), "Status Message..");
      var1.a(20, super.b_.a.b("online"), "Available");
      var1.a(30, super.b_.a.b("notavailable"), "Not Available");
      var1.a(40, super.b_.a.b("offline"), "Invisible");
      var1.a(101, super.b_.a.b("settings"), "Settings..");
      var1.a(this);
      com.kolipri.kt.g var2;
      (var2 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var1);
      var2.a(super.b_.c());
      int var3 = (super.f - super.j) * this.g() + this.F().b + 8;
      com.kolipri.kt.d var5 = var2.s();
      var2.a(new com.kolipri.kt.d(var5.a - 32, var5.b));
      if (var3 + var5.b > this.F().b + this.s().b) {
         var3 = this.F().b + this.s().b - var5.b;
      }

      var2.a(new com.kolipri.kt.ag(32, var3));
   }

   private void I() {
      com.kolipri.kt.ae var1;
      (var1 = new com.kolipri.kt.ae(super.b_, "managegroup")).a(62, (com.kolipri.kt.ai)null, "Rename Group");
      if (!this.a.equals("buddies") && !this.a.equals("action_required") && !this.a.equals("other_contacts")) {
         var1.a(63, (com.kolipri.kt.ai)null, "Manage Buddies in Group");
      }

      if (!this.a.equals("buddies") && !this.a.equals("action_required") && !this.a.equals("most_frequent") && !this.a.equals("chatterbox") && !this.a.equals("other_contacts")) {
         var1.a(64, (com.kolipri.kt.ai)null, "Delete Group");
      }

      cb var2;
      (var2 = new cb(super.b_)).a();
      String var3 = var2.d(this.a);
      if (!this.a.equals("buddies") && !this.a.equals("action_required") && !this.a.equals("other_contacts")) {
         if (var3.equals("0")) {
            var1.a(67, (com.kolipri.kt.ai)null, "Change Sort to Online First");
         } else {
            var1.a(68, (com.kolipri.kt.ai)null, "Change Sort to Alphabetical");
         }
      }

      var1.a(66, (com.kolipri.kt.ai)null, "Return Groups to Defaults");
      var1.a(this);
      com.kolipri.kt.g var4;
      (var4 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var1);
      var4.a(super.b_.c());
   }

   public final void a() {
      super.a();
   }

   public final void a(com.kolipri.kimp.m var1) {
      this.w();
   }

   public final String E() {
      return "EM - Buddy List";
   }

   private com.kolipri.kpr.f h(String var1) {
      new com.kolipri.kpr.f();
      Object var2 = null;
      return ((Kalypte)super.b_).k.d(var1);
   }

   private void i(String var1) {
      new com.kolipri.kpr.f();
      Object var2 = null;
      if (this.h(var1).b() == 0) {
         this.I();
      }

   }

   public final void a(String var1) {
      if (this.b != null) {
         com.kolipri.kimp.p var2 = new com.kolipri.kimp.p(this.b);
         new cb(super.b_);
         new com.kolipri.kpr.f();
         com.kolipri.kpr.f var4 = null;
         var4 = cb.c(var1);
         String var5 = null;
         var5 = cb.a(var4);
         var2.b("groups", var5 == null ? "" : var5);
         com.kolipri.kpr.f var6 = cb.c(((Kalypte)super.b_).k.f);
         String var7;
         if (var2.a("username") != null) {
            var7 = var2.a("username");
            var6.c(var7);
         } else {
            var6.c(var2.a("custom-displayname"));
         }

         var5 = cb.a(var6);
         var7 = ((Kalypte)super.b_).h.a("amazilia.username");
         ((Kalypte)super.b_).h.b(var7.toString() + ".frequent", var5);
         ((Kalypte)super.b_).h.c();
         ((Kalypte)super.b_).k.f = var5;
         ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(var2));
         ((Kalypte)super.b_).k.e(var1);
      }

   }

   public final void d() {
      com.kolipri.kt.ae var1;
      (var1 = new com.kolipri.kt.ae(super.b_, "add-buddy-options")).a(4, (com.kolipri.kt.ai)null, "Invite Friends to Uzzap");
      var1.a(1, (com.kolipri.kt.ai)null, "Add Buddy by Mobile");
      var1.a(2, (com.kolipri.kt.ai)null, "Add Buddy by User ID");
      var1.a(3, (com.kolipri.kt.ai)null, "Add Other Contact");
      var1.a(this);
      com.kolipri.kt.g var2;
      (var2 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var1);
      var2.a(super.b_.c());
   }

   private void J() {
      com.kolipri.kimp.p var1 = this.G();
      bo var2;
      (var2 = new bo(super.b_, var1)).a(this);
      com.kolipri.kt.g var3;
      (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var2);
      var3.a(this.v());
      int var4 = (super.f - super.j) * this.g() + this.F().b + 8;
      com.kolipri.kt.d var6 = var3.s();
      var3.a(new com.kolipri.kt.d(var6.a - 32, var6.b));
      if (var4 + var6.b > this.F().b + this.s().b) {
         var4 = this.F().b + this.s().b - var6.b;
      }

      var3.a(new com.kolipri.kt.ag(32, var4));
   }

   private void a(com.kolipri.kimp.p var1) {
      com.kolipri.kt.ae var2 = new com.kolipri.kt.ae(super.b_, "history-options");
      if (var1 != null) {
         if (var1.j()) {
            var2.a(1, (com.kolipri.kt.ai)null, "View SMS History");
         } else if (var1.f()) {
            var2.a(1, (com.kolipri.kt.ai)null, "View EM/SMS History");
         }
      }

      var2.a(2, (com.kolipri.kt.ai)null, "View Email");
      var2.a(this);
      com.kolipri.kt.g var3;
      (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var2);
      var3.a(this.v());
   }

   private void j(String var1) {
      boolean var2 = false;
      com.kolipri.kpr.f var3 = this.h(var1);
      com.kolipri.kpr.f var4;
      if ((var4 = ((Kalypte)super.b_).k.c("sms")) != null && var4.b() > 0) {
         by var5 = new by(super.b_, var3, var1);

         for(int var6 = 0; var6 < ((Kalypte)super.b_).k.c.b(); ++var6) {
            com.kolipri.kimp.ac var7;
            if ((var7 = (com.kolipri.kimp.ac)((Kalypte)super.b_).k.c.b(var6)) != null && var7.a() != null && var7.a().equals(var1)) {
               var5.a(var7.b());
               var2 = true;
               break;
            }
         }

         if (!var2) {
            var5.a(var1);
         }

         var5.b(var4);
      }

   }

   private void K() {
      com.kolipri.kt.ad var1;
      (var1 = new com.kolipri.kt.ad(super.b_)).b("New Group");
      var1.a();
      var1.a((com.kolipri.kt.o)this);
      var1.b();
   }

   public final void a_(String var1) {
      if (var1 != null) {
         cb var2;
         (var2 = new cb(super.b_)).a();
         var2.a(var1);
         this.j(var1);
      }

   }

   public final void c_() {
   }

   public final void c(String var1) {
   }

   private void L() {
      b var1;
      if ((var1 = (b)this.u()) != null && !var1.b().d().equals("")) {
         var1.b().a("");
      }

   }
}
