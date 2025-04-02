package com.kolipri.kalypte;

public final class bc extends af {
   protected boolean j = false;
   protected com.kolipri.kt.ae k;

   public bc(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void b(com.kolipri.kimp.q var1) {
      super.a = var1.a("iq/invite.room");
      super.b = ((Kalypte)super.b_).i.c();
      super.a();
      String var2 = "You have been invited to join the Chatroom '" + super.a;
      var2 = var2 + "'. Do you accept this invitation?\n";
      this.d(var2);
      ((Kalypte)super.b_).n().g();
   }

   public final String E() {
      return !this.j ? "Chat Invite - " + super.a : "Chat - " + super.a;
   }

   public final void a(com.kolipri.kt.x var1) {
      if (this.j) {
         var1.a("Options", "Menu");
      } else {
         var1.a("Options ", "Menu");
      }
   }

   public final void b(String var1) {
      if (var1 != null && var1.equals("Options ") && !this.j) {
         this.k = new com.kolipri.kt.ae(super.b_, "chat-invitation-actions");
         this.k.a(1, (com.kolipri.kt.ai)null, "Yes");
         this.k.a(2, (com.kolipri.kt.ai)null, "No");
         this.k.a(3, (com.kolipri.kt.ai)null, "Close Tab");
         this.k.a(this);
         com.kolipri.kt.g var2;
         (var2 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)this.k);
         var2.a(super.b_.c());
      }

      super.b(var1);
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("chat-invitation-actions")) {
         switch(var2) {
         case 1:
            this.g(super.b);
            this.j = true;
            this.y();
            break;
         case 2:
            this.D();
            this.f();
            break;
         case 3:
            this.D();
            this.f();
         }
      } else {
         super.a(var1, var2);
      }

      return true;
   }
}
