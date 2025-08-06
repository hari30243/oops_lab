package lab1;
import java.util.*;

public class Addition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c;
        c = a + b;
        System.out.println(c);
        s.close();
    }
}
