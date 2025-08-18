package daytwo;
import java.util.Scanner;
public class BreakDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 5; i < 10; i++) 
		{
			if (i == num)
				break;
			System.out.println(i);
		}
		sc.close();
	}
}
