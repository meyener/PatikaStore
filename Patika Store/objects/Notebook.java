package objects;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import store.Repository;
public class Notebook extends Item {Scanner scanner = new Scanner(System.in);

    

    public Notebook() {}


    public Notebook(int id, int unitPrice, int unitInStock, int discount, int brandId, String name, String storage,
            String screenSize, String ram) {
        super(id, unitPrice, unitInStock, discount, brandId, name, storage, screenSize, ram);
    }

    
    @Override
    public void itemAdd() {
        System.out.println("Lutfen notebook ismi girin :");
        String name = scanner.nextLine();
        System.out.println("Lutfen notebook id girin :");
        int id = scanner.nextInt();
        System.out.println("Lutfen notebook fiyatini girin :");
        int unitPrice = scanner.nextInt();
        System.out.println("Lutfen notebook stok sayisıni girin :");
        int unitInStock = scanner.nextInt();
        System.out.println("Lutfen notebook indirim miktarini girin :");
        int discount = scanner.nextInt();
        System.out.println("Lutfen notebook marka id sini girin :");
        int brandId = scanner.nextInt();
        
        System.out.println("Lutfen notebook hafizasini girin :");
        String storage = scanner.nextLine();
        System.out.println("Lutfen notebook ekran boyutunu girin :");
        String screenSize = scanner.nextLine();
        System.out.println("Lutfen notebook RAM miktarini girin :");
        String ram = scanner.nextLine();
        System.out.println("Lutfen telefonun rengini girin :");
        

        Repository.getNotebookList().add(new Notebook(brandId, unitPrice, unitInStock, discount, 
        brandId, name, storage, screenSize, ram));
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String className() {
        // TODO Auto-generated method stub
        return "Notebook";
    }
    
    @Override
    public void itemRemove(int id) {
        Repository.getPhoneList().remove(id - 1);
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void listed() {
        System.out.printf("%2s |%15s |%17s |%15s |%15s |\n","ID","URUN ISMI","URUN FIYATI","RAM MIKTARI","DEPOLAMA");
        System.out.println("--------------------------------------------------------------------------");
        Repository.getNotebookList().forEach(item->System.out.printf("%2d |%15s |%15d tl|%15s |%15s |\n",item.getId(),item.getName(),item.getUnitPrice(),item.getRam(),item.getStorage()));
        System.out.println("--------------------------------------------------------------------------");
        Collections.sort(Repository.getNotebookList(), new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

    
    
    
    
}
