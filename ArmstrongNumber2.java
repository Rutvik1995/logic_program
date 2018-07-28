import java.util.Scanner;

public class ArmstrongNumber2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int rem;
		int sum=0;
		int count=0;
		
		
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		
		
		int num2=num;
		
		while(num!=0)
		{
			num=num/10;
			count++;
			System.out.println("Hello");
		}
		
		System.out.println("Count: "+count);
		
		
		while(num2!=0)
		{
			rem=num2%10;
			sum=sum+power(rem,count);
			num2=num2/10;		
		}
		
		
		System.out.println("The nymber is "+sum);

	}

	private static int power(int rem, int count) 
	{
		// TODO Auto-generated method stub
		
		int p=1;
		
		for(int i=1;i<=count;i++)
		{
			p=p*rem;
		}
		
		return p;
	}

}
