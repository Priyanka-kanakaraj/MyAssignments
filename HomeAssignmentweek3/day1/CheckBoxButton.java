package HomeAssignmentweek3.day1;

public class CheckBoxButton extends Button {
	public void clickCheckButton() {
		System.out.println("Checkbutton");
	}

	public static void main(String[] args) {
		CheckBoxButton ch= new CheckBoxButton();
		//calling the button methods
		ch.clickCheckButton();
		ch.click();
		ch.setText("OOps");
		ch.submit();
	}
}
