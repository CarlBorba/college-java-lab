package calcAreas;

public class Triangle {
    // Attributes
    double a, b, c;
    double area;
    String triangleType;

    // Methods
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.validTriangle();
    }

    // Return True if Triangle exist end call identifyTriangle
    public boolean validTriangle() {
        // Valid Triangle
        if((this.a + this.b) < this.c || (this.a + this.c) < this.b || (this.b + this.c) < this.a) {
            return false;
        }
        identifyTriangle();
        return true;
    }

    // Identify Triangle Type
    public String identifyTriangle(){
        if((this.a == this.b) && (this.b == this.c)){
            this.triangleType = "equilateral";
        }

        if(((this.a == this.b) && (this.a != this.c)) || ((this.a == this.c) && (this.a != this.b)) || ((this.b == this.c) && (this.b != this.a))){
            this.triangleType = "isoceles";
        }

        if((this.a != this.b) )
        return "oi";
    }

    public void calcArea(){

    }
}
