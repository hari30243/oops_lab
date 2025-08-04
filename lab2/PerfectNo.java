package lab2;
import java.util.*;
public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				sum+=i;
		}
		if(sum==n)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
