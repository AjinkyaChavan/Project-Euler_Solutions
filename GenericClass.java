
public class GenericClass<T> {

	
	public T[] size;
	int pos=0;
	
	public GenericClass(int data){
		
		size = (T[]) new Object[data];
		
	}
	
	
	void add(T data){
	
		size[pos++] = data;
	}
	
	void display(){
		for(int i=0;i<pos;i++){
			System.out.println(size[i]);
		}
	}
	
}
