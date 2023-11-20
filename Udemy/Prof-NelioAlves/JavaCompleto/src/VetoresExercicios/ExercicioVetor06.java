package VetoresExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ClassRooms[] vect = new ClassRooms[10];
        System.out.print("How many rooms will de rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            ClassRooms p = new ClassRooms(name, email);

            vect[roomNumber] = p;

        }

        System.out.println("Busy rooms");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }


        sc.close();

    }
}
