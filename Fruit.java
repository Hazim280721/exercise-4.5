
public abstract  class Fruit  {
	private String name;//declare
	
	public Fruit (String name) {
		this.name=name;
		
		System.out.println(this.name);
		
	}  
	
	public abstract double totalPrice();
	 public abstract double totalPrice(double price);
	 public abstract double totalPrice(double weight,double price);
		
		//overriding
		public abstract String toString();  
			
		
		

		  }
		

