public class Apple extends Fruit {//subclass from fruit class
	private String season;
	protected double weight;
	protected double price;
	  public Apple(String name, String s,double weight,double price) {
		  super(name);
		  this.season=s;
		  this.weight=weight;
		  this.price=price;
	
	  
	 
		  //overloding
		  if(this.weight<=2) {
			totalPrice();	
			
			System.out.printf("%-12s: %s KG%n", "Weight", weight);
			System.out.printf("%-12s: RM %s%n", "Price", price);
			System.out.printf("%-12s: RM %s%n", "Total", totalPrice());
			toString();
			}
		  else if(this.weight>2 && this.weight<5) {
			  double p= 3.50;
				totalPrice(p);	
				
				System.out.printf("%-12s: %s KG%n", "Weight", weight);
				System.out.printf("%-12s: RM %s%n", "Price", price);
				System.out.printf("%-12s: RM %s%n", "Total", totalPrice(p));
				
				toString();
				}
		  else {
			  double p=2.50;
		      double w=5;
				totalPrice(w,p);	
				System.out.printf("%-12s: %s KG%n", "Weight", weight);
				System.out.printf("%-12s: RM %s%n", "Price", price);
				System.out.printf("%-12s: RM %s%n", "Total", totalPrice(w,p));
				toString();
		  }
	  }
	 
	  public double totalPrice(){
		   return this.price*this.weight;
	   }
	   public double totalPrice(double price){
		   return price*this.weight;
	   }
	   public double totalPrice(double weight,double price){
		   return this.price*weight;
		   
	   }
	   //getter
	public String season() {
		return this.season;
	}
	 public double weight() {
		   return this.weight;
	   }
	 public double price() {
		   return this.price;
	   }
	 //overriding 
	public String toString() {
		return "Fruiting    : "+season;
	}

	
	

	
	
	
	





	 
}
