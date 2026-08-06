import java.util.Scanner;
public class details {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your Email: ");
            String email = sc.nextLine();

            System.out.println("Student Details:" + "\n" + "-------------");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        }
    }
    
}