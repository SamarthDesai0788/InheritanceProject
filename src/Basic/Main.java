package Basic;
class Parent{
	public void property() {
	System.out.println("This is Parent property");
}
	public void cash() {

	System.out.println("This is parent cash");
}
}
class Child extends Parent {
	public void Education() {
		System.out.println("Its child education");
	}
}
	public class Main{
	public static void main(String[] args) {
		Child p1=new  Child();		
		p1.property();
		p1.cash();
		p1.Education();
		Parent p2=new Parent();
		p2.cash();
		p2.property();
		Parent p3=new Child();
		p3.cash();
		p3.property();
	}
}