import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Dar turno\n2. Mostrar turno actual\n3. Pasar turno\n4. Seguir\n0. Salir");
            option = scanner.nextInt();

        } while (option != 0);


    }
}