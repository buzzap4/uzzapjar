package com.kolipri.kimp;

public final class b extends ac {
   public aa a = null;

   public b(aa var1) {
      super(var1);
      this.a = var1;
   }

   public final boolean a(p var1) {
      boolean var2 = false;
      String var3;
      if (var1.a("username") != null && (var1.a("status") == null || var1.a("status").equals("unknown"))) {
         var3 = var1.a("abm");
         if (var1.a("username") != null && (var1.a("status") == null || var1.a("status").equals("unknown"))) {
            if (var3 != null && var3.equals("yes")) {
            }

            this.b(var1);
            var2 = true;
         }
      }

      var3 = var1.a("authorized");
      if (var1.a("username") != null && (var3 == null || !var3.equals("yes"))) {
         this.b(var1);
         var2 = true;
      }

      return var2;
   }

   public final String a() {
      return "action_required";
   }

   public final String b() {
      new String();
      String var1 = null;
      if (this.a.i == null) {
         var1 = "Pending Buddies";
         this.a.l.b(this.a.l.a("amazilia.username") + ".groups.action_required", var1);
         this.a.l.c();
      } else {
         var1 = this.a.i;
      }

      return var1;
   }
}
