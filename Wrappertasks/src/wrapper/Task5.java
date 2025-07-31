package wrapper;



public class Task5<T> {
	
	private T value;
	
	public void setValue(T value ) {
		this.value=value;
	}

	public T getValue() {
		return value;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task5<Integer> gr=new Task5<>();
		 gr.setValue(42); // Autoboxing from int to Integer
	      Integer intVal = gr.getValue();
	      System.out.println("Integer value: " + intVal);
	      
	      Task5<Double> gr1=new Task5<>();
			 gr1.setValue(499.88); // Autoboxing from int to Integer
		      Double doubleval = gr1.getValue();
		      System.out.println("Double value: " + doubleval);
	      
	      
		
		
		
		

	}

}
