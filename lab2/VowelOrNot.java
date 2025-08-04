package lab2;
import java.util.*;
public class VowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char x=s.next().charAt(0);
		if((x>='a'&&x<='z')||(x>='A'&&x<='Z')) {
			if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U') {
				System.out.println("Vowel");
			}
			else
				System.out.println("Consonant");
		}
		else
			System.out.println("Not an alphabet");
	}

}
