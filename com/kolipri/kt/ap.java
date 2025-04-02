package com.kolipri.kt;

public class ap extends u {
   protected String f = null;

   public ap(r var1) {
      super(var1, "titlebar");
   }

   public final void a() {
      super.a();
   }

   public void a(e var1) {
      super.a(var1);
      if (this.f != null) {
         ag var10001 = new ag(6, this.s().b / 4);
         j var10002 = this.e("kt.titlebar.font");
         ao var10003 = this.f("kt.titlebar.font.color");
         String var10004 = "     " + this.f;
         var1.getClass();
         var1.a(var10001, var10002, var10003, var10004, 0);
      }

   }

   public final void a(String var1) {
      this.f = var1;
      this.w();
   }
}
