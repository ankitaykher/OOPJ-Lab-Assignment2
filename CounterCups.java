import java.util.*;
//TeaCup class 
class TeaCup{
	private String teaType;
	static int totalCups = 0;
	
	public TeaCup(String teaType){
		this.teaType = teaType;
		totalCups++;
	}
	public String getTeaType(){
		return teaType;
	}
	public static void showTotalCups(){
		System.out.println("total Cups:"+totalCups);
	}
}
class CounterCups{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);	
	
	//create first cup
	String teaType1 = sc.nextLine();
	TeaCup cup1 = new TeaCup(teaType1);
	
	String teaType2 = sc.nextLine();
	TeaCup cup2 = new TeaCup(teaType2);
	
    String teaType3 = sc.nextLine();
	TeaCup cup3 = new TeaCup(teaType3);
	
	 System.out.println(cup1.getTeaType());
     System.out.println(cup2.getTeaType());
     System.out.println(cup3.getTeaType());
        // print total cups
		
        TeaCup.showTotalCups();
         sc.close();
    }
}
	 