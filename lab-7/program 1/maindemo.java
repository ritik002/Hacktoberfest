//Wap to show use of super keyword in java

class superdemo{

	String firstname;
	String lastname;
	//int i;
	
	superdemo(String fstname,String lstname){
	firstname=fstname;
	lastname=lstname;
	}
	
	public void display(){
		System.out.println("hi");
	}
}

class childdemo extends superdemo{
	
	String middlename;
	//int i;
	childdemo(String fstname,String mname,String lstname){
		super(fstname,lstname);
		middlename=mname;
	}		
	public void displayname(){
		//i=10;
		//super.i=20;
		System.out.println("Full name    is " + "  " + firstname +  "  " + middlename + "   " +lastname);
	}
	public void display(){
		super.display();
		System.out.println("hello");
	}
}
public class maindemo{

	public static void main(String args[]){
		childdemo d1=new childdemo("Shrimaan","Shreyansh","Chaurasia");
		d1.displayname();
		d1.display();
	}
}	