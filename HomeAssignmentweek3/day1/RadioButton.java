package HomeAssignmentweek3.day1;

public class RadioButton extends Button{
public void selectRadioButton() {
	System.out.println("Radio Button");
}

public static void main(String[] args) {
	RadioButton rb=new RadioButton();
	rb.selectRadioButton();
	rb.click();
	rb.setText("Inheritance concept");
	rb.submit();
}
}
