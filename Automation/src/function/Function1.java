package function;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Function1.sum();

		int add1=sum(10,20);
		int add2=sum(10,30);
		int add3=sum(10,40);
		
		// System.out.println(add1+add2+add3);
				
		String str1=name1("Hazel");
		String str2=name1("Sushil");
		String str3=name1("Radhe");
		String str4=name1("Shubhangi");
		String str5=name1("Tijil");
		String str6=name1("Ameya");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		String Fullname=name2("Sushil ", 29);
		/*
		System.out.println(Fullname);
		
		String[] ForLoop={};
		
		for(int i=0;i<10;i++)
		{
			
		}*/
		
	}

	public static void sum() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}
/*
	public static void sum(int a, int b) {
		System.out.println();
		System.out.println(a + b);
	}
*/

	public static int sum(int a, int b) 
	{
		return a+b;	
		//System.out.println();
		//System.out.println(a + b);
	}
	
	public static String name1(String name)
	{
		return "Your name is "+name;
	}
	
	public static String name2(String firstname, int age)
	{
		return"Your name is "+firstname+"and your age is"+age;
				
	}
}
