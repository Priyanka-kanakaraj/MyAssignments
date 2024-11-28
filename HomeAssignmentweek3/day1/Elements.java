package HomeAssignmentweek3.day1;

public class Elements extends Button{
	public void execution() {	
 System.out.println("Execution Class");
}
	
public static void main (String[] args) {
	Elements el=new Elements();
	el.click();
	el.setText("Elements Inheritance");
	el.submit();
}
	

}
