import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer strb = new StringBuffer(scanner.nextLine());
        if(strb.toString().equals(strb.reverse().toString())) {
            System.out.println("Podany ciąg jest palindromem");
        }
        else {
            System.out.println("Ciąg nie jest palindromem");
        }

    }
}
