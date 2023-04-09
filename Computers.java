package seminar_6;

import java.util.HashSet;

/*
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет */
public class Computers {
   private String name, os, color;// os - операционная система
   private Integer om, hardCDisk; // om - оперативная память, hardCDisk - объем жесткого диска

   public Computers(String name, String os, Integer om, Integer hardCDisk, String color) {
      this.name = name;
      this.os = os;
      this.om = om;
      this.hardCDisk = hardCDisk;
      this.color = color;
   }

   public static void getAll(HashSet<Computers> set) {
      System.out.println("Все модели:");
      System.out.println("----------------------------------------");
      for (Computers i : set) {
         System.out.println("Бренд ноутбука: " + i.name + '\n' + "Операционная система: " + i.os
               + '\n' + "Объем оперативной памяти: " + i.om + '\n'
               + "Объем жесткого диска:" + i.hardCDisk + '\n' + "Цвет: " + i.color + '\n');
      }
   }

   public void filterString(String inputString) {
      if (this.name.equals(inputString)) {
         print();
      } else if (this.os.equals(inputString)) {
         print();
      } else if (this.color.equals(inputString)) {
         print();
      }
   }

   public void filterMaxMin (int min, int max){
      if(this.om >= min && this.om <= max){
         print();
      }
      if(this.hardCDisk >= min && this.hardCDisk <= max){
         print();
      }
   }

   public void print() {
      System.out.println("Бренд ноутбука: " + this.name + '\n' + "Операционная система: " + this.os
            + '\n' + "Объем оперативной памяти: " + this.om + '\n'
            + "Объем жесткого диска:" + this.hardCDisk + '\n' + "Цвет: " + this.color + '\n');
   }
}