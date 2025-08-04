package lab2;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=10;
		if(a>b) {
			int k=a;
			a=b;
			b=k;
		}
		while(b!=0) {
			c=a%b;
			a=b;
			b=c;
		}
		System.out.println("GCD is "+a);
	}

}
