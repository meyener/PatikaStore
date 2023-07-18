package objects;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import store.Repository;

public class Phone extends Item {
    Scanner scanner = new Scanner(System.in);
    private String color;
    private String battery;
    private Brand brand;
    
    public Phone() {
        super();
    }

    public Phone(int id, int unitPrice, int unitInStock, int discount, int brandId,
     String name, String storage,
    String screenSize, String ram, String color, String battery) {
        super(id, unitPrice, unitInStock, discount, brandId, name, storage, screenSize, ram);
        this.color = color;
        this.battery = battery;
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }
    
    @Override
    public void itemAdd() {
        System.out.println(" ");
        System.out.print("Lutfen telefon ismi girin :");
        String name = scanner.nextLine();
        System.out.print("Lutfen telefon id girin :");
        int id = scanner.nextInt();
        System.out.print("Lutfen telefon fiyatini girin :");
        int unitPrice = scanner.nextInt();
        System.out.print("Lutfen telefon stok sayisini girin :");
        int unitInStock = scanner.nextInt();
        System.out.print("Lutfen telefon indirim miktarini girin :");
        int discount = scanner.nextInt();
        System.out.print("Lutfen telefonun Marka id sini girin :");
        int brandId = scanner.nextInt();
        


        System.out.print("Lutfen telefonun hafizasini girin :");
        String storage = scanner.nextLine();
        System.out.print("Lutfen telefonun ekran boyutunu girin :");
        String screenSize = scanner.nextLine();
        System.out.print("Lutfen telefonun RAM miktarini girin :");
        String ram = scanner.nextLine();
        System.out.print("Lutfen telefonun rengini girin :");
        String color = scanner.nextLine();
        System.out.print("Lutfen telefonun batarya miktarini girin :");
        String battery = scanner.nextLine();

        Repository.getPhoneList().add(new Phone(brandId, unitPrice, unitInStock, discount, brandId, name, storage,
                screenSize, ram, color, battery));
    }

    @Override
    public void itemRemove(int id) {
        Repository.getPhoneList().remove(id - 1);
    }

    @Override
    public String className() {
        // TODO Auto-generated method stub
        return "Telefon";
    }

    @Override
    public void listed() {
        System.out.printf("%2s |%15s |%17s |%15s |%15s |\n","ID","URUN ISMI","URUN FIYATI","RAM MIKTARI","DEPOLAMA");
        System.out.println("--------------------------------------------------------------------------");
        Repository.getPhoneList().forEach(item->System.out.printf("%2d |%15s |%15d tl|%15s |%15s |\n",item.getId(),item.getName(),item.getUnitPrice(),item.getRam(),item.getStorage()));
        System.out.println("--------------------------------------------------------------------------");
        Collections.sort(Repository.getPhoneList(), new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getId() - o2.getId();
            }
        });
        }
    

    
    
    
}
