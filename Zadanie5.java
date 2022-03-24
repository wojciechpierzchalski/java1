import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer strb = new StringBuffer(scanner.nextLine());
        char[] chars = strb.toString().toCharArray();
        int sumaOtwartych = 0;
        int sumaZamknietych = 0;
        for (char c : chars
             ) {
            if(Character.toString(c).equals("(")) {
                sumaOtwartych++;
            }
            else if(Character.toString(c).equals(")")) {
                sumaZamknietych++;
            }
        }
        if(sumaOtwartych==sumaZamknietych){
            System.out.println("OK");
        }
        else {
            System.out.println("Błędne sparowanie nawiasów");
        }
    }
}
