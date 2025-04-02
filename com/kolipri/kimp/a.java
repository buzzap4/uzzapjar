package com.kolipri.kimp;

public final class a extends ac {
   public aa a = null;

   public a(aa var1) {
      super(var1);
      this.a = var1;
   }

   public final boolean a(p var1) {
      boolean var2 = false;
      String var3 = var1.a("status");
      var1.a("username");
      String var5 = var1.a("message");
      String var6 = var1.a("authorized");
      if (var5 != null && var5.equals("blocked")) {
         var2 = false;
      } else if (var1.a("yahoo-id") == null && var1.a("msn-id") == null) {
         if (var1.e() && var6 != null) {
            this.b(var1);
            var2 = true;
         } else if (var3 != null && (var3.equals("unknown") || var3.equals("offline")) && var6 != null) {
            this.b(var1);
            var2 = true;
         }
      } else {
         this.b(var1);
         var2 = true;
      }

      return var2;
   }

   public final String a() {
      return "buddies";
   }

   public final String b() {
      new String();
      String var1 = null;
      if (this.a.g == null) {
         var1 = "All Buddies";
         this.a.l.b(this.a.l.a("amazilia.username") + "groups.buddies", "Buddies");
         this.a.l.c();
      } else {
         var1 = this.a.g;
      }

      return var1;
   }

   public final synchronized void b(p var1) {
      if (var1 != null) {
         int var3 = -1;
         String var4 = var1.d().toLowerCase();
         String var5 = null;
         var1.e();

         for(int var2 = 0; var2 < super.e.size() && var3 < 0; ++var2) {
            p var8;
            if ((var8 = (p)super.e.elementAt(var2)) != null) {
               var5 = var8.d().toLowerCase();
               switch(d(var8)) {
               case 1:
                  if (d(var1) == 1 && var4.compareTo(var5) < 0) {
                     var3 = var2;
                  }
                  break;
               case 2:
                  if (d(var1) < 2) {
                     var3 = var2;
                  } else if (d(var1) == 2 && var4.compareTo(var5) < 0) {
                     var3 = var2;
                  }
                  break;
               case 3:
                  if (d(var1) < 3) {
                     var3 = var2;
                  } else if (d(var1) == 3 && var4.compareTo(var5) < 0) {
                     var3 = var2;
                  }
                  break;
               case 4:
                  if (d(var1) < 4) {
                     var3 = var2;
                  } else if (d(var1) == 4 && var4.compareTo(var5) < 0) {
                     var3 = var2;
                  }
                  break;
               case 5:
                  if (d(var1) < 5) {
                     var3 = var2;
                  } else if (d(var1) == 5 && var4.compareTo(var5) < 0) {
                     var3 = var2;
                  }
                  break;
               case 6:
                  if (d(var1) < 6) {
                     var3 = var2;
                  } else if (var4.compareTo(var5) < 0) {
                     var3 = var2;
                  }
               }
            }
         }

         if (var3 > -1) {
            super.e.insertElementAt(var1, var3);
         } else {
            super.e.addElement(var1);
         }

         this.c();
      }
   }

   private static int d(p var0) {
      if (var0.f() && var0.e()) {
         return 1;
      } else if (var0.h() && var0.e()) {
         return 2;
      } else if (var0.i() && var0.e()) {
         return 3;
      } else if (var0.f()) {
         return 4;
      } else if (var0.h()) {
         return 5;
      } else {
         return var0.i() ? 6 : 0;
      }
   }
}
