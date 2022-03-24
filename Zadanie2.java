import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = new String(scanner.nextLine());
        if(str.equals("")) {
            System.out.println("String jest pusty");
        }
        else
        {
            String odwrocony = new String("");
            for (int i = str.length()-1; i>=0; i--) {
                odwrocony = odwrocony + str.charAt(i);

            }
            System.out.println(odwrocony);
        }
    }
}
