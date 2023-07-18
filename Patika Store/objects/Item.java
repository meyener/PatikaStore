package objects;

public class Item {
    private int id;
    private int unitPrice;
    private int unitInStock;
    private int discount;
    private Brand brand;
    private String name;
    private String storage;
    private String screenSize;
    private String ram;

    
    public Item() {
    }


    public Item(int id, int unitPrice, int unitInStock, int discount, int brandId, String name, String storage,
            String screenSize, String ram) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
        this.discount = discount;
        this.brand = brand;
        this.name = name;
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getUnitPrice() {
        return unitPrice;
    }


    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }


    public int getUnitInStock() {
        return unitInStock;
    }


    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }


    public int getDiscount() {
        return discount;
    }


    public void setDiscount(int discount) {
        this.discount = discount;
    }


    public Brand getBrand() {
        return brand;
    }


    public void setBrand(Brand brand) {
        this.brand = brand;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getStorage() {
        return storage;
    }


    public void setStorage(String storage) {
        this.storage = storage;
    }


    public String getScreenSize() {
        return screenSize;
    }


    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }


    public String getRam() {
        return ram;
    }


    public void setRam(String ram) {
        this.ram = ram;
    }
    
    public String className(){

        return "";
    }

    public void itemAdd(){

    }
    public void itemRemove(int id){

    }
    public void listed(){

    }

    
    
    
    

}