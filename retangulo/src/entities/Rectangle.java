package entities;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Rectangle {
    public double width;
    public double height;

    public double Area(){
        return width * height;
    }
    public double Perimeter(){
        return (2*width) + (2*height);
    }
    public double Diagonal(){
        return sqrt(pow(width,2)+pow(height,2));
    }
}
