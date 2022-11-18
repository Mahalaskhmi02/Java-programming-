interface  Drawable {
void draw(); }
class Rectangle implements Drawable  {
public void draw() {
System.out.print(" Drawing a Rectangle"); } }
class Circle implements Drawable {
public void draw(){
System.out.println("Drawing a Cricle");
}
}
class Testinterface1 {
public static void main(String args[]) {
/*Circle c=new Circle();
c.draw();
Rectangle r=new Rectangle();
r.draw();*/
Drawable d=new Drawable();
//Drawable d=new Circle();
d.draw();
}
}