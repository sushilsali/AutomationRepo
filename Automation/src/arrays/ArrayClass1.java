package arrays;

public class ArrayClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= new String[10];
		
		str[0]="Hazel";
		str[1]="Shashank";
		str[2]="Shubhangi";
		str[3]="Tijil";
		str[4]="Abhishek";
		str[5]="Gaurav";
		str[6]="Sushil";
		str[7]="Sumit";
		str[8]="Komal";
		str[9]="Ankita";
		
	/*	for(int i=0; i<10;i++)
		{
			System.out.println(str[i]);
		}
		*/
		
		for(String s:str)
		{
			System.out.println();
			System.out.println(s);
		}
			
		

	}

}
