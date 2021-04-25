package Circle;

import java.text.DecimalFormat;

public class Circle {

    double radius, diameter, area, perimeter;


    public void setInfo(double radius) {
        this.radius = radius;
        this.diameter = radius *2;
        area = calculateArea();
        perimeter = calcultePerimeter();
    }

    public double calculateArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double calcultePerimeter(){
        double perimeter = diameter * Math.PI;
        return perimeter;
    }

    public boolean equal(Circle circle){
        return this.radius == circle.radius;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" + df.format(area) +
                ", perimeter=" + df.format(perimeter) +
                '}';
    }
}




