package com.kolipri.kalypte;

import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

public final class aj implements Runnable {
   protected com.kolipri.kt.r a = null;
   protected String b = null;
   protected String c = null;
   protected com.kolipri.kt.a d = null;

   public aj(com.kolipri.kt.r var1) {
      this.a = var1;
   }

   public final void a(String var1, String var2) {
      this.b = var1;
      this.c = var2;
      this.d = new com.kolipri.kt.a(this.a);
      this.d.c = "";
      this.d.b = "Close";
      this.d.a();
      this.d.a("Preparing to send SMS..");
      this.d.a(this.a.c());
      (new Thread(this)).start();
   }

   public final void run() {
      this.d.a("Sending SMS to '" + this.b + "'..");

      try {
         MessageConnection var2;
         TextMessage var3;
         (var3 = (TextMessage)(var2 = (MessageConnection)Connector.open("sms://+" + this.b)).newMessage("text")).setPayloadText(this.c);
         var2.send(var3);
         this.d.a("SMS Successfully sent.");
      } catch (Exception var4) {
         this.d.a("SMS sending failed.");
      }
   }
}
