package task1;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Circle {

    double centreX, centreY, radius;

    public Circle(double centreX, double centreY, double radius) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double square() {
        return Math.PI * radius * radius;
    }

    public double perimetr() {
        return Math.PI * 2 * radius;
    }

}
