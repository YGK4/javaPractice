package structure.class1.methods;

public class Example{  
	    int id;  
	    String name;  
	    //creating a parameterized constructor  
	    Example(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    Example s1 = new Example(111,"Karan");  
	    Example s2 = new Example(222,"Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	}  

