package com.kolipri.kpr;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public class j {
   protected SocketConnection r = null;
   protected InputStream s = null;
   protected OutputStream t = null;

   public final boolean i() {
      boolean var1 = false;
      if (this.r != null && this.s != null && this.t != null) {
         var1 = true;
      }

      return var1;
   }

   public final boolean a(String var1, int var2) {
      boolean var3 = false;
      String var4 = "socket://" + var1 + ":" + var2;

      try {
         (new StringBuffer()).append("Connecting to '").append(var4).append("' ..").toString();
         this.r = (SocketConnection)Connector.open(var4, 3, true);
         if (this.r == null) {
            (new StringBuffer()).append("Failed to open connector to '").append(var4).append("'").toString();
         } else {
            this.s = this.r.openInputStream();
            this.t = this.r.openOutputStream();
            var3 = true;
         }
      } catch (Exception var6) {
         var6.toString();
      }

      if (!var3) {
         this.g();
      }

      return var3;
   }

   public void g() {
      if (this.s != null) {
         try {
            this.s.close();
         } catch (IOException var4) {
            (new StringBuffer()).append("input.close: ").append(var4.toString()).toString();
         }
      }

      if (this.t != null) {
         try {
            this.t.close();
         } catch (IOException var3) {
            (new StringBuffer()).append("output.close: ").append(var3.toString()).toString();
         }
      }

      if (this.r != null) {
         try {
            this.r.close();
         } catch (IOException var2) {
            (new StringBuffer()).append("socket.close: ").append(var2.toString()).toString();
         }
      }

      this.s = null;
      this.t = null;
      this.r = null;
   }

   public final boolean a(String var1) {
      boolean var2 = false;
      if (this.i()) {
         try {
            var2 = this.b(var1.getBytes("UTF-8"));
         } catch (UnsupportedEncodingException var4) {
            var4.toString();
         }
      }

      return var2;
   }

   private boolean b(byte[] var1) {
      if (this.t != null) {
         try {
            this.t.write(var1);
            this.t.flush();
         } catch (IOException var4) {
            var4.toString();
            this.g();
         }
      }

      return false;
   }

   public final byte[] j() {
      byte[] var1 = null;
      if (this.s != null) {
         try {
            int var2;
            if ((var2 = this.s.available()) > 0) {
               var1 = new byte[var2];
               if (this.s.read(var1) < 0) {
                  this.g();
                  var1 = null;
               }
            } else if (var2 < 0) {
               this.g();
               var1 = null;
            }
         } catch (IOException var3) {
            var3.toString();
            this.g();
            var1 = null;
         }
      }

      return var1;
   }

   protected void b(String var1) {
   }

   protected final void a(byte[] var1) {
      try {
         this.b(new String(var1, "UTF-8"));
      } catch (UnsupportedEncodingException var3) {
         var3.toString();
      }
   }

   protected final void k() {
      byte[] var1;
      if ((var1 = this.j()) == null && !this.i()) {
         this.g();
      } else {
         if (var1 != null) {
            this.a(var1);
         }

      }
   }
}
