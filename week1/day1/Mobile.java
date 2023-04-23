package week1.day1;

public class Mobile {
	public void makeCall() 
{		
		String mobileModel="Apple@";
		float mobileWeight=2.5f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}

	public void sendMSg() 
{
		Boolean isFullCharged=true;
		int mobileCost =25000;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
		
} 
	public static void main(String[] args) {
		Mobile mob=new Mobile();
				mob.makeCall();
				mob.sendMSg();
	}
	
		
		
	}
	


