package array;

import java.util.Scanner;

public class Taking_Input_in_Array
{

	public static void main(String[] args)
	{
		
        Scanner obj=new Scanner(System.in);
        int num[]=new int[5];
        System.out.println("Enter five values: ");
        for(int i=0;i<5;i++)
        {
              num[i]=obj.nextInt();
        }
        System.out.println("Your five values: ");
        for(int i=0;i<5;i++)
        {
            System.out.println(num[i]);
        }
        
        obj.close();	

	}

}
