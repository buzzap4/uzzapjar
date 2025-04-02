package com.kolipri.kt;

import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

public abstract class r extends MIDlet {
   public aj a = null;
   protected am b = null;
   protected boolean c = false;
   protected int d = 0;
   protected int e = 0;
   protected boolean f = false;
   public boolean g = false;

   public void a() {
   }

   public final synchronized boolean b() {
      return this.f;
   }

   public final synchronized void a(boolean var1) {
      this.f = var1;
   }

   public final am c() {
      return this.b;
   }

   public boolean d() {
      this.c = true;
      this.a = new aj(this);
      this.a.a("black");
      this.b.repaint();
      return true;
   }

   public final void a(int var1, int var2) {
      this.d = var1;
      this.e = var2;
      if (!this.c) {
         this.d();
      }

   }

   public final void e() {
      if (this.b != null) {
         Display.getDisplay(this).setCurrent(this.b);
         this.b.repaint();
      }

   }

   public final void a(Displayable var1) {
      Display.getDisplay(this).setCurrent(var1);
   }

   public void startApp() {
      if (this.b == null) {
         this.b = new am(this);
      }

      if (this.b != null && this.b.b().a > 0 && this.b.b().b > 0 && !this.c) {
         this.d();
      }

      this.e();
      this.h();
   }

   public final void f() {
      Display.getDisplay(this).setCurrent((Displayable)null);
   }

   public final void g() {
      Display var1;
      (var1 = Display.getDisplay(this)).setCurrent(var1.getCurrent());
   }

   public void h() {
   }

   public void i() {
   }

   public void pauseApp() {
      this.i();
   }

   public void destroyApp(boolean var1) {
   }

   public final void j() {
      this.destroyApp(true);
      this.notifyDestroyed();
   }

   public final int k() {
      return this.d;
   }

   public final int l() {
      byte var1 = 100;
      if (this.k() < 240) {
         var1 = 70;
      }

      return var1;
   }
}
