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
		      double w;
		      
				System.out.printf("%-12s: %s KG%n", "Weight", weight);
				System.out.printf("%-12s: RM %s%n", "Price", price);
				if (name =="Apple" || name == "Red apple") {
		  
		   
				Discount aa = new AppleDiscount(); //create new object for Apple discount	
				System.out.println("DISCOUNT : "+aa.getDiscount()); 
				w = aa.getDiscount();
				double dis=aa.getDiscount();
				 totalPrice(dis,p);
				
				}
				else {
					Discount aa = new redAppleDiscount(); //create new object for Durian discount
					System.out.println("DISCOUNT  : "+aa.getDiscount()); 
					w =aa.getDiscount();
					 double dis=aa.getDiscount();
					 totalPrice(dis,p);
				}
			
			

		 
		 //overloading with 2 arguments
			System.out.println("If quantity MORE than 5, Total price: RM" +totalPrice(w,p));
			toString();
	  }
	  }
	  public double totalPrice(){
		   return this.price*this.weight;
	   }
	   public double totalPrice(double price){
		   return price*this.weight;
	   }
	   public double totalPrice(double dis ,double price){
		double tp=price*this.weight;
		 double disc=dis*tp;
		return tp-disc;
		 
		   
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
