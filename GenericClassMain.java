
public class GenericClassMain {

	public static void main(String[] args) {

		GenericClass<Integer> gint = new GenericClass<Integer>(10);
		
		gint.add(10);
		gint.add(22);
		gint.add(33);
		
		gint.display();
		
		GenericClass<String> gstring = new GenericClass<String>(10);
		
		gstring.add("aaiala");
		gstring.add("ye kya hoga");
		
		gstring.display();
		
	}

}
