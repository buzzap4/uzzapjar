package com.kolipri.kalypte;

public final class bu extends com.kolipri.kt.y implements com.kolipri.kimp.j {
   public b f = null;

   public static bu f(com.kolipri.kt.l var0) {
      bu var1;
      for(var1 = null; var1 == null && var0 != null; var0 = var0.u()) {
         if (var0 instanceof bu) {
            var1 = (bu)var0;
         }
      }

      return var1;
   }

   public bu(com.kolipri.kt.r var1) {
      super(var1);
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
   }

   public final void f() {
      super.f();
      ((Kalypte)super.b_).j.b(this);
   }

   public final void a() {
      super.a();
      this.H();
   }

   private void a(com.kolipri.kimp.q var1) {
      if (var1.a("iq/invite.room") != null && ((Kalypte)super.b_).i != null) {
         int var3 = -1;
         String var5 = var1.a("iq/invite.room");

         int var2;
         com.kolipri.kt.l var4;
         for(var2 = 0; (var4 = this.a(var2)) != null; ++var2) {
            if (var4 instanceof bc && ((bc)var4).a.equals(var5)) {
               var3 = var2;
               this.f(var2);
               break;
            }

            if (var4 instanceof af && ((af)var4).a.equals(var5)) {
               var3 = var2;
               (new StringBuffer()).append("chatroom ivitation (").append(var5).append(") - Already in chatroom.").toString();
               break;
            }
         }

         if (var3 < 0) {
            bc var6;
            (var6 = new bc((Kalypte)super.b_)).b(var1);
            var2 = this.a(new com.kolipri.kt.t(var6.E(), super.b_.a.b("chatrooms"), var6));
            this.f(var2);
         }
      }

   }

   public final void a(com.kolipri.kimp.m var1) {
      com.kolipri.kimp.s var2 = null;
      String var7;
      if (var1 != null && var1 instanceof com.kolipri.kimp.w) {
         com.kolipri.kimp.w var10 = (com.kolipri.kimp.w)var1;
         boolean var11 = false;
         int var13;
         if ((var13 = var10.a.indexOf(",")) != -1) {
            var7 = var10.a.substring(0, var13);
            String var15 = var10.a.substring(var13 + 1, var10.a.length());

            com.kolipri.kt.l var14;
            for(int var12 = 0; (var14 = this.a(var12)) != null; ++var12) {
               if (var14 instanceof bq && ((bq)var14).b(var7, var15)) {
                  this.c(var12, 3);
               }
            }

         }
      } else if (var1 != null && var1 instanceof com.kolipri.kimp.s && !((com.kolipri.kimp.s)var1).p) {
         var2 = (com.kolipri.kimp.s)var1;
         boolean var9 = false;
         String var4 = var2.a;
         if (var2.a != null && var2.a.equals(((Kalypte)super.b_).i.c())) {
            var4 = var2.c;
         }

         if (var2.o) {
            var4 = "__abm__";
         }

         if (var4 == null) {
            var4 = "[Unknown]";
         }

         cw var5;
         if ((var5 = ((Kalypte)super.b_).n()) != null) {
            var5.g();
         }

         new com.kolipri.kpr.f();
         com.kolipri.kpr.f var6 = null;
         new cb(super.b_);
         var7 = null;
         if ((var6 = cb.c(var4)).b() > 0) {
            var4 = var6.b(0).toString();
         }

         bq var8;
         if ((var8 = this.a(var2.e, var4, var2.s != null ? Integer.parseInt(var2.s) : 0, var2.a)) != null) {
            var8.a(var2);
         }

      } else {
         com.kolipri.kimp.q var3;
         if (var1 != null && var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null && (var3 = ((com.kolipri.kimp.d)var1).a).a("iq.amaz-protocol") != null && var3.a("iq.amaz-protocol").equals("chat") && var3.a("iq/error.code") == null) {
            this.a(var3);
         }

      }
   }

   public final void f(int var1) {
      if (var1 == 0 && this.f != null) {
         this.f.b().a("");
      }

      super.f(var1);
   }

   public final b H() {
      boolean var3 = false;

      int var1;
      com.kolipri.kt.l var2;
      for(var1 = 0; (var2 = this.a(var1)) != null; ++var1) {
         if (var2 instanceof b) {
            this.f(var1);
            var3 = true;
            this.f = (b)var2;
         }
      }

      if (!var3) {
         b var4;
         (var4 = new b(super.b_)).a();
         if ((var1 = this.a(new com.kolipri.kt.t("Buddy List", super.b_.a.b("buddylist-icon"), var4))) >= 0) {
            this.f(var1);
         }

         this.f = var4;
      }

      return this.f;
   }

   public final ag a(com.kolipri.kimp.p var1, String var2) {
      ag var3 = null;

      int var4;
      com.kolipri.kt.l var5;
      for(var4 = 0; (var5 = this.a(var4)) != null; ++var4) {
         if (var5 instanceof ag && ((ag)var5).a.b == var1.b) {
            this.f(var4);
            var3 = (ag)var5;
            if (!var2.equals(var3.d())) {
               var3.a(var1, var2);
            }
         }
      }

      if (var3 == null) {
         (var3 = new ag(super.b_)).b(var1, var2);
         if ((var4 = this.a(new com.kolipri.kt.t("History", super.b_.a.b("history"), var3))) >= 0) {
            this.f(var4);
         }
      }

      return var3;
   }

   public final dc a(com.kolipri.kimp.s var1) {
      dc var2;
      (var2 = new dc(super.b_)).a(var1);
      int var3;
      if ((var3 = this.a(new com.kolipri.kt.t("Message", super.b_.a.b("message"), var2))) >= 0) {
         this.f(var3);
      }

      return var2;
   }

   public final bm I() {
      bm var1 = null;
      boolean var4 = false;

      int var2;
      com.kolipri.kt.l var3;
      for(var2 = 0; (var3 = this.a(var2)) != null; ++var2) {
         if (var3 instanceof ci) {
            this.f(var2);
            var4 = true;
            var1 = ((ci)var3).b();
         }
      }

      if (!var4) {
         ci var5;
         (var5 = new ci(super.b_)).a();
         if ((var2 = this.a(new com.kolipri.kt.t("Chat Rooms", super.b_.a.b("chatrooms"), var5))) >= 0) {
            this.f(var2);
         }

         var1 = var5.b();
      }

      return var1;
   }

   public final af a(String var1, String var2) {
      af var3 = null;
      if (var1 != null && var1.length() > 0) {
         int var5 = -1;

         com.kolipri.kt.l var6;
         for(int var4 = 0; (var6 = this.a(var4)) != null; ++var4) {
            if (var6 instanceof af && ((af)var6).a.equals(var1)) {
               var5 = var4;
               var3 = (af)var6;
               break;
            }
         }

         if (var3 == null) {
            (var3 = new af(super.b_)).a();
            var3.a = var1;
            if ((var5 = this.a(new com.kolipri.kt.t("Chat Room", super.b_.a.b("chatrooms"), var3))) < 0) {
               var3 = null;
            }

            if (var2 != null) {
               var3.g(var2);
            }
         }

         if (var5 >= 0) {
            this.f(var5);
         }
      }

      return var3;
   }

   public final af a(com.kolipri.kpr.f var1) {
      af var2 = null;
      if (((Kalypte)super.b_).i != null) {
         (var2 = new af(super.b_)).a();
         var2.a = "" + ((Kalypte)super.b_).i.c() + "-" + com.kolipri.kpr.d.a();
         var2.b = ((Kalypte)super.b_).i.c();
         var2.c = var1;
         int var3;
         if ((var3 = this.a(new com.kolipri.kt.t("Conference", super.b_.a.b("chatrooms"), var2))) >= 0) {
            this.f(var3);
         }

         var2.d();
      }

      return var2;
   }

   private bq a(String var1, String var2, int var3, String var4) {
      bq var5 = null;
      boolean var8 = false;

      int var6;
      com.kolipri.kt.l var7;
      for(var6 = 0; (var7 = this.a(var6)) != null; ++var6) {
         if (var7 instanceof bq && ((bq)var7).b(var1, var2)) {
            if (var3 == 0) {
               if (var4.equals(((Kalypte)super.b_).i.c())) {
                  this.c(var6, 2);
               } else if (!var7.n()) {
                  this.c(var6, 1);
               }
            } else if (var3 > ((Kalypte)this.t()).i.f() && var4.equals(((Kalypte)super.b_).i.c())) {
               this.c(var6, 3);
            }

            var8 = true;
            var5 = (bq)var7;
         }
      }

      if (!var8) {
         bq var9;
         (var9 = new bq(super.b_)).a();
         var9.a(var1, var2);
         if (var3 == 0) {
            com.kolipri.kt.t var10;
            com.kolipri.kt.t var10000 = var10 = new com.kolipri.kt.t("Chat", super.b_.a.b("chat-icon"), var9);
            var10000.d = (byte)(var10000.d | 1);
            if ((var6 = this.a(var10)) >= 0) {
               if (var4.equals(((Kalypte)super.b_).i.c())) {
                  this.c(var6, 2);
               }

               this.f(var6);
            }

            var5 = var9;
         }
      }

      return var5;
   }

   public final cx a(com.kolipri.kimp.p var1) {
      cx var2;
      (var2 = new cx(super.b_, var1)).a();
      int var3;
      if ((var3 = this.a(new com.kolipri.kt.t("User details", super.b_.a.b("online"), var2))) >= 0) {
         this.f(var3);
      }

      return var2;
   }

   public final bx J() {
      bx var1;
      (var1 = new bx(super.b_)).a();
      int var2;
      if ((var2 = this.a(new com.kolipri.kt.t("Offline Settings", super.b_.a.b("settings-tab"), var1))) >= 0) {
         this.f(var2);
      }

      return var1;
   }

   public final ax K() {
      ax var1 = null;
      boolean var4 = false;

      int var2;
      com.kolipri.kt.l var3;
      for(var2 = 0; (var3 = this.a(var2)) != null; ++var2) {
         if (var3 instanceof ax) {
            this.f(var2);
            var4 = true;
            var1 = (ax)var3;
            break;
         }
      }

      if (!var4) {
         ax var5;
         (var5 = new ax(super.b_)).a();
         if ((var2 = this.a(new com.kolipri.kt.t("Help", super.b_.a.b("help"), var5))) >= 0) {
            this.f(var2);
         }

         var1 = var5;
      }

      return var1;
   }

   public final ar L() {
      ar var1 = null;
      boolean var4 = false;

      int var2;
      com.kolipri.kt.l var3;
      for(var2 = 0; (var3 = this.a(var2)) != null; ++var2) {
         if (var3 instanceof ar) {
            this.f(var2);
            var4 = true;
            var1 = (ar)var3;
            break;
         }
      }

      if (!var4) {
         ar var5;
         (var5 = new ar(super.b_)).a();
         if ((var2 = this.a(new com.kolipri.kt.t("Help", super.b_.a.b("battery-tab"), var5))) >= 0) {
            this.f(var2);
         }

         var1 = var5;
      }

      return var1;
   }

   public final al c(boolean var1) {
      al var2 = null;
      boolean var5 = false;

      int var3;
      com.kolipri.kt.l var4;
      for(var3 = 0; (var4 = this.a(var3)) != null; ++var3) {
         if (var4 instanceof al) {
            this.f(var3);
            var5 = true;
            var2 = (al)var4;
            break;
         }
      }

      if (!var5) {
         al var6;
         (var6 = new al(super.b_)).a();
         var3 = this.a(new com.kolipri.kt.t("Contact Upload", super.b_.a.b("sync"), var6));
         if (var1) {
            var6.b();
         }

         if (var3 >= 0) {
            this.f(var3);
         }

         var2 = var6;
      }

      return var2;
   }

   public final bd M() {
      bd var1 = null;
      boolean var4 = false;

      int var2;
      com.kolipri.kt.l var3;
      for(var2 = 0; (var3 = this.a(var2)) != null; ++var2) {
         if (var3 instanceof bd) {
            this.f(var2);
            var4 = true;
            var1 = (bd)var3;
            break;
         }
      }

      if (!var4) {
         bd var5;
         (var5 = new bd(super.b_)).a();
         if ((var2 = this.a(new com.kolipri.kt.t("Subscription", super.b_.a.b("billing"), var5))) >= 0) {
            this.f(var2);
         }

         var1 = var5;
      }

      return var1;
   }

   public final as N() {
      as var1 = null;
      boolean var4 = false;

      int var2;
      com.kolipri.kt.l var3;
      for(var2 = 0; (var3 = this.a(var2)) != null; ++var2) {
         if (var3 instanceof as) {
            this.f(var2);
            var4 = true;
            var1 = (as)var3;
            break;
         }
      }

      if (!var4) {
         as var5;
         (var5 = new as(super.b_)).a();
         if ((var2 = this.a(new com.kolipri.kt.t("Subscription", super.b_.a.b("billing"), var5))) >= 0) {
            this.f(var2);
         }

         var1 = var5;
      }

      return var1;
   }
}
