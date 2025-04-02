package com.kolipri.kalypte;

import java.util.Vector;

public final class at implements com.kolipri.kimp.j {
   protected Vector a = new Vector();

   public at(Object var1) {
   }

   public final synchronized void a(com.kolipri.kimp.j var1) {
      this.a.addElement(var1);
   }

   public final synchronized void b(com.kolipri.kimp.j var1) {
      if (this.a.size() > 0) {
         this.a.removeElement(var1);
      }

   }

   public final synchronized void a(com.kolipri.kimp.m var1) {
      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         com.kolipri.kimp.j var3;
         if ((var3 = (com.kolipri.kimp.j)this.a.elementAt(var2)) != null) {
            var3.a(var1);
         }
      }

   }
}
