package ifElseStatement;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=20;
		int b=2000;
		int c=300000;
		
		if(a>b) 
		{ 
			System.out.println("a is the greatest");
		}else if (b>c) 
		{
				System.out.println("b is the greatest");
				
		}else
		{
			System.out.println("c is the greatest");
		}
	}
}