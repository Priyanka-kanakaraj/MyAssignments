package HomeAssignmentweek3.day1;

public class Button extends WebElement {
	public void submit() {
		System.out.println("Submit");
	}
	
public static void main(String args[]){
	Button bt=new Button();
	bt.click();
	bt.setText("Inheritance");
	bt.submit();
}

}
