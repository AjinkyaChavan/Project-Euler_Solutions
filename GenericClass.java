
public class GenericClass<T> {

	private T[] datastore;
	int size;
	int pos;
	
	public GenericClass(int number){
		
		size=number;
		pos=0;
		datastore=(T[]) new Object[size];

	}
	
	public void add(T element){
		
		datastore[pos]=element;
		pos++;
	}
	
	@Override
	public String toString(){
		
		String elements="";
		
		for(int i=0;i<pos;i++){
			elements+=datastore[i]+" ";
		}
		return elements;
	
	}
	

}
