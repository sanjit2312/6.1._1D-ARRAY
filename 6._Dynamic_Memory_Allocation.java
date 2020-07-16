package array;

import java.util.Scanner;

public class Dynamic_Memory_Allocation
{

	public static void main(String[] args) 
	{
		
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int n=obj.nextInt();
        int num[]=new int[n];
       
        System.out.println("Enter values in Array: "); 
        for(int i=0;i<num.length;i++)
        {
        	num[i]=obj.nextInt();
        }
        System.out.println("you Enter values in Array: ");
        for(int i=0;i<num.length;i++)
        {
        	System.out.println(num[i]);
        }
        obj.close();

	}

}
