package calcAreas;

public class Triangle {
    // Attributes
    double x, y, z;
    double area;
    String triangleType;

    // Constructor
    public Triangle(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Check if triangle exists
    public boolean validTriangle() {
        if((this.x + this.y) <= this.z ||
                (this.x + this.z) <= this.y ||
                (this.y + this.z) <= this.x) {
            return false;
        }
        return true;
    }

    // Identify Triangle Type
    public String identifyTriangle(){
        if((this.x == this.y) && (this.y == this.z)){
            this.triangleType = "Equilateral";
        }
        else if((this.x == this.y) || (this.x == this.z) || (this.y == this.z)){
            this.triangleType = "Isosceles";
        }
        else {
            this.triangleType = "Scalene";
        }

        return this.triangleType;
    }

    // Calculate area (Heron's formula)
    public void calcArea(){
        double p = (this.x + this.y + this.z) / 2.0; // semiperimeter
        this.area = Math.sqrt(p * (p - this.x) * (p - this.y) * (p - this.z));
    }
}