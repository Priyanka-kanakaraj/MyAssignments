package HomeAssignmentweek3.day1;

public class APIClient {
	//Created with one argument
	public void sendRequest(String endpoint) {
		System.out.println("Sentrequest is:"+endpoint);
		System.out.println("**********");
	}
	//created with 2 argument with same method name
	public void sendRequest(String sendRequest,String requestBody) {
		System.out.println("Sentrequest is:"+sendRequest+"\n"+"RequestBody is:" +requestBody);
		System.out.println("********");
	}
	//created with 3 argument with same method name
	public void sendRequest(String sendRequest,String requestBody,boolean requestStatus) {
		System.out.println("Sentrequest is:"+sendRequest+"\n"+"RequestBody is:" +requestBody);
		System.out.println("RequestStatus:"+requestStatus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient API= new APIClient();
		//calling methods
		API.sendRequest("http");
		API.sendRequest("www.google.com","google chrome opened");
		API.sendRequest("google","POST",true);
				
	}

}
