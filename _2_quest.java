//Question: Create a Shape class with a method calculateArea(). Inherit two classes, Circle and Rectangle, from Shape and override the calculateArea() method to calculate the area of each shape.



abstract  class Shape{
     abstract void calculateArea();

     
}
class Circle extends Shape

{
    float radius; 
    Circle(float radius)
    {
        this.radius=radius;
    }
    void calculateArea()
    {
        double area=3.14*radius*radius;
        System.out.println("area of circle:"+area);

    }
    
    
}

 class Rectangle extends Shape
 {
    float length,bradth;
    Rectangle(float length,float breadth)
    {
        this.length=length;
        this.bradth=breadth;
    }
    void calculateArea()
    {
       double area=length*bradth;
       System.out.println("area of rectangle:"+area);
    }

 }

 class main_2
 {
    public static void main(String[] args) {
        Circle c1=new Circle(4);
        c1.calculateArea();
        Rectangle r1=new Rectangle(20, 15);
        r1.calculateArea();
    }
 }
