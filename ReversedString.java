package myWonder;

public class ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Hi everyone!!";
		String result = "";
		
		for(int d = word.length()-1; d>=0; d--)
			
			result+=word.charAt(d);
		
		System.out.println(result);
	}

}
