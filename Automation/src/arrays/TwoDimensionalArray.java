package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String[][] str= new String[4][2];
		
		str[0][0]="Username";
		str[0][1]="Password";
		
		str[1][0]="User1";
		str[1][1]="Password1";
		
		str[2][0]="User2";
		str[2][1]="Password2";
		
		str[3][0]="User3";
		str[3][1]="Password3";
				
		for(int i=0; i<str.length; i++)
		{
			for(int c=0; c<str[i].length; c++)
			{			
				System.out.print(str[i][c]);
				System.out.print("     ");
				
			}	
			System.out.println();
		}
		
	}

}
