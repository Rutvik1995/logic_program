import java.util.Scanner;

class process
{
	
	int size;
	int arr[];
	int limit;
	int index;
	Scanner s=new Scanner(System.in);
	process(int size2,int limit2)
	{
		 size=size2;
		arr=new int[size];
		limit=limit2;
		 index=(size2-1);
	}
	
	
	public void getElement()
	{
		for(int i=0;i<size;i++)
		{
			
			System.out.println(" Enter the element in the array: ");
			int no=s.nextInt();
			arr[i]=no;
		}
		
		
	}
	
	
	
	public void select()
	{
		int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			
			}
		}
		
		
		System.out.println("Limit: "+limit);
		
		System.out.println("Index: "+index);
		while(limit>=1)
		{
			
			
			
			System.out.println("Maxi number:"+arr[index]);
			
			index--;
			limit--;
			
		}
		
		
		
		
	
	}	
		
		public void display()
		{
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
		}
	
	
}



public class FindNnumberOfLargestNumber 
{
	public static void main(String args[])
	{
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int size=s1.nextInt();
		
		System.out.println("How manny maximun number you want from array: ");
		int limit=s1.nextInt();
		
		process p1= new process(size,limit);
		p1.getElement();
		p1.select();
		p1.display();
		
		
		
	}

}
