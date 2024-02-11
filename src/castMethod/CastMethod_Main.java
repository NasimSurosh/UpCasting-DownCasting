package castMethod;

class  Parent{
	public static void greet () {
		System.out.println("Greet from Parent class");
	}
}
class Child extends Parent{
	
	public static void greet() {
		System.out.println("Greet from Child class");
	}
}
public class CastMethod_Main {

	public static void main(String[] args) {
		
		
		Object o = new Parent();
		
		Child c = new Child();
		
		Object a = Parent.class.cast(c);
		
		
		System.out.println(o.getClass());
		System.out.println(c.getClass());
		System.out.println(a.getClass());
	}

}
