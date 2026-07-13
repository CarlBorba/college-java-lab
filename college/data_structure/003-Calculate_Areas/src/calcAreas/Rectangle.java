package calcAreas;

public class Rectangle {
    // Attributes
    double base;
    double height;
    double area;

    // Methods
    public Rectangle(double base, double height){
        this.base = base;
        this.height = height;
        this.calcArea();
    }

    public void calcArea(){
        this.area = this.base*this.height;
    }
}