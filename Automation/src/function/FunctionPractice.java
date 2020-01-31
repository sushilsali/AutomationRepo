package function;

public class FunctionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sub1= subject(50,60,70,80,90);
		float sub2=(sub1/500)*100;
		
		System.out.println(sub1);
		System.out.println(sub2);

	}
	
	public static float subject(float p1, float p2, float p3, float p4, float p5)
	{
		return(p1+p2+p3+p4+p5);
	}

}
