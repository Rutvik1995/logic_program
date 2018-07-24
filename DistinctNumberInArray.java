import java.util.Scanner;

class distinct
{
	int size;
	int arr[];
	Scanner s1 = new Scanner(System.in);
	
	distinct(int size2)
	{
		size=size2;
		arr=new int[size];
		
	}
	
	
	public void input()
	{
		
		
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element in array");
			int no=s1.nextInt();
			
			System.out.println("Number is "+no);
			
			if(arr==null)
			{
				arr[i]=no;
				System.out.println("In this loop");
			}
			else
			{
				System.out.println("Number is "+no);
				
				for(int k=0;k<=i;k++)
				{
					System.out.println("array of k is "+arr[k]);
					if(no==arr[k])
					{
						System.out.println("This number is already in array");
					}
					else
					{
						arr[i]=no;
					}
					
					
				}
			}
			
			
		}
	}
	
	
	
	public void input2()
	{
		int count=0;
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element in array: ");
			int no=s1.nextInt();
			
			
			if(count==0)
			{
				arr[i]=no;
				count++;
			}
			else
			{
				for(int k=0;k<i;k++)
				{
					//System.out.println("array of k is "+arr[k]);
					if(no==arr[k])
					{
						System.out.println("This number is already in array, Please Enter differnt number !!!!");
					}
					else
					{
						arr[i]=no;
					}
					
					
				}
			}
			
			
			
		}	
		
	}
	
	
	
}
	


public class DistinctNumberInArray 
{
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size=s.nextInt();
		
		
		distinct d= new distinct(size);
		d.input2();
		
		
	}
	
}
