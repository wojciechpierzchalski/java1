import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer strb = new StringBuffer(scanner.nextLine());
        char[] chars = strb.toString().toCharArray();
        int suma = 0;
        for (char c : chars
             ) {
            if(Character.isDigit(c)) {
                suma += Integer.parseInt(Character.toString(c));
            }
        }
        System.out.println(suma);
    }
}
