package com.kolipri.kalypte;

public final class an extends com.kolipri.kt.l implements com.kolipri.kt.b {
   protected com.kolipri.kt.m a = null;

   public final boolean a(com.kolipri.kt.al var1) {
      boolean var2 = false;
      cw var3;
      if (var1.a() != 0 && (var3 = ((Kalypte)super.b_).n()) != null) {
         new StringBuffer();
         var3.g();
         var3.b().H().a(var1);
         var2 = true;
      }

      if (!var2) {
         var2 = super.a(var1);
      }

      return var2;
   }

   public an(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Options", "Exit");
   }

   public final void a() {
      this.a = new com.kolipri.kt.m(super.b_);
      this.a.a();
      this.a.a(0, "Subscription", super.b_.a.b("000-smart-small"), super.b_.a.b("000-smart-large"));
      this.a.a(1, "Buddy Matching", super.b_.a.b("001-abm-small"), super.b_.a.b("001-abm-large"));
      this.a.a(2, "Add or Invite Buddies", super.b_.a.b("002-buddies-small"), super.b_.a.b("002-buddies-large"));
      this.a.a(3, "Settings", super.b_.a.b("003-settings-small"), super.b_.a.b("003-settings-large"));
      this.a.a(4, "Silent Mode", super.b_.a.b("008-ringtone-small"), super.b_.a.b("008-ringtone-large"));
      this.a.a(5, "Themes", super.b_.a.b("005-themes-small"), super.b_.a.b("005-themes-large"));
      this.a.a(6, "Help", super.b_.a.b("006-help-small"), super.b_.a.b("006-help-large"));
      this.a.a(7, "Battery Saving", super.b_.a.b("007-batteryinfo-small"), super.b_.a.b("007-batteryinfo-large"));
      this.a.b(100, "Extended Messaging", super.b_.a.b("d000-em-small"), super.b_.a.b("d000-em-large"));
      this.a.b(101, "Instant Messaging", super.b_.a.b("d001-im-small"), super.b_.a.b("d001-im-large"));
      this.a.b(102, "Chat Rooms", super.b_.a.b("d002-chat-small"), super.b_.a.b("d002-chat-large"));
      this.a.b(103, "Change Status", super.b_.a.b("d003-status-small"), super.b_.a.b("d003-status-large"));
      this.a.a(this);
      this.d(this.a);
   }

   public final void b(String var1) {
      if (!var1.equals("Back")) {
         if (var1.equals("Hide")) {
            super.b_.f();
         } else if (var1.equals("Exit")) {
            com.kolipri.kalypte.z.a(super.b_);
         } else {
            if (var1.equals("Options")) {
               com.kolipri.kt.ae var2;
               (var2 = new com.kolipri.kt.ae(super.b_, "main-menu-options")).a(40, (com.kolipri.kt.ai)null, "Lock Keypad");
               var2.a(42, (com.kolipri.kt.ai)null, "Log Off");
               var2.a(45, (com.kolipri.kt.ai)null, "Intro Help Screen");
               var2.a(50, (com.kolipri.kt.ai)null, "About Uzzap");
               var2.a(43, (com.kolipri.kt.ai)null, "Exit Application");
               var2.a(this);
               com.kolipri.kt.g var3;
               (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var2);
               var3.a(super.b_.c());
            }

         }
      }
   }

   public final void a(int var1) {
      cw var4;
      com.kolipri.kt.ae var5;
      com.kolipri.kt.g var6;
      com.kolipri.kt.a var10;
      cw var11;
      switch(var1) {
      case 0:
         String var2 = null;
         com.kolipri.kimp.g var3;
         if ((var3 = ((Kalypte)super.b_).i.a()) != null) {
            var2 = var3.e();
         }

         if (var2 != null) {
            if (com.kolipri.kimp.e.b(var2, ((Kalypte)super.b_).h.a("kalypte.localprefixes"))) {
               if ((var4 = ((Kalypte)super.b_).n()) != null && var4.b() != null) {
                  var4.b().M();
                  var4.g();
               }

               return;
            }

            (var10 = new com.kolipri.kt.a(super.b_)).a();
            var10.a("* Off Network User\n\nLog on to uzzap.com for more details. Local operator data browsing rates apply");
            var10.a(super.b_.c());
            return;
         }

         if ((var4 = ((Kalypte)super.b_).n()) != null && var4.b() != null) {
            var4.b().M();
            var4.g();
         }

         return;
      case 1:
         if (!Kalypte.v()) {
            (var10 = new com.kolipri.kt.a(super.b_)).a();
            var10.a("* Automatic Buddy Matching\n\nNot supported on this device.");
            var10.a(super.b_.c());
            return;
         }

         if ((var4 = ((Kalypte)super.b_).n()) != null && var4.b() != null) {
            var4.b().c(false);
            var4.g();
         }

         return;
      case 2:
         if (((Kalypte)super.b_).t()) {
            com.kolipri.kt.a var12;
            (var12 = new com.kolipri.kt.a(this, super.b_, this) {
               protected an e = null;

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
                     this.e.b();
                  }

                  this.f();
               }
            }).a();
            var12.a(super.b_.c());
            return;
         }

         this.b();
         return;
      case 3:
         (new aa(super.b_)).a();
         return;
      case 4:
         ((Kalypte)super.b_).n.b();
         com.kolipri.kt.l var9;
         if ((var9 = ((Kalypte)super.b_).n().a) != null) {
            var9.w();
            return;
         }
         break;
      case 5:
         c var8;
         (var8 = new c(super.b_)).a();
         var8.a(super.b_.c());
         return;
      case 6:
         if ((var11 = ((Kalypte)super.b_).n()) != null && var11.b() != null) {
            var11.b().K();
            var11.g();
         }

         return;
      case 7:
         if ((var11 = ((Kalypte)super.b_).n()) != null && var11.b() != null) {
            var11.b().L();
            var11.g();
         }

         return;
      case 100:
         if ((var4 = ((Kalypte)super.b_).n()) != null) {
            var4.g();
         }

         return;
      case 101:
         var5 = new com.kolipri.kt.ae(super.b_, "connections");
         if (((Kalypte)super.b_).d("yahoo").equals("disabled")) {
            var5.a(100, super.b_.a.b("yahoo-online"), "Connect to Yahoo");
         } else {
            var5.a(100, super.b_.a.b("yahoo-online"), "Disconnect from Yahoo");
         }

         if (((Kalypte)super.b_).d("msn").equals("disabled")) {
            var5.a(101, super.b_.a.b("msn-online"), "Connect to MSN");
         } else {
            var5.a(101, super.b_.a.b("msn-online"), "Disconnect from MSN");
         }

         var5.a(this);
         (var6 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var5);
         var6.a(super.b_.c());
         return;
      case 102:
         cw var7;
         if ((var7 = ((Kalypte)super.b_).n()) != null && var7.b() != null) {
            var7.b().I();
            var7.g();
         }
         break;
      case 103:
         (var5 = new com.kolipri.kt.ae(super.b_, "statuses")).a(4, super.b_.a.b("statusmessage"), "Status Message..");
         var5.a(1, super.b_.a.b("online"), "Available");
         var5.a(2, super.b_.a.b("notavailable"), "Not Available");
         var5.a(3, super.b_.a.b("offline"), "Invisible");
         var5.a(this);
         (var6 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var5);
         var6.a(super.b_.c());
         return;
      }

   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
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
      } else if (var1.a().equals("main-menu-options")) {
         switch(var2) {
         case 40:
            ((Kalypte)super.b_).a(true);
         case 41:
         case 44:
         case 46:
         case 47:
         case 48:
         case 49:
         default:
            break;
         case 42:
            com.kolipri.kalypte.z.a(super.b_);
            break;
         case 43:
            com.kolipri.kalypte.z.a(super.b_);
            break;
         case 45:
            ak var3;
            (var3 = new ak(super.b_)).a();
            var3.a(this.v());
            break;
         case 50:
            bk var4;
            (var4 = new bk(super.b_)).a();
            var4.a(this.v());
         }
      } else if (var1.a().equals("connections")) {
         dd var5;
         switch(var2) {
         case 100:
            if (((Kalypte)super.b_).d("yahoo").equals("disabled")) {
               (var5 = new dd(super.b_, "yahoo", "Yahoo!")).a();
               var5.a(super.b_.c());
            } else {
               ((Kalypte)super.b_).c("yahoo");
            }
            break;
         case 101:
            if (((Kalypte)super.b_).d("msn").equals("disabled")) {
               (var5 = new dd(super.b_, "msn", "MSN")).a();
               var5.a(super.b_.c());
            } else {
               ((Kalypte)super.b_).c("msn");
            }
         }
      } else if (var1.a().equals("statuses")) {
         switch(var2) {
         case 1:
            ((Kalypte)super.b_).c("freeforchat", (String)null);
            break;
         case 2:
            ((Kalypte)super.b_).c("notavailable", (String)null);
            break;
         case 3:
            ((Kalypte)super.b_).c("offline", (String)null);
            break;
         case 4:
            db var6;
            (var6 = new db(super.b_)).a();
            var6.b();
         }
      }

      return true;
   }

   public final String E() {
      return null;
   }

   public final void z() {
   }

   public final void A() {
   }

   public final void b() {
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

   public final void d() {
      if (((Kalypte)super.b_).v != null) {
         ((Kalypte)super.b_).v.H();
      }

   }
}
