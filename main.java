public class main {

	public static void main(String[] args) {
		 Fruit b=new Apple("Fruit", "Every year",3,2);
		   
		 System.out.println(b);
		 System.out.println();
	    
	    Apple a=new Apple("Apple","September-November",2,4);
	    
		System.out.println(a);
		System.out.println();
        
        redApple c=new redApple("Red Apple","October",3,4,"Red");
        
        System.out.println(c);
        System.out.println();
        
        greenApple d=new greenApple("Green Apple","November",7,4,"Green");
       
        System.out.println(d);
        
	}

}
