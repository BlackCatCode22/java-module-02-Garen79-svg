package visible;

public class LargestofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double n1 = 23.4, n2 = 31.6, n3 = 53.1;
		
		if(n1 >= n2) {
			if(n1 >= n3)
				System.out.println(n1 + " is the largest number. ");
			else
				System.out.println(n3 + " is the largest number. ");
		} else { 
			if(n2 >= n3)
				System.out.println(n2 + " is the largest number. ");
			else
				System.out.println(n3 + " is the largest number. ");
	
		}
	}
}
