import java.util.Scanner;

public class ZadanieJava1Lekcja1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wzrost:");
        int age = scanner.nextInt();
        if (age <= 0) return;
        if (age > 125) return;
        if (age > 1 && age <= 14) {
            System.out.println("jesteś dzieckiem");
        } else if (age > 14 && age <= 18) {
            System.out.println("jesteś nastolatkiem");
        } else if (age > 18 && age <= 40) {
            System.out.println("jesteś młody");
        } else if (age > 40 && age <= 65) {
            System.out.println("jesteś w średnim wieku");
        } else {
            System.out.println("jetseś stary");
        }
    }
}