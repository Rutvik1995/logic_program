import java.util.Scanner;

class reversenum
{
	
	int no;
	int sum=0;
	int rem;
	String name;
	reversenum(int num,String name1)
	{
		no=num;
		name=name1;
	}
	
	
	
	public void exe()
	{
		
		System.out.println(no);
		
		while(no!=0)
		{
		rem=no%10;
		sum=(sum*10)+rem;
		no=no/10;
		}
		System.out.println("Reverse Number: "+sum);
		StringBuilder sb = new StringBuilder();
		
		for(int i = name.length() - 1; i >= 0; i--)
        {
            sb.append(name.charAt(i));
        }
        
		
		System.out.println("Reverse Name: "+sb.toString());
	}
	

	
	
}



public class ReverseNumReverseName {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int no =s.nextInt();
		
		System.out.println("Enter Name: ");
		s.nextLine();
		String name =s.nextLine();
		
		
		reversenum r1=new reversenum(no,name);
		
		r1.exe();
		
		
	}

}
