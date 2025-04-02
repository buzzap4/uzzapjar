package com.kolipri.kalypte;

public final class cx extends com.kolipri.kt.ab implements com.kolipri.kt.b, com.kolipri.kimp.j, cg {
   protected com.kolipri.kimp.p h = null;

   public cx(com.kolipri.kt.r var1, com.kolipri.kimp.p var2) {
      super(var1);
      this.h = var2;
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
   }

   public final void f() {
      super.f();
      ((Kalypte)super.b_).j.b(this);
   }

   public final void a() {
      super.a();
      this.g();
   }

   public final void a(com.kolipri.kt.x var1) {
      String var2 = this.h.a("custom-displayname");
      String var3 = this.h.a("username");
      String var4 = this.h.a("authorized");
      String var5 = this.h.a("status");
      String var6 = this.h.a("type");
      if (this.h != null && var6 != null && var6.equals("amazilia") && (var3 != null && var5 != null && var4 != null || var2 != null && var4 == null && var5 == null || var4 != null && !var4.equals("yes") && var5 != null || var4 == null && var5.equals("unknown"))) {
         var1.a("Options", "Close");
      } else {
         var1.a("", "Close");
      }
   }

   private void g() {
      StringBuffer var1 = new StringBuffer();
      boolean var2 = this.h.a("authorized") == null;
      boolean var3 = false;
      String[] var4 = new String[]{"displayname", "custom-displayname", "yahoo-id", "msn-id", "firstname", "lastname", "message", "mobile", "custom-mobile", "email", "custom-email", "username", "status", "groups"};
      String[] var5 = new String[]{"Nickname", "Custom Nickname", "Yahoo ID", "MSN ID", "First name", "Last name", "Status message", "Mobile", "Custom Mobile", "Email", "Custom Email", "User ID", "Availability", "Groups"};

      for(int var6 = 0; var6 < 14; ++var6) {
         String var7 = var4[var6];
         String var8;
         if ((var8 = this.h.a(var7)) != null && !var8.equals("")) {
            if (var7.equals("yahoo-id") || var7.equals("msn-id")) {
               var2 = false;
               var3 = true;
            }

            if (!var7.equals("message") && !var7.equals("status") || !var2) {
               var1.append("* " + var5[var6] + "\n");
               if (var7.equals("groups")) {
                  var1.append(this.h(var8));
               } else if (var7.equals("status") && !var3) {
                  if (!var8.equals("freeforchat") && !var8.equals("online")) {
                     if (var8.equals("notavailable")) {
                        var1.append("Not Available");
                     } else {
                        var1.append("Offline");
                     }
                  } else {
                     var1.append("Available");
                  }
               } else {
                  var1.append(var8);
               }

               var1.append("\n\n");
            }
         }
      }

      this.c(var1.toString());
      this.w();
   }

   private String h(String var1) {
      StringBuffer var2 = new StringBuffer(((Kalypte)super.b_).h.a("amazilia.username"));
      String var3;
      if ((var3 = ((Kalypte)super.b_).h.a(var2.toString() + ".groups.chatterbox")) != null || var3.equals("")) {
         var3 = "My Friends";
      }

      String var4;
      if ((var4 = ((Kalypte)super.b_).h.a(var2.toString() + ".groups.most_frequent")) != null || var4.equals("")) {
         var4 = "Most Frequent";
      }

      new cb(super.b_);
      com.kolipri.kpr.f var6 = cb.c(var1);
      String var7 = "";

      for(int var8 = 0; var8 < var6.b(); ++var8) {
         if (var8 > 0) {
            var7 = var7 + ", ";
         }

         String var9;
         if ((var9 = (String)var6.b(var8)).equals("chatterbox")) {
            var7 = var7 + var3;
         } else if (var9.equals("most_frequent")) {
            var7 = var7 + var4;
         } else {
            var7 = var7 + var9;
         }
      }

      return var7;
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Options")) {
         com.kolipri.kt.ae var2;
         (var2 = new com.kolipri.kt.ae(super.b_, "helpview-options")).a(10, (com.kolipri.kt.ai)null, "Edit Buddy Info");
         var2.a(100, (com.kolipri.kt.ai)null, "Close Tab");
         var2.a(this);
         com.kolipri.kt.g var3;
         (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var2);
         var3.a(super.b_.c());
      } else {
         if (var1.equals("Close")) {
            this.D();
         }

      }
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var2 == 10) {
         com.kolipri.kalypte.s.a(super.b_, this.h);
      } else if (var2 == 100) {
         this.D();
      }

      return true;
   }

   private static com.kolipri.kpr.f a(com.kolipri.kimp.q var0) {
      com.kolipri.kpr.f var1 = new com.kolipri.kpr.f();
      com.kolipri.kimp.p var2 = null;

      for(int var4 = 0; var4 < var0.b(); ++var4) {
         String var3;
         if ((var3 = var0.a(var4)) != null && var3.length() >= 1) {
            if (var3.equals("iq/vcard")) {
               if (var2 != null && var2.b() > 0) {
                  var1.a(var2);
               }

               var2 = new com.kolipri.kimp.p();
            } else if (var3.startsWith("iq/vcard/") && var2 != null && var3.length() > 9) {
               var2.b(var3.substring(9), var0.b(var4));
            }
         }
      }

      if (var2 != null) {
         var1.a(var2);
      }

      return var1;
   }

   private void b(com.kolipri.kimp.q var1) {
      String var2 = var1.a("iq.type");
      String var3 = var1.a("iq/action.name");
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         if (var3.equals("query-roster") && var2.equals("response") || var3.equals("profile-update") || var3.equals("save-contact") && var2.equals("response")) {
            com.kolipri.kpr.f var5 = a(var1);

            for(int var4 = 0; var4 < var5.b(); ++var4) {
               if (this.h.a((com.kolipri.kimp.p)var5.b(var4))) {
                  this.h.a((com.kolipri.kpr.b)((com.kolipri.kimp.p)var5.b(var4)));
                  this.g();
               }
            }
         }
      }

   }

   private void c(com.kolipri.kimp.q var1) {
      if (var1.a("iq.amaz-protocol") != null && var1.a("iq.amaz-protocol").equals("registry")) {
         this.b(var1);
      }

   }

   public final void a(com.kolipri.kimp.m var1) {
      if (var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null) {
         this.c(((com.kolipri.kimp.d)var1).a);
      }

   }

   public final void a(String var1) {
      (new StringBuffer()).append("USER DETAILS GROUPS '").append(var1).append("%'").toString();
      if (this.h != null) {
         com.kolipri.kimp.p var2;
         (var2 = new com.kolipri.kimp.p(this.h)).b("groups", var1 == null ? "" : var1);
         ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.d(var2));
      }

   }

   public final String E() {
      return this.h != null ? this.h.d() + " - Details" : "User Details";
   }
}
