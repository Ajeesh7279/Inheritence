package org.tcs.test.login;
public class ClientDetails extends CompanyDetails {
	
	private void clientId() {
		System.out.println("id is 566767");
		

	}
	
	private void clientName() {
		System.out.println("name is pluto");

	}
	
	public static void main(String[] args) {
		ClientDetails z=new ClientDetails();
		 
		z.clientId();
		z.clientName();
		z.comId();
		z.comName();
	
	}
	
	

}
