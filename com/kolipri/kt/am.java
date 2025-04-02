package com.kolipri.kt;

import com.kolipri.kalypte.bp;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public final class am extends Canvas {
   protected r a = null;
   protected x b = null;
   protected d c = null;
   protected Vector d = new Vector();
   protected long e = 0L;
   protected n f;
   protected Timer g;
   protected <undefinedtype> h;

   public final void a(n var1) {
      if (this.g != null) {
         this.h.cancel();
         this.g.cancel();
      }

      this.g = new Timer();
      this.h = new TimerTask(this) {
         private final am a;

         public {
            this.a = var1;
         }

         public final void run() {
            if (!this.a.f.a()) {
               if (this.a.f.b() == 0) {
                  this.cancel();
                  this.a.repaint();
               } else {
                  this.a.f.c();
                  this.a.repaint();
               }
            }
         }
      };
      this.g.schedule(this.h, (long)var1.b(), (long)var1.b());
      this.f = var1;
   }

   public am(r var1) {
      this.a = var1;
      this.f();
      this.c = new d(this.getWidth(), this.getHeight());
   }

   private void f() {
      boolean var1 = true;
      String var2;
      if ((var2 = System.getProperty("microedition.platform")) == null) {
         var1 = true;
      } else if (var2.startsWith("Jbed")) {
         var1 = false;
      }

      this.setFullScreenMode(var1);
   }

   public final l a() {
      return this.g();
   }

   private l g() {
      l var1 = null;
      if (this.d.size() > 0) {
         var1 = (l)this.d.elementAt(this.d.size() - 1);
      }

      return var1;
   }

   public final void a(String var1) {
      if (this.a != null && this.a.b() && !this.a.g) {
         if (var1 != null && var1.equals("Unlock")) {
            this.a.g = true;
            bp var3;
            (var3 = new bp(this.a)).a();
            var3.a(this.a.c());
            return;
         }
      } else {
         l var2;
         if ((var2 = this.g()) != null) {
            var2.b(var1);
         }
      }

   }

   public final void a(l var1) {
      l var2;
      if ((var2 = this.g()) != null) {
         var2.C();
      }

      this.d.addElement(var1);
      var1.b(this);
      var1.B();
      this.c();
      this.repaint();
   }

   public final void b(l var1) {
      if (var1 == this.g()) {
         var1.C();
      }

      this.d.removeElement(var1);
      this.c();
      this.repaint();
   }

   public final d b() {
      return this.c;
   }

   public final void a(x var1) {
      this.b = var1;
   }

   public final void c() {
      if (this.a != null && this.a.b() && !this.a.g) {
         this.b.a("Unlock", "");
      } else {
         l var1;
         if ((var1 = this.g()) != null) {
            var1.a(this.b);
         }

      }
   }

   public final x d() {
      return this.b;
   }

   protected final void paint(Graphics var1) {
      for(int var3 = 0; var3 < this.d.size(); ++var3) {
         l var2;
         if ((var2 = (l)this.d.elementAt(var3)) != null && var2.n()) {
            var2.a(new e(var1, var2.o()));
         }
      }

      if (this.f != null && this.a.a.c.equals("dolphins") && this.a().E() == null && !(this.a() instanceof k)) {
         this.f.a(var1);
      }

   }

   protected final void keyRepeated(int var1) {
      if ((new Date()).getTime() >= this.e + 250L) {
         this.keyPressed(var1);
      }

   }

   protected final void keyPressed(int var1) {
      al var2;
      (var2 = new al()).a = var1;
      if (var2.a == -10) {
         var2.b = 9;
      } else if (var2.a() == 0) {
         switch(this.getGameAction(var1)) {
         case 1:
            var2.b = 1;
            break;
         case 2:
            var2.b = 3;
         case 3:
         case 4:
         case 7:
         default:
            break;
         case 5:
            var2.b = 4;
            break;
         case 6:
            var2.b = 2;
            break;
         case 8:
            if (var1 != -7 && var1 != -6) {
               var2.b = 5;
            }
         }
      }

      if (var2.b == 0) {
         switch(var1) {
         case -203:
         case -22:
         case -7:
         case -4:
         case 22:
         case 106:
            var2.b = 7;
            break;
         case -202:
         case -21:
         case -11:
         case -6:
         case -1:
         case 21:
         case 105:
            var2.b = 6;
            break;
         case -10:
            var2.b = 9;
            break;
         case -8:
         case 8:
            var2.b = 8;
         }
      }

      if (!this.a.b() || this.a.b() && var2.b == 6 || var2.b == 7) {
         boolean var3 = false;
         synchronized(this.a) {
            l var5;
            if ((var5 = this.g()) != null) {
               var3 = var5.a(var2);
            }

            if (!var3 && this.b != null) {
               this.b.a(var2);
            }
         }

         if (this.a != null) {
            this.a.a();
         }
      }

      this.e = (new Date()).getTime();
   }

   protected final void pointerPressed(int var1, int var2) {
      boolean var3 = false;
      if (this.b != null && this.a.b()) {
         ag var4 = this.b.o();
         d var5 = this.b.s();
         var3 = var1 >= var4.a && var2 >= var4.b && var1 < var4.a + var5.a && var2 < var4.b + var5.b;
      }

      if (!this.a.b() || this.a.b() && var3) {
         this.pointerDragged(var1, var2);
         if (this.a != null) {
            this.a.a();
         }
      }

   }

   protected final void pointerReleased(int var1, int var2) {
      boolean var3 = false;
      ag var4 = null;
      d var5 = null;
      if (this.b != null) {
         var4 = this.b.o();
         var5 = this.b.s();
         var3 = var1 >= var4.a && var2 >= var4.b && var1 < var4.a + var5.a && var2 < var4.b + var5.b;
      }

      if (!this.a.b() || this.a.b() && var3) {
         synchronized(this.a) {
            boolean var7 = false;
            l var8;
            if ((var8 = this.g()) != null) {
               var4 = var8.o();
               var5 = var8.s();
               if (var1 >= var4.a && var2 >= var4.b && var1 < var4.a + var5.a && var2 < var4.b + var5.b) {
                  var7 = var8.a(var1 - var4.a, var2 - var4.b);
               }
            }

            if (!var7 && var3 && var4 != null && var5 != null) {
               ag var9 = this.b.o();
               this.b.a(var1 - var9.a, var2 - var9.b);
            }

         }
      }
   }

   protected final void pointerDragged(int var1, int var2) {
      if (!this.a.b()) {
         synchronized(this.a) {
            l var5;
            if ((var5 = this.g()) != null) {
               ag var6 = var5.o();
               d var7 = var5.s();
               if (var1 >= var6.a && var2 >= var6.b && var1 < var6.a + var7.a && var2 < var6.b + var7.b) {
                  var5.b(var1 - var6.a, var2 - var6.b);
               }
            }

         }
      }
   }

   protected final void sizeChanged(int var1, int var2) {
      this.c = new d(var1, var2);
      synchronized(this.a) {
         int var3 = 0;

         while(true) {
            if (var3 >= this.d.size()) {
               break;
            }

            l var5;
            if ((var5 = (l)this.d.elementAt(var3)) != null) {
               if (var5 instanceof k) {
                  ((k)var5).g();
               } else {
                  var5.a(this.c);
               }
            }

            ++var3;
         }
      }

      this.a.a(var1, var2);
   }

   public final void e() {
      if (this.c != null) {
         this.sizeChanged(this.c.a, this.c.b);
      }

   }
}
