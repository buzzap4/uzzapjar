package com.kolipri.kpr;

import javax.microedition.media.Manager;
import javax.microedition.media.Player;

public final class p {
   protected Player a = null;
   protected boolean b = false;

   public final boolean a() {
      return this.b;
   }

   public final void b() {
      this.b = !this.b;
   }

   public final void c() {
      if (!this.b) {
         try {
            if (this.a != null) {
               if (this.a.getState() == 300) {
                  this.a.start();
               }

               return;
            }

            this.a = Manager.createPlayer(this.getClass().getResourceAsStream("/alert.wav"), "audio/x-wav");
            this.a.setLoopCount(1);
            this.a.realize();
            this.a.prefetch();
            this.a.start();
         } catch (Exception var4) {
            try {
               this.a = Manager.createPlayer(this.getClass().getResourceAsStream("/alert.amr"), "audio/amr");
               this.a.setLoopCount(1);
               this.a.realize();
               this.a.prefetch();
               this.a.start();
               return;
            } catch (Exception var3) {
               var3.toString();
            }
         }

      }
   }
}
