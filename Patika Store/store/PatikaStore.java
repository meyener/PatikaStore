package store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objects.Brand;
import objects.Item;
import objects.Notebook;
import objects.Phone;

public class PatikaStore {
    Scanner scanner = new Scanner(System.in);

    public void store() {
        Item inotebookItem = new Notebook();
        Item iPhoneItem = new Phone();
        System.out.print(
                "//////////////////////////////////////////////\n\nPatikaStore Urun Yonetim Paneli \n\n1 - Notebook Islemleri\n2 - Cep Telefonu Islemleri\n3 - Marka Listele\n0 - Cikis Yap\n\nTercihiniz : ");
        int key = scanner.nextInt();
        System.out.println("//////////////////////////////////////////////\n");
        switch (key) {
            case 1:
                Operations.ıtemOperations(inotebookItem);
                break;
            case 2:
                Operations.ıtemOperations(iPhoneItem);
                break;
            case 3:
                System.out.println("URUNLERIMIZ \n");
                Repository.getBrandList().forEach(item -> System.out.printf("%2s \n", item.getName()));
                break;
            case 0:

                break;
            default:
                System.out.println("Hatali parametre !!!");
                store();
                break;
        }
    }

}
