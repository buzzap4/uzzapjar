package com.kolipri.kalypte;

public final class bg {
   private cm[] a;
   private static bg b;

   public bg() {
      if (b == null) {
         b = this;
         this.a = new cm[31];
         this.a[0] = new cm("ü", "emoticon-smile");
         this.a[1] = new cm("Ü", "emoticon-laugh");
         this.a[2] = new cm(":)", "emoticon-smile");
         this.a[3] = new cm(";)", "emoticon-wink");
         this.a[4] = new cm(":(", "emoticon-sad");
         this.a[5] = new cm(":D", "emoticon-laugh");
         this.a[6] = new cm(":e", "emoticon-e");
         this.a[7] = new cm(">|", "emoticon-angry");
         this.a[8] = new cm(":o", "emoticon-surprise");
         this.a[9] = new cm(":>", "emoticon-tongue");
         this.a[10] = new cm("o/", "emoticon-12");
         this.a[11] = new cm(">,", "emoticon-14");
         this.a[12] = new cm(":|", "emoticon-15");
         this.a[13] = new cm(":|)", "emoticon-laugh");
         this.a[14] = new cm("(:)", "emoticon-love");
         this.a[15] = new cm(">(|", "emoticon-cry");
         this.a[16] = new cm(":DD", "emoticon-11");
         this.a[17] = new cm(":Oo", "emoticon-13");
         this.a[18] = new cm(":B,", "emoticon-16");
         this.a[19] = new cm("O:)", "emoticon-19");
         this.a[20] = new cm("))(", "emoticon-20");
         this.a[21] = new cm(">><)", "emoticon-47");
         this.a[22] = new cm("<:D", "emoticon-clown");
         this.a[23] = new cm("<:)", "emoticon-party");
         this.a[24] = new cm("(+)", "emoticon-sick");
         this.a[25] = new cm(":-)", "emoticon-smile");
         this.a[26] = new cm(":-(", "emoticon-sad");
         this.a[27] = new cm(":Zz.", "emoticon-18");
         this.a[28] = new cm("(cU)", "emoticon-drink");
         this.a[29] = new cm(":OOo", "emoticon-17");
         this.a[30] = new cm("@};-", "emoticon-rose");
      } else {
         throw new IllegalStateException("Other instance of emoticon factory exists");
      }
   }

   public static bg a() {
      return b != null ? b : new bg();
   }

   public final cm a(String var1) {
      for(int var2 = this.a.length - 1; var2 >= 0; --var2) {
         if (var1.startsWith(this.a[var2].a)) {
            return this.a[var2];
         }
      }

      return null;
   }

   public final int b(String var1) {
      int var2 = -1;
      boolean var3 = false;

      for(int var4 = this.a.length - 1; var4 >= 0; --var4) {
         int var5;
         var2 = var2 == -1 ? var1.indexOf(this.a[var4].a) : ((var5 = var1.indexOf(this.a[var4].a)) != -1 ? (var2 > var5 ? var5 : var2) : var2);
      }

      return var2;
   }
}
