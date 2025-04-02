package com.kolipri.kimp;

import java.util.Stack;

public class ab extends com.kolipri.kpr.j {
   protected com.kolipri.kpr.g u = null;
   protected Stack v = new Stack();
   protected q w = null;

   public ab() {
      this.u = new com.kolipri.kpr.g(this);
   }

   protected final void b(String var1) {
      (new StringBuffer()).append("RECV '").append(var1).append("'").toString();
      this.u.a(var1);
   }

   protected final String l() {
      String var1 = new String("");

      for(int var3 = 0; var3 < this.v.size(); ++var3) {
         String var2;
         if ((var2 = (String)this.v.elementAt(var3)) != null) {
            if (var1.length() > 0) {
               var1 = var1 + "/";
            }

            var1 = var1 + var2;
         }
      }

      return var1;
   }

   public final void a(String var1, com.kolipri.kpr.b var2) {
      if (!var1.equals("stream")) {
         if (var1.equals("stream:stream")) {
            return;
         }

         this.v.push(var1);
         if (this.w == null) {
            this.w = new q(var1);
         }

         for(int var3 = 0; var3 < var2.b(); ++var3) {
            this.w.a(this.l() + "." + var2.a(var3), var2.b(var3));
         }

         this.w.a(this.l(), "");
      }

   }

   public final void c(String var1) {
      if (!var1.equals("stream") && !var1.equals("stream:stream")) {
         this.v.pop();
         if (this.v.empty()) {
            this.a(this.w);
            this.w = null;
         }

      } else {
         this.g();
      }
   }

   public final void d(String var1) {
      String var2 = this.l();
      if (this.w != null && this.w.b() > 0 && var2.equals(this.w.a(this.w.b() - 1))) {
         this.w.a(this.w.b() - 1, this.w.b(this.w.b() - 1) + var1);
      }

   }

   public void a(q var1) {
   }
}
