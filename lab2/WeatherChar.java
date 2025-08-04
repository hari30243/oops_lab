package lab2;
import java.util.*;
public class WeatherChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		char x= s.next().charAt(0);
		if((x>='a'&&x<='z')||(x>='A'&&x<='Z'))
			System.out.println("yess");
		else
			System.out.println("Noo");
	}

}
