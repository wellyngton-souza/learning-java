public class Cars{
    int year;
    String brand;

    static int totalCars;

    // private, protected, public, package-private

    public Cars(String brand, int year){
        this.brand = brand;
        this.year = year;
        totalCars++;
    }

    void start(){
        System.out.println("ligando carro !");
    }

    void accelerate(){
        System.out.println("acelerando !");
    }

    void brake(){
        System.out.println("freando !");
    }

    static void printTotalCars(){
        System.out.println(totalCars);
    }

    public static void main(String[] args){
        Cars carInstance = new Cars("fiat", 2006);

        carInstance.start();
        carInstance.accelerate();
        carInstance.brake();
    }
}