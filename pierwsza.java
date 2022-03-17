import java.util.Scanner;
public class pierwsza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //zadanie 1
        /*
        String str = new String(scanner.nextLine());
        if(str.equals("")) {
            System.out.println("String jest pusty");
        }
        else {
            str = str.toLowerCase();
            str = str.trim();
            char ostatnia = str.charAt(str.length() - 1);
            int suma = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ostatnia) {
                    suma++;
                }
            }
            System.out.println(suma);
        }
         */
        //zadanie 2
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
