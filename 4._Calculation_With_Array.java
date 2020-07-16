package array;

public class Calculation_With_Array 
{

	public static void main(String[] args) 
	{
		
		int num[]=new int[5];
		num[0]=11;
		num[1]=22;
		num[2]=11+num[1];
		num[3]=num[0]+20;
		num[4]=num[1]+num[0];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("num["+i+"] = "+num[i]);
		}



	}

}
