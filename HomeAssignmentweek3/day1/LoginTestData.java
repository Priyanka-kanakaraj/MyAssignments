package HomeAssignmentweek3.day1;

public class LoginTestData extends TestData {
		public void enterUsername(String user) {
			System.out.println("Enter the username:"+user);
		}

		public void enterPassword(String pwd) {
			System.out.println("Enter the password:"+pwd);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LoginTestData ltd= new LoginTestData();
			ltd.navigateToHomePage(true);
			ltd.enterCredentials("Apple");
			ltd.enterUsername("Priya");
			ltd.enterPassword("qwerty@12");

	}

}
