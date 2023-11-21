abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle");
    }
}
class Test {
    public static void main(String[] args) {
   Shape shape = new Rectangle();
   Shape shape1 = new Triangle();
   shape.draw();
   shape1.draw();
    }
}