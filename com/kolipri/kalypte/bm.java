package com.kolipri.kalypte;

public final class bm extends com.kolipri.kt.v implements com.kolipri.kt.b, com.kolipri.kimp.j, com.kolipri.kt.o {
   protected cp a = null;
   private String c = "Menu";
   public com.kolipri.kt.ab b;

   public bm(com.kolipri.kt.r var1) {
      super(var1, (com.kolipri.kt.af)null);
      this.a = new cp(var1, this);
      this.a((com.kolipri.kt.af)this.a);
      this.a.a(this);
      ((Kalypte)super.b_).j.a((com.kolipri.kimp.j)this);
   }

   public final void f() {
      super.f();
      ((Kalypte)super.b_).j.b(this);
   }

   public final void a(com.kolipri.kimp.m var1) {
      com.kolipri.kimp.q var2;
      if (var1 instanceof com.kolipri.kimp.d && ((com.kolipri.kimp.d)var1).a != null && (var2 = ((com.kolipri.kimp.d)var1).a).a("iq.amaz-protocol") != null && var2.a("iq.amaz-protocol").equals("chat")) {
         this.a.a(var2);
      }

   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("Options", this.c);
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Options")) {
         com.kolipri.kt.ae var4;
         (var4 = new com.kolipri.kt.ae(super.b_, "chat-room-options")).a(10, (com.kolipri.kt.ai)null, this.a.a != null ? "Join Room" : "Select Category");
         var4.a(20, (com.kolipri.kt.ai)null, this.a.a != null ? "Refresh Room List" : "Refresh Category List");
         var4.a(40, (com.kolipri.kt.ai)null, "Start Buddy Group Chat");
         var4.a(30, (com.kolipri.kt.ai)null, "Close Tab");
         var4.a(this);
         com.kolipri.kt.g var3;
         (var3 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var4);
         var3.a(super.b_.c());
      } else if (var1 != null && var1.equals("Menu")) {
         cw var2;
         if ((var2 = ((Kalypte)super.b_).n()) != null) {
            var2.G();
         }

      } else {
         if (var1 != null && var1.equals("Back")) {
            this.a.j();
            this.a.k();
            this.a.e = false;
            this.a.a((String)null);
            this.d();
            this.a(this.a.d);
         }

      }
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("chat-room-options")) {
         switch(var2) {
         case 10:
            this.a.e(super.f);
            break;
         case 20:
            this.a.a(this.a.a);
            break;
         case 30:
            this.D();
            break;
         case 40:
            (new bj(super.b_)).a((com.kolipri.kt.l)this);
         }
      }

      return true;
   }

   public final void a() {
      super.a();
      this.a.j();
      this.a.a(this.a.a);
   }

   public final void a_(String var1) {
      if (var1.length() > 2) {
         this.a.e = true;
         this.a.b(var1);
         this.a.i();
      } else {
         com.kolipri.kt.a var2;
         (var2 = new com.kolipri.kt.a(super.b_)).a();
         if (var1.length() < 2) {
            var2.a("* Error\n\nSearched room name is too short. Please try again.");
         } else {
            var2.a("* Error\n\nSearched room name is invalid. Please try again.");
         }

         var2.a(super.b_.c());
      }
   }

   public final void c_() {
   }

   public final void c(String var1) {
   }

   private void a(com.kolipri.kt.e var1, String var2) {
      com.kolipri.kt.j var3 = new com.kolipri.kt.j(16);
      com.kolipri.kt.ag var10001 = new com.kolipri.kt.ag(this.s().a / 2, (this.s().b - var3.b) / 2);
      com.kolipri.kt.ao var10003 = this.f("kalypte.statusdisplay.font.color");
      var1.getClass();
      var1.a(var10001, var3, var10003, var2, 4);
   }

   public final void a(com.kolipri.kt.e var1) {
      if (!this.a.b && !this.a.f) {
         synchronized(this.a) {
            if (this.a.h().b() < 1) {
               this.b(var1);
               this.a(var1, "No chat rooms");
            } else {
               super.a(var1);
            }

         }
      } else {
         this.b(var1);
         this.a(var1, this.a.a == null && !this.a.f ? "Getting Categories.." : "Getting Rooms..");
      }
   }

   public final String E() {
      return "Chat Rooms";
   }

   public final void d() {
      if (this.a.a == null && !this.a.e) {
         this.c = "Menu";
      } else {
         this.c = "Back";
      }

      this.y();
   }
}
