public class Circle implements Shapes{
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("esse é o raio: " + radius);
    }

    public static void main(String[] args){
        Circle circleInstance = new Circle(2);

        circleInstance.draw();
        double area = circleInstance.areaOfCircle(circleInstance.radius);
        System.out.println(area);
    }
}
