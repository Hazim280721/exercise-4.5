
 class AppleDiscount implements Discount {

public float getDiscount() {
	return 0.15f;
}
}

 class redAppleDiscount implements Discount{
	public float getDiscount() {
		return 0.10f;
		}
}
class GreenAppleDiscount implements Discount{

	public float getDiscount() {
		return 0.05f;
	}

	
}