package com.kolipri.kimp;

public final class r extends ac {
   public aa a = null;

   public r(aa var1) {
      super(var1);
      this.a = var1;
   }

   public final boolean a(p var1) {
      boolean var2 = false;
      String var3 = var1.a("status");
      String var4 = var1.a("username");
      if (var3 == null && var4 == null) {
         this.b(var1);
         var2 = true;
      }

      return var2;
   }

   public final String a() {
      return "other_contacts";
   }

   public final String b() {
      new String();
      String var1 = null;
      if (this.a.k == null) {
         var1 = "Other Contacts";
         this.a.l.b(this.a.l.a("amazilia.username") + ".other_contacts", "Other Contacts");
         this.a.l.c();
      } else {
         var1 = this.a.k;
      }

      return var1;
   }
}
