import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int cucumber, tomato, onion, carrot, pepper;
        double total;
        System.out.println("Enter the number of cucumbers: ");
        cucumber = input.nextInt();
        System.out.println("Enter the number of tomatoes: ");
        tomato = input.nextInt();
        System.out.println("Enter the number of onions: ");
        onion = input.nextInt();
        System.out.println("Enter the number of carrots: ");
        carrot = input.nextInt();
        System.out.println("Enter the number of peppers: ");
        pepper = input.nextInt();
        total = (cucumber * 2.5) + (tomato * 3.5) + (onion * 1.5) + (carrot * 4) + (pepper * 5);
        System.out.println("Total: " + total + " TL");

    }
}