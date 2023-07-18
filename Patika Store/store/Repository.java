package store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import objects.Brand;
import objects.Item;
import objects.Notebook;
import objects.Phone;

public class Repository {
   private static List<Brand> brands = new ArrayList<>();
   private static List<Phone> phones = new ArrayList<>();
   private static List<Notebook> notebooks = new ArrayList<>();

   private static Brand[] arrBrand = { new Brand(1, "Samsung"), new Brand(2, "Huawei"),
         new Brand(3, "Lenovo"), new Brand(4, "Apple"), new Brand(5, "Casper"),
         new Brand(6, "Asus"), new Brand(7, "HP"), new Brand(8, "Xiaomi"),
         new Brand(9, "Monster") };

   public Repository() {

   }

   public static List<Brand> getBrandList() {
      brands = Arrays.asList(arrBrand);
      Collections.sort(brands, new Comparator<Brand>() {
         @Override
         public int compare(Brand o1, Brand o2) {
            return o1.getName().compareTo(o2.getName());
         }
      });
      return brands;
   }

   public static List<Phone> getPhoneList() {
      phones.add(new Phone(1, 7000, 100, 300, 1, "Note 20 Ultra", "128 GB", "6,7", "12 GB", "Black", "5000 mAh"));
      phones.add(new Phone(2, 9000, 100, 300, 1, "Note 21", "128 GB", "6,7", "12 GB", "Black", "5000 mAh"));
      phones.add(new Phone(3, 15000, 100, 300, 1, "Note 22 Plus", "128 GB", "6,7", "12 GB", "Black", "5000 mAh"));

      return phones;
   }

   public static List<Notebook> getNotebookList() {
      notebooks.add(new Notebook(1, 7000, 120, 300, 2, "Huwaei Mate", "256 GB", "16", "16 GB"));
      notebooks.add(new Notebook(1, 7000, 120, 300, 2, "Huwaei Mate", "256 GB", "16", "16 GB"));
      notebooks.add(new Notebook(1, 7000, 120, 300, 2, "Huwaei Mate", "256 GB", "16", "16 GB"));

      return notebooks;
   }

}
