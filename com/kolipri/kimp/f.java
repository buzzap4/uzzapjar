package com.kolipri.kimp;

public final class f extends ac {
   protected String a = null;

   public f(aa var1, String var2) {
      super(var1);
      this.a = new String(var2);
   }

   public final boolean a(p var1) {
      boolean var2 = false;
      String var3 = var1 != null ? var1.a("groups") : null;
      StringBuffer var4 = new StringBuffer();

      for(int var5 = 0; var3 != null && var5 < var3.length(); ++var5) {
         char var6;
         if ((var6 = var3.charAt(var5)) == ',') {
            if (var4.length() > 0 && var4.toString().equals(this.a)) {
               var2 = true;
               break;
            }

            var4 = new StringBuffer();
         } else {
            var4.append(var6);
         }
      }

      if (var4.length() > 0 && var4.toString().equals(this.a)) {
         var2 = true;
      }

      if (var2) {
         this.b(var1);
      }

      return var2;
   }

   public final String a() {
      return this.a;
   }

   public final String b() {
      return this.a;
   }
}
