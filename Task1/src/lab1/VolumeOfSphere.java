package lab1;
import java.util.*;
import java.util.Scanner;

public class VolumeOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        float p=3.14f;
        float c=(4/3f)*r*r*p;
        System.out.println("Volume is "+c);
	}

}
