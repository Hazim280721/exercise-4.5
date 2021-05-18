public class greenApple extends Apple{//subclass from aplle class

	
	private String color;
	
	
    public greenApple(String name,String s,double weight,double price,String c) {
	super(name,s,weight,price);
	this.color=c;
}
  
   public String color() {
	   return this.color;
   }
   
 //overriding
   public String toString() {
	   return "Color       : "+color()+"\nFruiting    : "+season();
   }
  
}