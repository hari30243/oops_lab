package lab3;

public class UserNameFormatter {
	public static void main(String[] args) {
        String name = "  rAjEsh ";
        name = name.trim();             // removes leading/trailing spaces
        name = name.toLowerCase();      // converts to lowercase
        name = name.replace("a", "@");  // replaces 'a' with '@'
        System.out.println("Formatted Name: " + name);
    }
}