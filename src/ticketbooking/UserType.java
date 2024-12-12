package ticketbooking;

public class UserType {
	
	static String specialdiscount;
	protected int flag;
	  
      protected  UserType(int user) {
    	  if(user==1) {
  			System.out.println("800$");

    		  flag=10;
    	  }
    	  else
    		  flag=20;
    		}
    		
    		public  UserType(String specialdiscount) {
    			System.out.println("800$");
    		}
    
    	  
    	  
      
}
