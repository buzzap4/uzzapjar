package com.kolipri.kpr;

import java.util.Vector;

public final class h extends Vector {
   public final synchronized void a(Object var1) {
      this.addElement(var1);
   }

   public final synchronized Object a() {
      Object var1 = null;
      if (this.size() > 0) {
         var1 = this.elementAt(0);
         this.removeElementAt(0);
      }

      return var1;
   }
}
