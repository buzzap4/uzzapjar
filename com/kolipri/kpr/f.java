package com.kolipri.kpr;

import java.util.Vector;

public final class f {
   Vector a = new Vector();

   public final void a() {
      this.a.removeAllElements();
   }

   public final void a(Object var1) {
      this.a.addElement(var1);
   }

   public final void b(Object var1) {
      this.a.insertElementAt(var1, 0);
   }

   public final void a(int var1, Object var2) {
      this.a.insertElementAt(var2, var1);
   }

   public final void a(int var1) {
      if (var1 >= 0 && var1 < this.b()) {
         this.a.removeElementAt(var1);
      }

   }

   public final void c(Object var1) {
      this.a.removeElement(var1);
   }

   public final int b() {
      return this.a.size();
   }

   public final Object b(int var1) {
      Object var2 = null;
      if (var1 >= 0 && var1 < this.b()) {
         var2 = this.a.elementAt(var1);
      }

      return var2;
   }
}
