import java.util.Scanner;

public class Zadanie1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
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
        }
    }
