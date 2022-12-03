import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner box = new Scanner(System.in);
        int dollars = box.nextInt();
        int euro = 0;
        while (dollars > euro) {
            System.out.println("Я начинаю разбираться с циклами");
            euro++;
        }
    }
}