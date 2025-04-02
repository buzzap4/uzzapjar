package com.kolipri.kimp;

public final class c extends ac {
   public aa a = null;

   public c(aa var1) {
      super(var1);
      this.a = var1;
   }

   public final boolean a(p var1) {
      boolean var2 = false;
      String var3 = var1.a("groups");
      String var4 = this.a();
      if (var3 != null && var3.indexOf(var4) > -1) {
         this.b(var1);
         var2 = true;
      }

      return var2;
   }

   public final String a() {
      return "chatterbox";
   }

   public final String b() {
      new String();
      String var1 = null;
      if (this.a.j == null) {
         var1 = "My Friends";
         this.a.l.b(this.a.l.a("amazilia.username") + ".groups.chatterbox", "My Friends");
         this.a.l.c();
      } else {
         var1 = this.a.j;
      }

      return var1;
   }
}
