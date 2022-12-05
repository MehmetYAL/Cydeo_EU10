package Day31_Constructors;

public class Rectangle {
    public double length,widt;

    public Rectangle(double length, double widt) {
        this.length = length;
        this.widt = widt;
            }
            public double calculateArea(){
        return length*widt;
            }
            public double calcPerimeter(){
        return (length+widt)*2;
            }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", widt=" + widt +
                ", Area = " + calculateArea() +
                ", Perimeter = " + calcPerimeter() +
                '}';
    }
}
