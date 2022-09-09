package practice10;

public class Q06_Child extends Q06_Area{
    @Override
    double areaOfRectangle(double widht, double height) {
        return widht*height;
    }

    @Override
    double areaOfTriangle(double base, double height) {
        return base*height/2;
    }
}
