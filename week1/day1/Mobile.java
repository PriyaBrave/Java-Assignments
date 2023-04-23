package week1.day1;

public class Mobile {

	// Method to Make Call

	private void makeCall() {
		String mobileModel = "Redmi Note 9";
		float mobileWeight = 7.5f;
		System.out.println("Mobile Model is " + mobileModel + "\nMobile Weight is " + mobileWeight);
	}

	public void sendMsg() {
		boolean isFullyCharged = true;
		int mobileCost = 15000;
		System.out.println("Mobile is Fully Charged or Not: " + isFullyCharged + "\nMobile Cost is " + mobileCost);
	}

	public static void main(String[] args) { 
		Mobile obj = new Mobile();
		obj.sendMsg();
		obj.makeCall();
		System.out.println("This is my Mobile..");
	}

}
