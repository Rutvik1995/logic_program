import java.util.Scanner;


class armstrong
{
	int no;
	int rem;
	int rev=0;
	int sum=0;
	int count=0;
	int num=0;
	
	
	int rem2;
	int rev2;
	int num3;
	
	armstrong(int no2)
	{
		no=no2;
		num=no2;
		num3=no2;
	}
	
	
	
	public void system()
	{
		
		while(no!=0)
		{
			count++;
			
		
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
			//System.out.println("Hello2");
		}
		
		
		while(num!=0)
		{
			
			rem2=num%10;
			int p=1;
			for(int i=1;i<=count;i++)
			{
				p=p*rem2;
			}
			
			//System.out.println(p);
			sum=sum+p;
			num=num/10;
		}
		
		
		if(sum==num3)
		{
			System.out.println(num3+" is an armstrong number");
		}
		else
		{
			System.out.println(num3+" is not an armstrong number");
		}
		
	}
	
}



public class ArmstrongNumber
{
	
	public static void main(String args[])
	{
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no=s.nextInt();
		
		armstrong a= new armstrong(no);
		a.system();
		
		
		
	}

}
