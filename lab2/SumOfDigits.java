package lab2;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),sum=0;
		while(a>0) {
			sum+=a%10;
			a/=10;
		}
		System.out.println(sum);
	}
}
