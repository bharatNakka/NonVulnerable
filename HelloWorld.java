import java.util.Scanner;

public class SecureCodeExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String prompt = getPrompt();
        System.out.print(prompt);
        
        String name = scanner.nextLine();

       
        scanner.close();
    }

   
}
