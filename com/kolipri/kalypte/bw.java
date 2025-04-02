package com.kolipri.kalypte;

public final class bw extends com.kolipri.kt.ad {
   public String a = new String("");
   public String l = new String("");

   public bw(com.kolipri.kt.r var1, String var2, String var3) {
      super(var1);
      this.a = var2 == null ? "" : var2;
      this.l = var3 == null ? "" : var3;
   }

   public final void a() {
      super.a();
      this.b(50);
      if (this.l != null && this.l.equals("addgroup")) {
         this.b("New Group");
      }

      if (this.l != null && this.l.equals("renamegroup")) {
         this.b("Rename Group");
      }

   }

   public final void a(String var1) {
      super.a(var1);
      new com.kolipri.kpr.f();
      new String("");
      if (var1 != null && !var1.equals("") && this.l.equals("renamegroup")) {
         new String("");
         String var5 = null;
         boolean var6 = true;

         for(int var2 = 0; ((Kalypte)super.b).k.c != null && var2 < ((Kalypte)super.b).k.c.b(); ++var2) {
            com.kolipri.kimp.ac var7;
            if ((var7 = (com.kolipri.kimp.ac)((Kalypte)super.b).k.c.b(var2)) != null && var7.a() != null && (var5 = var7.a()).equals(this.a)) {
               String var8 = ((Kalypte)super.b).h.a("amazilia.username");
               var8 = var8 + ".groups." + var5;
               if ((var8 = ((Kalypte)super.b).h.a(var8.toString())) != null && !var8.equals("")) {
                  var8 = ((Kalypte)super.b).h.a("amazilia.username");
                  var8 = var8 + ".groups." + var5;
                  ((Kalypte)super.b).h.b(var8.toString(), var1);
                  ((Kalypte)super.b).h.c();
                  this.d();
                  var6 = false;
                  break;
               }
            }
         }

         if (var6) {
            ((Kalypte)super.b).i.a(com.kolipri.kimp.ae.c(this.a, var1));
         }
      }

   }

   private void d() {
      ((Kalypte)super.b).k.d();
   }
}
