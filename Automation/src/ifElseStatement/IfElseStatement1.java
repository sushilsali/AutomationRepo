package ifElseStatement;

public class IfElseStatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		if(a>b)
		{
		System.out.println(a+" is greater than "+b);
		}
		else
		{
			System.out.println(a+" is not greater than " +b);
		}

		System.out.println(a+b);
		System.out.println(a+""+b);
		System.out.println(a+""+b+"Temp");
		System.out.println(a+"Temp"+b);
		System.out.println("Temp"+a+b);
		System.out.println("Temp"+(a+b));
	}

}
