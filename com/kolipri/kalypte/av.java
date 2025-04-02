package com.kolipri.kalypte;

public final class av extends aq {
   public av(com.kolipri.kt.r var1) {
      super(var1);
      this.a("* Chatroom Tones\nChoose if you wish an alert tone to sound for chatroom messages.");
      String var2;
      boolean var3 = (var2 = ((Kalypte)this.t()).h.a("chatroom.alert")) == null ? true : var2.equals("yes");
      super.c.a(var3 ? "no" : "yes", "Chatroom Tones", var3);
   }

   public final void a(com.kolipri.kt.x var1) {
      var1.a("", "Save");
   }

   public final void b(String var1) {
      if (var1.equals("Save")) {
         String var2 = super.c.d();
         ((Kalypte)this.t()).h.b("chatroom.alert", String.valueOf(var2));
         ((Kalypte)this.t()).h.c();
      }

      super.f();
   }
}
