package week1.day1;

public class Mobile {
      //Global Variables
	String mobileModel = "Samsung M31";
	float mobileWeight = 6.5F;
	boolean isFullCharged = true;
	int mobileCost = 14000;
	
	public void makeCall() {
		// TODO Auto-generated method stub
        System.out.println("Getting a Call");
	}
	public void sendMsg() {
		// TODO Auto-generated method stub
        System.out.println("Type a message and send");
	}
	public static void main(String[] args) {
		Mobile newPhone = new Mobile();
		newPhone.makeCall();
		newPhone.sendMsg();
		System.out.println(newPhone.mobileModel);
		System.out.println(newPhone.mobileWeight);
		System.out.println(newPhone.isFullCharged);
		System.out.println(newPhone.mobileCost);
	}
}
