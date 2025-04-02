package com.kolipri.kalypte;

public final class bo extends com.kolipri.kt.ae {
   public bo(com.kolipri.kt.r var1, com.kolipri.kimp.p var2) {
      super(var1, "buddyoptions");
      this.a(var2);
      super.k = 1;
   }

   private void a(com.kolipri.kimp.p var1) {
      String var2 = var1.a("type");
      String var3 = var1.a("username");
      String var4 = var1.c(((Kalypte)super.i).h.a("kalypte.countrycode"));
      String var5 = var1.a("status");
      String var6 = var1.a("authorized");
      String var7 = var1.c();
      var1.a("frequent");
      var1.a("chatter");
      if (var3 != null && (var6 == null || !var6.equals("yes"))) {
         this.a(0, "Authorize as Buddy");
      }

      if (var3 != null && (var5 == null || var5.equals("unknown"))) {
         this.a(1, "Request to Authorize");
      }

      if (var2 != null && (var2.equals("yahoo") || var2.equals("msn"))) {
         this.a(2, "Send Message");
      }

      if (var2 != null && var2.equals("amazilia") && var3 != null && var6 != null && var5 != null && !var5.equals("unknown")) {
         this.a(2, "Send Message");
      }

      if (var7 != null && var7.length() > 0 && !var1.g() && (var3 == null || var6 != null && var6.equals("yes") && var5 != null && !var5.equals("unknown"))) {
         this.a(15, (com.kolipri.kt.ai)null, "Send Email");
      }

      if (var4 != null && var4.length() > 0) {
         if (super.i != null && (var3 == null || var6 != null && var6.equals("yes") && var5 != null && !var5.equals("unknown")) && com.kolipri.kimp.e.b(var4, ((Kalypte)super.i).h.a("kalypte.localprefixes"))) {
            if (var3 == null && var1.j()) {
               this.a(16, "Send E-SMS");
            }
         } else if (Kalypte.w() && (var3 == null || var6 != null && var6.equals("yes") && var5 != null && !var5.equals("unknown"))) {
            this.a(3, "Send SMS");
         }
      }

      if (var3 == null) {
         boolean var10 = false;
         int var11 = 0;
         if (var2 != null && var2.equals("yahoo")) {
            ++var11;
         }

         if (var2 != null && var2.equals("msn")) {
            ++var11;
         }

         if (var4 != null && var4.length() > 0) {
            ++var11;
         }

         if (var7 != null && var7.length() > 0) {
            ++var11;
         }

         if (var11 > 1) {
            var10 = true;
         }

         if (var2 != null && var2.equals("yahoo")) {
            this.a(10, var10 ? "Invite via Yahoo" : "Invite");
         }

         if (var2 != null && var2.equals("msn")) {
            this.a(11, var10 ? "Invite via MSN" : "Invite");
         }

         if (var4 != null && var4.length() > 0) {
            this.a(12, var10 ? "Invite via E-SMS" : "Invite");
         }

         if (var7 != null && var7.length() > 0) {
            this.a(14, var10 ? "Invite via Email" : "Invite");
         }
      }

      if (var2 != null && var2.equals("amazilia") && var3 != null && var6 != null && var5 != null && !var5.equals("unknown")) {
         this.a(4, "Send Contacts");
      }

      if (var2 != null && var2.equals("amazilia") && var3 != null && var6 != null && var5 != null && !var5.equals("unknown")) {
         this.a(9, "Group Chat");
      }

      if (!var1.g() && (var3 == null || var6 != null && var6.equals("yes") && var5 != null && !var5.equals("unknown"))) {
         String var12;
         if ((var12 = var1.a("groups")) != null && var12.indexOf("chatterbox") > -1) {
            this.a(18, super.i.a.b("tickbox-selected"), "My Friends");
         } else {
            this.a(18, super.i.a.b("tickbox-not-selected"), "My Friends");
         }

         this.a(19, "Other Groups");
      }

      this.a(5, "Profile");
      if (var2 != null && var2.equals("amazilia")) {
         this.a(7, "Remove Buddy");
      }

      if (var1.a("amaz-cid") != null && !var1.g() && (var3 == null || var6 != null && var6.equals("yes") && var5 != null && !var5.equals("unknown"))) {
         this.a(8, "View History");
      }

   }
}
