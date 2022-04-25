
public class Justification {

	public static void main(String[] args) {
		//Immutable
		String str= "Study";
		str.concat("Night");
		System.out.println("The string output is:"+str);
	 
    
		
		//Mutable
		
		StringBuffer s1= new StringBuffer("study");
		s1.append("Night");
		System.out.println("The stringbuffer output is:"+s1);
	}

	}
