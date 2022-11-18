interface  Printable {
int m=50;
void print(); }
class Testinterface implements Printable {
public void print() {
System.out.print(" Hello, printable interface"); }
public static void main(String args[]) {
Testinterface t=new Testinterface();
System.out.println(t.m);
t.print();
}
}