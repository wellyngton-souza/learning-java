public class EletricCars extends Cars{
    int batteryCapacity;
    String model;

    // posso criar quantos construtores eu quiser

    public EletricCars(String brand, int year, int batteryCapacity){
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }

    public EletricCars(String brand,String model, int year, int batteryCapacity){
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
        this.model = model;
    }

    public static void main(String[] args){
        EletricCars carInstance = new EletricCars("chevolet", "model s", 2017, 80);

        carInstance.start();
        printTotalCars();
    }
}