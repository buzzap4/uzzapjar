package com.kolipri.kalypte;

public final class aa extends com.kolipri.kt.l implements com.kolipri.kt.b {
   public aa(com.kolipri.kt.r var1) {
      super(var1);
   }

   public final void a() {
      com.kolipri.kt.ae var1;
      (var1 = new com.kolipri.kt.ae(super.b_, "settings-options")).a(1, (com.kolipri.kt.ai)null, "Edit My Profile");
      var1.a(2, (com.kolipri.kt.ai)null, "Change Status");
      var1.a(3, (com.kolipri.kt.ai)null, "Change Password");
      var1.a(4, (com.kolipri.kt.ai)null, "Change Mobile Number");
      var1.a(5, (com.kolipri.kt.ai)null, "Offline Settings");
      var1.a(6, (com.kolipri.kt.ai)null, "Chatroom Tones");
      var1.a(this);
      com.kolipri.kt.g var2;
      (var2 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var1);
      var2.a(super.b_.c());
   }

   public final boolean a(com.kolipri.kt.af var1, int var2) {
      if (var1.a().equals("settings-options")) {
         switch(var2) {
         case 1:
            dj var9;
            (var9 = new dj(super.b_)).a();
            var9.a(super.b_.c());
            break;
         case 2:
            com.kolipri.kt.ae var8;
            (var8 = new com.kolipri.kt.ae(super.b_, "statuses")).a(14, super.b_.a.b("statusmessage"), "Status Message..");
            var8.a(11, super.b_.a.b("online"), "Available");
            var8.a(12, super.b_.a.b("notavailable"), "Not Available");
            var8.a(13, super.b_.a.b("offline"), "Invisible");
            var8.a(this);
            com.kolipri.kt.g var4;
            (var4 = new com.kolipri.kt.g(super.b_)).a((com.kolipri.kt.af)var8);
            var4.a(super.b_.c());
            break;
         case 3:
            co var7;
            (var7 = new co(super.b_)).a();
            var7.a(super.b_.c());
            break;
         case 4:
            e var6;
            (var6 = new e(super.b_)).a();
            var6.b();
            break;
         case 5:
            cw var5;
            if ((var5 = ((Kalypte)super.b_).n()) != null && var5.b() != null) {
               var5.b().J();
               var5.g();
            }
            break;
         case 6:
            av var3;
            (var3 = new av(super.b_)).a();
            var3.a(super.b_.c());
         }
      } else if (var1.a().equals("statuses")) {
         switch(var2) {
         case 11:
            ((Kalypte)super.b_).c("freeforchat", (String)null);
            break;
         case 12:
            ((Kalypte)super.b_).c("notavailable", (String)null);
            break;
         case 13:
            ((Kalypte)super.b_).c("offline", (String)null);
            break;
         case 14:
            db var10;
            (var10 = new db(super.b_)).a();
            var10.b();
         }
      }

      return true;
   }
}
