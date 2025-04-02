package com.kolipri.kalypte;

import javax.microedition.io.Connector;
import javax.microedition.io.PushRegistry;
import javax.wireless.messaging.BinaryMessage;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.MessageListener;
import javax.wireless.messaging.TextMessage;

public final class bs implements MessageListener {
   public MessageConnection a;
   private com.kolipri.kt.r c = null;
   private String d = "sms://:50000";
   public static bs b;

   private bs(com.kolipri.kt.r var1) {
      this.c = var1;
   }

   public static bs a(com.kolipri.kt.r var0) {
      if (b == null) {
         b = new bs(var0);
      }

      return b;
   }

   private void c() {
      try {
         if (this.a != null) {
            this.a.close();
            this.a = null;
         }

         this.a = (MessageConnection)Connector.open(this.d, 1);
         this.a.setMessageListener(this);
      } catch (Exception var3) {
         (new StringBuffer()).append("messcon:").append(var3.toString()).toString();
      }

      String[] var1;
      if ((var1 = PushRegistry.listConnections(true)) != null && var1.length > 0) {
         PushRegistry.unregisterConnection(this.d);

         for(int var2 = 0; var1 != null && var2 < var1.length; ++var2) {
            if (var1[var2].equals(this.d)) {
               this.e();
               return;
            }
         }

      } else {
         try {
            PushRegistry.registerConnection(this.d, "com.kolipri.kalypte.Kalypte", "*");
         } catch (Exception var4) {
         }
      }
   }

   public final void a() {
      this.c();
   }

   public final void b() {
      this.d();
   }

   public final void notifyIncomingMessage(MessageConnection var1) {
      (new StringBuffer()).append("*Starting to listen incoming message to port ").append(this.d).toString();
      this.e();
   }

   private void d() {
      try {
         if (this.a != null) {
            this.a.setMessageListener((MessageListener)null);
            this.a.close();
            this.a = null;
         }

      } catch (Exception var2) {
         (new StringBuffer()).append("Stop smshandler:").append(var2.toString()).toString();
      }
   }

   private static String a(String var0) {
      String var1 = null;
      String var2 = "Validation PIN: ";
      if (var0 != null && var0.length() > 20 && var2.equals(var0.substring(0, var2.length()))) {
         var1 = var0.substring(var2.length(), var2.length() + 5);
      }

      return var1;
   }

   private void e() {
      String var1 = null;
      Message var2 = null;

      try {
         if (this.a != null) {
            if ((var2 = this.a.receive()) instanceof TextMessage) {
               TextMessage var3;
               if ((var3 = (TextMessage)var2).getPayloadText() != null) {
                  var1 = a(var3.getPayloadText());
               }
            } else {
               byte[] var4;
               BinaryMessage var6;
               if (var2 instanceof BinaryMessage && (var4 = (var6 = (BinaryMessage)var2).getPayloadData()).toString() != null) {
                  var1 = a(var4.toString());
               }
            }
         }
      } catch (Exception var5) {
         (new StringBuffer()).append("processMessage.receive ").append(var5).toString();
      }

      if (var1 != null) {
         ((Kalypte)this.c).a(var1);
         com.kolipri.kt.a var7;
         (var7 = new com.kolipri.kt.a(this.c)).a();
         var7.a("* We have confirmed your number via an SMS\n\n Once you complete your registration you can start using Uzzap immediately.");
         var7.a(this.c.c());
      }

   }
}
