package com.nowcomputing.e;

import com.nowcomputing.GamebandConfig;
import com.nowcomputing.Image;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class g extends funnyImageThing {
   private List h;
   private List i = new ArrayList();
   Random g = new Random();
   private Image j;
   private b k;

   g(b var1) {
      this.k = var1;
      this.d = 3;
   }

   protected void disable() {
      if (this.image2 != null) {
         this.j = new Image(20, 7);
         if (this.image1 != null) {
            this.j.setImage(this.image1);
         }

         this.h = new ArrayList(140);

         for(int x = 0; x < 20; ++x) {
            for(int y = 0; y < 7; ++y) {
               if (this.k == com.nowcomputing.e.b.a && this.image2.getPixel(x, y)) {
                  this.h.add(new Point(x, y));
               } else if (this.k == com.nowcomputing.e.b.b && this.image1.getPixel(x, y)) {
                  this.h.add(new Point(x, y));
               }
            }
         }
      }

      super.disable();
   }

   public boolean a(Point var1) {
      return this.h.contains(var1);
   }

   public Image e() {
      this.b(1);
      this.i();
      if (this.h.size() == 0 && this.i.size() == 0) {
         this.setBool(true);
      }

      return this.j;
   }

   private void b(int var1) {
      for(int var2 = 0; var2 < var1; ++var2) {
         if (this.h.size() > 0) {
            int var3 = Math.min(this.g.nextInt(3), this.h.size() - 1);
            Point var4 = (Point)this.h.remove(var3);
            if (this.k == com.nowcomputing.e.b.a) {
               this.i.add(new h(this, new Point(20, var4.y), var4, 1));
            } else {
               this.i.add(new h(this, var4, new Point(-1, var4.y), 1));
            }
         }
      }

   }

   private void i() {
      Iterator var1 = this.i.iterator();

      while(var1.hasNext()) {
         h var2 = (h)var1.next();
         if (!var2.a(this.j)) {
            var1.remove();
         }
      }

   }

   public boolean isEmpty() {
      if (this.image2 != null) {
         return !this.getBool();
      } else {
         return false;
      }
   }
}
