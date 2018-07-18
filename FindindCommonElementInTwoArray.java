
import java.util.Scanner;



class common
{
	int s1,s2;
	int count=0;
	Scanner s = new Scanner(System.in);
	
	int ar1[];
	int ar2[];
	int ar3[];
	
	common(int size1,int size2)
	{
		s1=size1;
		s2=size2;
		
		ar1=new int[s1];
		ar2=new int[s2];
		ar3=new int[s2];
	}
	
	
	
	public void input()
	{
		
		for(int i=0;i<s1;i++)
		{
			System.out.println("Enter the elements in array");
			
			 ar1[i]=s.nextInt();		
		}
		
		for(int i=0;i<s1;i++)
		{
			System.out.println("Enter the elements in array");
			
			 ar2[i]=s.nextInt();
		}
		
	}
	
	
	public void match()
	{
		for (int i=0;i<s1;i++)
		{
			for(int j=0;j<s2;j++)
			{
				
				if(ar1[i]==ar2[j])
				{				
					ar3[count]=ar1[i];	
					count++;
				}
				
			}
		}
	}
	
	
	public void display()
	{
		
		for(int i=0;i<count;i++)
		{
			System.out.println("i="+i+""+ar3[count]);	
		}	
	}
}




public class FindindCommonElementInTwoArray 
{
	public static void maon(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter the size of 1 array");
		int size1=s.nextInt();
		
		System.out.println("Enter the size of 2 array");
		int size2=s.nextInt();
		
		
		
		common c = new common(size1,size2);
		
		c.input();
		c.match();
		c.display();
		
		
	}

}

