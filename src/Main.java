import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //函数主入口
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.print(n+"=");
		if (IsPrime(n))
		{System.out.println(n);	}
		else {
			while (n>1)
			{
				for (int i=2;i<=n;i++)
				{
					if (n%i==0)
					{
						System.out.print(i);
						n = n/i;
						if (n>1) {System.out.print("x");}
						break;
					}

				}
			}
		}
		}
	
	public static boolean IsPrime (int num) { //寻找质数函数
		if (num==2) return true;
		if (num>2 && num%2!=0) 
		{
			for (int i=3; i<num; i+=2) 
			{
				if (num%i == 0) return false;
			}
			return true;
		}
		return false;
	}
		
}