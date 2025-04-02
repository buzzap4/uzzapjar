package com.kolipri.kalypte;

import java.util.Timer;
import java.util.TimerTask;

public final class cr extends com.kolipri.kt.ap implements com.kolipri.kimp.j {
   protected ay g = null;
   protected ay h = null;
   protected ay i = null;
   protected Timer j = null;

   public cr(com.kolipri.kt.r var1) {
      super(var1);
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
      this.g = new ay(var1, this, "online", "disconnected");
      this.h = new ay(var1, this, "yahoo-online", "disconnected");
      this.i = new ay(var1, this, "msn-online", "disconnected");
   }

   public final void f() {
      super.f();
      ((Kalypte)super.b_).j.b(this);
   }

   public final void a(com.kolipri.kimp.m var1) {
      String var3;
      if (var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null && (var3 = ((com.kolipri.kimp.d)var1).a.a("iq/action.name")) != null && (var3.equals("login") || var3.equals("logout"))) {
         String var4;
         if ((var4 = ((com.kolipri.kimp.d)var1).a.a("iq.amaz-protocol")) != null && (var4.equals("yahoo") || var4.equals("msn"))) {
            this.a(var4, false);
         }

         this.w();
      }

   }

   public final synchronized void a(String var1, boolean var2) {
      ay var3 = null;
      if (var1 != null && var1.equals("smart")) {
         var3 = this.g;
      } else if (var1 != null && var1.equals("yahoo")) {
         var3 = this.h;
      } else if (var1 != null && var1.equals("msn")) {
         var3 = this.i;
      }

      if (var3 != null) {
         if (var2) {
            var3.e();
            return;
         }

         var3.d();
      }

   }

   public final synchronized void b(String var1, boolean var2) {
      ay var3 = null;
      if (var1 != null && var1.equals("smart")) {
         var3 = this.g;
      } else if (var1 != null && var1.equals("yahoo")) {
         var3 = this.h;
      } else if (var1 != null && var1.equals("msn")) {
         var3 = this.i;
      }

      if (var3 != null) {
         var3.c(var2);
      }

   }

   public final void a(com.kolipri.kt.e var1) {
      int var2 = this.s().a;
      super.f = this.u().E();
      boolean var4 = ((cw)this.u()).e().equals("mainmenu");
      boolean var5 = false;
      if (((Kalypte)super.b_).i != null && ((Kalypte)super.b_).i.a() != null && ((Kalypte)super.b_).i.a().b()) {
         var5 = true;
      }

      super.a(var1);
      if (var4) {
         String var6 = com.kolipri.kpr.d.a(com.kolipri.kpr.d.a());
         if (this.j == null) {
            this.j = new Timer();
            this.j.schedule(new TimerTask(this, this) {
               protected com.kolipri.kt.l a = null;

               public {
                  this.a = var2;
               }

               public final void run() {
                  if (this.a != null) {
                     this.a.w();
                  }

               }
            }, 60000L, 60000L);
         }

         if (var6 != null) {
            com.kolipri.kt.ag var10001 = new com.kolipri.kt.ag(6, this.s().b / 4);
            com.kolipri.kt.j var10002 = this.e("kt.titlebar.font");
            com.kolipri.kt.ao var10003 = this.f("kt.titlebar.font.color");
            String var10004 = "     " + var6;
            var1.getClass();
            var1.a(var10001, var10002, var10003, var10004, 0);
         }

         if (var5 && this.j != null) {
            this.j.cancel();
            this.j = null;
         }
      } else if (this.j != null) {
         this.j.cancel();
         this.j = null;
      }

      var2 -= this.g.s().a + 8;
      this.g.b(new com.kolipri.kt.ag(var2, (this.s().b - this.g.s().b) / 2));
      this.g.a(var1);
      com.kolipri.kpr.b var10 = ((Kalypte)super.b_).l;
      ay var7 = null;

      for(int var3 = 0; var3 < var10.b(); ++var3) {
         String var8 = var10.a(var3);
         String var9 = var10.b(var3);
         if (var8.equals("yahoo") && this.h != null) {
            var7 = this.h;
         } else if (var8.equals("msn") && this.i != null) {
            var7 = this.i;
         }

         if (var8 != null && var9 != null && var8.length() > 0 && var9.length() > 0 && var7 != null && var7.b() || var9.equals("online")) {
            var2 -= var7.s().a + 2;
            var7.b(new com.kolipri.kt.ag(var2, (this.s().b - var7.s().b) / 2));
            var7.a(var1);
         }
      }

      com.kolipri.kt.ai var11 = super.b_.a.b("mute");
      if (((Kalypte)super.b_).n.a() && var11 != null) {
         var2 -= var11.a().a + 2;
         var1.a(new com.kolipri.kt.ag(var2, (this.s().b - var11.a().b) / 2), var11);
      }

   }
}
