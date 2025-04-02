package com.kolipri.kalypte;

import java.util.Vector;

public final class al extends com.kolipri.kt.l implements com.kolipri.kt.b, com.kolipri.kimp.j, Runnable {
   protected String a = "";
   protected int b = 0;
   protected int c = 0;
   protected com.kolipri.kt.ab e = null;
   protected boolean f = false;
   public boolean g = false;

   public al(com.kolipri.kt.r var1) {
      super(var1);
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
   }

   public final void f() {
      super.f();
      ((Kalypte)super.b_).j.b(this);
   }

   public final void a() {
      super.a();
      this.e = new com.kolipri.kt.ab(super.b_);
      this.e.a();
      this.d(this.e);
      this.a(0);
   }

   public final synchronized void a(int var1) {
      String var2 = null;
      String var3 = "Automatic Buddy Matching allows your address book contacts to be automatically listed in your Buddy list when they are registered to Uzzap.The service will upload your address book.\n\n";
      if (((Kalypte)super.b_).u() == 1) {
         var3 = var3 + "Automatic buddy matching is currently active.";
      } else {
         (new StringBuffer()).append((String)null).append("Automatic buddy matching is currently NOT active.").toString();
      }

      this.b = var1;
      if (this.e != null) {
         this.e.d();
         switch(this.b) {
         case 0:
            var2 = "Automatic Buddy Matching allows your address book contacts to be automatically listed in your Buddy list when they are registered to Uzzap.The service will upload your address book.\n\n";
            if (((Kalypte)super.b_).u() == 1) {
               var2 = var2 + "Automatic buddy matching is currently active.";
            } else {
               var2 = var2 + "Automatic buddy matching is currently NOT active.";
            }

            this.e.d(var2);
            break;
         case 1:
            if (!this.g) {
               this.e.d(var3);
            } else {
               this.e.d(var3);
            }
            break;
         case 2:
            this.e.d(var3);
            break;
         case 3:
            this.e.d("Auto Buddy Matching Activated\n\nChoose 'Close' to close this tab and continue using Uzzap. As your friends listed in your phone book contacts join the service, you will automatically see them as your new Uzzap buddies.");
            break;
         case 4:
            this.e(0);
            this.a("no");
            this.e.d("Auto Buddy Matching aborted\n\nYour online contact database is not synchronized with your phone address book.");
            break;
         case 5:
            this.a("no");
            this.e.d("Auto Buddy Matching failed\n\nUploading the contact database failed: '" + (this.a != null ? this.a : "") + "'");
            break;
         case 6:
            this.a("no");
            this.e.d("Click 'Close' to close the tab and continue using the Uzzap. You can re-enable buddy matching at any time.");
         }
      }

      this.y();
      this.w();
   }

   public final String E() {
      return "Buddy Matching";
   }

   public final void a(com.kolipri.kt.x var1) {
      if (this.b != 1 && this.b != 2) {
         if (this.b != 3 && this.b != 4 && this.b != 5 && this.b != 6) {
            var1.a("Options", "Close");
         } else {
            var1.a("Options", "Close");
         }
      } else {
         var1.a("", "Close");
      }
   }

   private void a(String var1) {
      com.kolipri.kpr.b var2;
      (var2 = new com.kolipri.kpr.b()).b("abm-active", var1);
      ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.a(var2));
   }

   public final void e(int var1) {
      ((Kalypte)super.b_).h.b(((Kalypte)super.b_).i.c() + ".abm.counter", Integer.toString(var1));
      ((Kalypte)super.b_).h.c();
   }

   public final void b() {
      if (((Kalypte)super.b_).y) {
         this.e(0);
         ((Kalypte)super.b_).y = false;
         ((Kalypte)super.b_).x.f();
      }

      if (((Kalypte)super.b_).u() == 2) {
         this.e(0);
      }

      this.a("yes");
      this.g = false;
      this.a(1);
      (new Thread(this)).start();
   }

   public final int d() {
      int var1 = -1;
      String var2;
      if ((var2 = ((Kalypte)super.b_).h.a(((Kalypte)super.b_).i.c() + ".abm.counter")) != null) {
         var1 = Integer.parseInt(var2) > 0 ? Integer.parseInt(var2) : 0;
      }

      return var1;
   }

   private void a(com.kolipri.kimp.z var1) {
      try {
         this.f = false;
         Vector var2 = new Vector(10);
         com.kolipri.kpr.b var3 = null;

         for(int var4 = 0; var4 < 10; ++var4) {
            if ((var3 = var1.c()) == null) {
               if (var2.size() == 0) {
                  this.a(3);
                  this.e(0);
                  return;
               }
               break;
            }

            var2.addElement(var3);
         }

         ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.a(var2));
         this.c += var2.size();
         this.a(2);
      } catch (Exception var5) {
         this.a = var5.toString();
         this.a(5);
      }
   }

   public final void run() {
      com.kolipri.kpr.d.a(1000);
      com.kolipri.kimp.z var1;
      if ((var1 = new com.kolipri.kimp.z()).a()) {
         boolean var2 = true;
         int var3 = this.d();
         if ((this.c = var3 > 0 ? var3 : 0) <= 0) {
            ((Kalypte)super.b_).i.a(com.kolipri.kimp.ae.c());
         } else {
            for(int var5 = 0; var5 < this.c; ++var5) {
               var1.c();
            }
         }

         this.a(1);
         this.a(var1);

         while(var2) {
            switch(this.b) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
               var2 = false;
            case 1:
            case 2:
            }

            if (this.f) {
               this.a(var1);
            } else {
               com.kolipri.kpr.d.a(100);
            }
         }

         var1.b();
      } else {
         this.a = "Failed to read your address book";
         this.a(5);
      }
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Options")) {
         com.kolipri.kt.ae var6 = new com.kolipri.kt.ae(super.b_, "contact-upload-options");
         boolean var7 = ((Kalypte)super.b_).u() == 1;
         var6.a(10, (com.kolipri.kt.ai)null, var7 ? "Update Buddy Matching" : "Activate Buddy Matching");
         if (var7) {
            var6.a(20, (com.kolipri.kt.ai)null, "Disable Buddy Matching");
         }

         var6.a(30, (com.kolipri.kt.ai)null, "Close Tab");
         var6.a(this);
         com.kolipri.kt.g var8;
         (var8 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var6);
         var8.a(super.b_.c());
      } else {
         if (var1 != null && var1.equals("Buddies")) {
            cw var2;
            bu var3 = (var2 = ((Kalypte)super.b_).n()).b();
            if (var2 == null || var3 == null) {
               return;
            }

            int var4 = 0;

            while(true) {
               if (var4 >= var3.e()) {
                  return;
               }

               com.kolipri.kt.t var5;
               if ((var5 = (com.kolipri.kt.t)var3.d().elementAt(var4)) != null && var5.a.equals("Buddy List")) {
                  var3.f(var4);
                  break;
               }

               ++var4;
            }
         } else if (var1 != null && var1.equals("Close")) {
            this.D();
         }

      }
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      switch(var2) {
      case 10:
         this.b();
         break;
      case 20:
         w var3;
         (var3 = new w(super.b_, this)).a();
         var3.a(super.b_.c());
         break;
      case 30:
         this.D();
      }

      return true;
   }

   private void a(com.kolipri.kimp.q var1) {
      if (var1.a("iq.amaz-protocol") != null && var1.a("iq.amaz-protocol").equals("registry")) {
         this.b(var1);
      }

   }

   public final void a(com.kolipri.kimp.m var1) {
      if (var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null) {
         this.a(((com.kolipri.kimp.d)var1).a);
      }

   }

   private void b(com.kolipri.kimp.q var1) {
      String var2 = var1.a("iq.type");
      String var3 = var1.a("iq/action.name");
      if (var2 != null) {
         if (var3 == null) {
            return;
         }

         if (var3.equals("init-store-contact")) {
            if (var2.equals("response")) {
               if (this.g) {
                  this.a(6);
                  return;
               }

               this.f = true;
               return;
            }

            if (var2.equals("error")) {
               this.a = var1.a("iq/error.amaz-error");
               this.a(5);
               return;
            }
         } else if (var3.equals("store-contact")) {
            if (var2.equals("response") && this.b == 2) {
               this.f = true;
               this.e(this.c);
               return;
            }

            if (var2.equals("error")) {
               this.a = var1.a("iq/error.amaz-error");
               this.a(5);
            }
         }
      }

   }
}
