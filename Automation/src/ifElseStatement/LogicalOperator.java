package ifElseStatement;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=90;
		int b=50;
		int c=30;
		
		if(a>b && b>c) {
			System.out.println("a is the greatest");
		}else if(b>a && b>c){
			System.out.println("b is the greatest");
		}
		else
		{
			System.out.println("c is the greatest");
		}

	}

}
