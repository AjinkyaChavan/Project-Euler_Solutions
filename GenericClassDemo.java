


public class GenericClassDemo {

	public static void main(String args[]){
		
		GenericClass<String> gc=new GenericClass<String>(10);
		
		gc.add("abc");
		gc.add("bcd");
		
		System.out.println(gc.toString());

		
		
		
	}

}
