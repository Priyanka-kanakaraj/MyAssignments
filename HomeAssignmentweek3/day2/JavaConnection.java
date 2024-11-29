package HomeAssignmentweek3.day2;

public class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc= new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();

	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect the java to the database");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect the java from the database");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execution update should done");
		
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("Executing query");
	}

}
