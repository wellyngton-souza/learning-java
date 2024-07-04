public interface Shapes {
    double pi = 3.14;

    void draw();

    default double areaOfCircle(double radius){
        return pi * (Math.pow(radius, 2));
    }
}