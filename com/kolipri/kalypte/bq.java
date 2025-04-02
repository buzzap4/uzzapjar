package com.kolipri.kalypte;

public final class bq extends com.kolipri.kt.l implements com.kolipri.kt.b {
   protected com.kolipri.kt.aq a = null;
   protected String b;
   protected String c;
   protected boolean e = false;
   protected com.kolipri.kpr.f f = new com.kolipri.kpr.f();
   protected com.kolipri.kimp.p g = null;
   private com.kolipri.kpr.f h;
   private com.kolipri.kimp.s i;

   public bq(com.kolipri.kt.r var1) {
      super(var1);
   }

   private com.kolipri.kimp.p c(String var1, String var2) {
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

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Options", "Buddies");
   }

   public final void b(String var1) {
      if (var1.equals("Options")) {
         com.kolipri.kt.ae var4 = new com.kolipri.kt.ae(super.b_, "messenger-options");
         if (!this.e) {
            if (this.c != null && !this.c.equals("admin")) {
               var4.a(10, (com.kolipri.kt.ai)null, "Send New Message");
            }

            if (this.h != null && this.h.b() > 1 && !this.b.equals("yahoo") && !this.b.equals("msn")) {
               var4.a(11, (com.kolipri.kt.ai)null, "Reply All");
            }

            if (this.g != null && this.g.a("amaz-cid") != null) {
               var4.a(20, (com.kolipri.kt.ai)null, "View History");
            }

            if (this.f.b() > 0) {
               var4.a(30, (com.kolipri.kt.ai)null, "Received Contacts");
            }

            var4.a(35, (com.kolipri.kt.ai)null, "Profile");
         } else {
            var4.a(60, (com.kolipri.kt.ai)null, "Accept Buddy Invite");
            var4.a(61, (com.kolipri.kt.ai)null, "Reject Buddy Invite");
            var4.a(10, (com.kolipri.kt.ai)null, "Send Message");
         }

         var4.a(40, (com.kolipri.kt.ai)null, "Close Tab");
         var4.a(this);
         com.kolipri.kt.g var3;
         (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var4);
         var3.a(this.v());
      } else if (var1.equals("Close")) {
         this.D();
      } else {
         bu var2;
         if (var1.equals("Buddies") && (var2 = bu.f(this)) != null) {
            var2.H();
         }

      }
   }

   private void b() {
      if (this.c != null && !this.c.equals("admin")) {
         (new bl(super.b_, this.c, this.b)).d();
      }

   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("messenger-options")) {
         com.kolipri.kimp.p var4;
         bu var6;
         switch(var2) {
         case 10:
            this.b();
            break;
         case 11:
            if (this.i != null) {
               com.kolipri.kimp.p var3;
               if (this.h != null && this.h.b() > 0 && (var3 = (com.kolipri.kimp.p)this.h.b(0)) != null) {
                  if (this.i.e != null && this.i.e.equals("im")) {
                     this.i.a = var3.a("username");
                  } else {
                     this.i.a = var3.c();
                  }

                  this.h.c(var3);
               }

               bl var5 = new bl(super.b_, this.i.a, this.i.e);
               if (this.h != null && this.h.b() > 0) {
                  var5.i = this.h;
               }

               var5.a(false);
               var5.d();
            }
            break;
         case 20:
            if (this.g != null && (var6 = bu.f(this)) != null) {
               var6.a(this.g, this.b);
            }
            break;
         case 30:
            ac var7;
            (var7 = new ac(super.b_)).a(this.f);
            var7.a(super.b_.c());
            break;
         case 35:
            if (this.g != null && (var6 = bu.f(this)) != null) {
               var6.a(this.g);
            }
            break;
         case 40:
            this.D();
            break;
         case 60:
            (new StringBuffer()).append("Looking for '").append(this.c).append("'").toString();
            if ((var4 = ((Kalypte)super.b_).k.a("username", this.c)) != null) {
               (new StringBuffer()).append("Got cid '").append(var4.a("amaz-cid")).append("'").toString();
            }

            if (var4 != null && var4.a("amaz-cid") != null && ((Kalypte)super.b_).i != null) {
               var4.b("authorized", "yes");
               ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(var4));
            }

            this.e = false;
            break;
         case 61:
            if ((var4 = ((Kalypte)super.b_).k.a("username", this.c)) != null && var4.a("amaz-cid") != null && ((Kalypte)super.b_).i != null) {
               ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.a(var4.a("amaz-cid")));
            }

            this.e = false;
            this.D();
         }
      }

      return true;
   }

   public final void a(String var1, String var2) {
      this.b = var1;
      this.c = var2;
      this.g = this.c(this.b, this.c);
      this.d();
   }

   public final void a() {
      super.a();
      this.a = new com.kolipri.kt.aq(super.b_);
      this.a.a();
      this.a.b(true);
      this.d(this.a);
   }

   private void d() {
      if (this.g != null) {
         com.kolipri.kpr.f var1;
         if ((var1 = ((Kalypte)super.b_).m.a(this.g, 10)).b() > 0) {
            for(int var2 = var1.b() - 1; var2 >= 0; --var2) {
               com.kolipri.kimp.s var3;
               if ((var3 = (com.kolipri.kimp.s)var1.b(var2)) != null) {
                  String var4;
                  if (var3.a.equals(this.c) && this.g != null) {
                     var4 = this.g.d();
                  } else {
                     var4 = var3.a;
                  }

                  if (this.b != null && var3.e != null && var3.e.equals(this.b)) {
                     this.a.a("- " + var4 + ":\n" + var3.d + "\n");
                  }
               }
            }
         }

         this.a.b();
         this.w();
      }

   }

   public final boolean b(String var1, String var2) {
      return this.b != null && this.c != null && this.b.equals(var1) && this.c.equals(var2);
   }

   public final void a(com.kolipri.kimp.s var1) {
      StringBuffer var2 = new StringBuffer();
      if (var1 != null) {
         int var3;
         if ((var3 = Integer.parseInt(var1.s != null ? var1.s : "0")) > ((Kalypte)this.t()).i.f()) {
            var2.append("* Message Sending Failed\n");
            var2.append(var1.d + "\n");
            this.a.a(var2.toString());
            this.a.b();
            this.w();
            return;
         }

         if (var3 != 0) {
            return;
         }

         if (var1.o && !this.c.equals("__abm__")) {
            return;
         }

         com.kolipri.kpr.d.b(-1L);
         com.kolipri.kimp.p var5 = null;
         var2.append("* ");
         if (var1.a != null) {
            if (((Kalypte)super.b_).i != null && ((Kalypte)super.b_).i.c() != null && var1.a.equals(((Kalypte)super.b_).i.c())) {
               var5 = ((Kalypte)super.b_).s();
            } else {
               var5 = this.c(var1.e, var1.a);
            }
         }

         var2.append(var5 != null ? var5.d() : var1.b);
         if (var1.f != null && var1.f.length() > 0) {
            try {
               var2.append(" (" + com.kolipri.kpr.d.b(Long.parseLong(var1.f)));
               var2.append(")");
            } catch (Exception var13) {
            }
         }

         var2.append(":\n");
         if (var1.n) {
            if (!var1.o) {
               this.e = true;
               var2.append("[This user has invited you to their buddy list. To accept the invitation, choose \"Accept Buddy Invite\" from the options menu]\nYou can chat with the user in this window before you accept to confirm who they are.]\n");
            } else {
               var2.append("[This user has been automatically added to your buddy list through Automatic Buddy Matching]\n");
            }
         }

         if (var1.d != null && var1.d.length() > 0) {
            var2.append(var1.d + "\n");
         }

         com.kolipri.kimp.p var7;
         if (var1.m != null && var1.m.b() > 0) {
            var2.append("* [" + var1.m.b() + " contacts attached]\n");
            if (var1.a != null && !var1.a.equals(((Kalypte)super.b_).i.c())) {
               for(int var6 = 0; var6 < var1.m.b(); ++var6) {
                  if ((var7 = (com.kolipri.kimp.p)var1.m.b(var6)) != null) {
                     this.f.a(new com.kolipri.kimp.p(var7));
                  }
               }

               var2.append("To view the contacts you have received, choose \"Received contacts\" from the options menu\n");
            }
         }

         com.kolipri.kpr.f var14 = new com.kolipri.kpr.f();
         if (var1.c != null) {
            var14.a(var1.c);
         }

         if (var1.l != null && var1.l.b() > 1) {
            StringBuffer var8 = new StringBuffer();
            boolean var9 = true;
            var8.append("- To: ");
            int var15 = 0;

            while(true) {
               if (var15 >= var1.l.b()) {
                  var8.append("\n");
                  var2.append(var8.toString());
                  break;
               }

               com.kolipri.kimp.p var10;
               if ((var10 = (com.kolipri.kimp.p)var1.l.b(var15)) != null && (var10.a("username") != null || var10.d() != null)) {
                  if (!var9) {
                     var8.append(", ");
                  }

                  var8.append(var10.a("username") == null ? var10.d() : var10.a("username"));
                  if (var10.a("username") != null) {
                     boolean var11 = false;

                     for(int var12 = 0; var12 < var14.b(); ++var12) {
                        if (var10.a("username").equals(var14.b(var12).toString())) {
                           var11 = true;
                           break;
                        }
                     }

                     if (var1.a != null && var1.a.equals(var10.a("username"))) {
                        var11 = true;
                     } else if (var1.c != null && var1.c.equals(var10.a("username"))) {
                        var11 = true;
                     }

                     if (!var11) {
                        var14.a(var10.a("username"));
                     }
                  }

                  var9 = false;
               }

               ++var15;
            }
         }

         var7 = null;
         new cb(this.t());
         String var16 = cb.a(var14);
         var1.h = var16.toString();
         this.a.a(var2.toString());
         this.a.b();
         this.w();
         if (var1.a != null && !var1.a.equals(((Kalypte)super.b_).i.c())) {
            ((Kalypte)super.b_).n.c();
            super.b_.g();
         }

         com.kolipri.kimp.p var17;
         if ((var17 = this.c(this.b, this.c)) != null) {
            ((Kalypte)super.b_).m.a(var17, var1);
         }

         for(int var18 = 0; var1.l != null && var18 < var1.l.b(); ++var18) {
            com.kolipri.kimp.p var19;
            if ((var19 = (com.kolipri.kimp.p)var1.l.b(var18)) != null && var19.a("username") != null && var19.a("username").equals(((Kalypte)super.b_).i.c())) {
               var1.l.c(var19);
            } else if (var18 != 0) {
               if (var19 == null || var19.a("username") == null) {
                  if (var19 == null || var19.a("username") != null) {
                     continue;
                  }

                  if (var1.e.equals("email")) {
                     var1.e = "email";
                  } else {
                     var1.e = "smsr";
                  }
               }

               ((Kalypte)super.b_).m.a(var19, var1);
            }
         }
      }

      this.h = var1.l;
      this.i = var1;
   }

   public final void a(com.kolipri.kt.d var1) {
      super.a(var1);
      this.a.b();
      this.w();
   }

   public final boolean a(com.kolipri.kt.al var1) {
      if (var1.b != 5 && var1.b >= 1 && var1.b <= 7) {
         return super.a(var1);
      } else {
         this.b();
         return true;
      }
   }

   public final String E() {
      String var1 = this.c;
      if (this.g != null) {
         var1 = this.g.d();
      }

      if (var1 == null || var1.length() < 1) {
         var1 = this.c;
      }

      if (this.c.equals("__abm__")) {
         return "New buddies";
      } else if (!this.b.equals("sms") && !this.b.equals("smsr")) {
         if (this.b.equals("email")) {
            return "Email - " + var1;
         } else if (this.b.equals("im")) {
            return "EM - " + var1;
         } else if (this.b.equals("yahoo")) {
            return "Y! - " + var1;
         } else {
            return this.b.equals("msn") ? "MSN - " + var1 : "EM - " + var1;
         }
      } else {
         return "SMS - " + var1;
      }
   }

   public final void z() {
      super.z();
      this.a.b();
   }

   public final boolean a(int var1, int var2) {
      return super.a(var1, var2);
   }

   public final boolean b(int var1, int var2) {
      return super.b(var1, var2);
   }
}
