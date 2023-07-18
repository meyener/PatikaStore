package store;

import java.util.Scanner;

import objects.Item;

public class Operations {

    
    
    public static void ıtemOperations(Item item){
        
        
        System.out.println("1-"+item.className()+"  Ekleme,\n2-"+item.className()+" Silme,\n3-"+item.className()+" listeleme,\n4- Ana Menü");
        Scanner scanner = new Scanner(System.in);
        int key=scanner.nextInt();

        switch (key) {
            case 1:
            item.itemAdd();
                break;
                
            case 2:

            System.out.println("Lütfen silmek istediğiniz urunun id sini girin :");
            int id=scanner.nextInt();
            item.itemRemove(id);;
              
                break;
            case 3:
                item.listed();
                break;
            case 4:
                PatikaStore patikaStore=new PatikaStore();
                patikaStore.store();
                break;
        
            default:
            System.out.println("hata");
                break;}
        }
}
