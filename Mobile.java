import java.util.*;
class Mobile{
private String mobileType;
	static int totalMobiles = 0;
	
	public Mobile(String mobileType){
		this.mobileType = mobileType;
		totalMobiles++;
	}
	public String getMobileType(){
		return mobileType;
	}
	public static void showTotalMobiles(){
		System.out.println("total Mobiles:"+totalMobiles);
	}
}
class CounterMobile{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);	
	
	//create first cup
	String mobileType1 = sc.nextLine();
	Mobile mob1 = new Mobile(mobileType1);
	
	String mobileType2 = sc.nextLine();
	Mobile mob2 = new Mobile(mobileType2);
	
    String mobileType3 = sc.nextLine();
	Mobile mob3 = new Mobile(mobileType3);
	
	 System.out.println(mob1.getMobileType());
     System.out.println(mob2.getMobileType());
     System.out.println(mob3.getMobileType());
        // print total cups
		
        Mobile.showTotalMobiles();
         sc.close();
    }
}
	 