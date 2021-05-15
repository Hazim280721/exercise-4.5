public class redApple extends Apple {//subclass from Apple class
	
	private String color;         
	
	
    public redApple(String name,String s,double weight,double price,String c) {
	super(name, s, weight, price);
	this.color=c;
	
}
   
   public String color() {
	   return color;
   }
   
   //overriding
   public String toString() {
	   return "Color       : "+color()+"\nFruiting    : "+season();
   }
  

}

		
	



