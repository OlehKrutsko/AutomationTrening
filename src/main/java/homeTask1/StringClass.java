package homeTask1;

public class StringClass {


	
	
public String concatenation (String str1){
	return str1 = str1.concat("all the time");
	
}

public String replacement (String str1){
	return str1 = str1.replace("test", "hoho");
	
}

	   public static void main(String args[]) {
		  StringClass s = new StringClass();
				   System.out.println(s.concatenation("I'm right "));  
				   System.out.println(s.replacement("test")); 
	   }

}
