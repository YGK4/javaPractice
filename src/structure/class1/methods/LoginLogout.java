package structure.class1.methods;

public class LoginLogout {
	
	public void log_In(String username,String password) {
		
		System.out.println("clickonloginbutton");
		
	}
	public void logout() {
		
		System.out.println("clickonloginbutton");
	}

	public static void main(String[] args) {
		
    LoginLogout log = new LoginLogout();
    
    log.log_In("gopal", "gok99");
    log.logout();
    
    
	}

}
