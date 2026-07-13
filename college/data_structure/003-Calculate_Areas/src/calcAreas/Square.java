package calcAreas;

public class Square {
    // Attributes
    double side;
    double area;

    // Methods
    public Square(double side){
        this.side = side;
        this.calcArea();
    }

    public void calcArea(){
        this.area = this.side*this.side;
    }
}
