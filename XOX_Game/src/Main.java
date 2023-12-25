import java.util.Scanner;
import java.util.Scanner;

public class Main {

    static void bastir(String[][] a) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == null) {
                    a[i][j] = " ";
                }
            }
        }
        System.out.println("| " + a[0][0] + " | " + "| " + a[0][1] + " | " + "| " + a[0][2] + " |");
        System.out.println("| " + a[1][0] + " | " + "| " + a[1][1] + " | " + "| " + a[1][2] + " |");
        System.out.println("| " + a[2][0] + " | " + "| " + a[2][1] + " | " + "| " + a[2][2] + " |");
    }

    static boolean kontrol(String[][] x) {
        if (x[0][0] == "X" && x[0][1] == "X" && x[0][2] == "X") {
            System.out.println("X Won.");
            return true;
        }

        if (x[1][0] == "X" && x[1][1] == "X" && x[1][2] == "X") {
            System.out.println("X Won.");
            return true;
        }

        if (x[2][0] == "X" && x[2][1] == "X" && x[2][2] == "X") {
            System.out.println("X Won.");
            return true;
        }

        if (x[0][0] == "X" && x[1][0] == "X" && x[2][0] == "X") {
            System.out.println("X Won.");
            return true;
        }

        if (x[0][1] == "X" && x[1][1] == "X" && x[2][1] == "X") {
            System.out.println("X Won.");
            return true;
        }

        if (x[0][2] == "X" && x[1][2] == "X" && x[2][2] == "X") {
            System.out.println("X Won.");
            return true;
        }

        // ---------------------------------------------------------
        // ---------------------------------------------------------
        if (x[0][0] == "O" && x[0][1] == "O" && x[0][2] == "O") {
            System.out.println("O Won.");
            return true;
        }

        if (x[1][0] == "O" && x[1][1] == "O" && x[1][2] == "O") {
            System.out.println("O Won.");
            return true;
        }

        if (x[2][0] == "O" && x[2][1] == "O" && x[2][2] == "O") {
            System.out.println("O Won.");
            return true;
        }

        if (x[0][0] == "O" && x[1][0] == "O" && x[2][0] == "O") {
            System.out.println("O Won.");
            return true;
        }

        if (x[0][1] == "O" && x[1][1] == "O" && x[2][1] == "O") {
            System.out.println("O Won.");
            return true;
        }

        if (x[0][2] == "O" && x[1][2] == "O" && x[2][2] == "O") {
            System.out.println("O Won.");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[][] a = new String[3][3];
        bastir(a);
        while (true) {
            System.out.print("X location: ");
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            if (n1 < 0 || n1 > 2 || n2 < 0 || n2 > 2) {
                System.out.println("Invalid value. Try again.");
                System.out.println("");
                continue;
            }
            if (a[n1][n2] == " ") {
                a[n1][n2] = "X";
            } else {
                System.out.println("This box is full. Try again.");
                System.out.println("");
                continue;
            }
            System.out.println("");
            bastir(a);
            System.out.println("");
            if (kontrol(a)) {
                return;
            }
            int u = 1;
            while (u == 1) {
                System.out.print("O location: ");
                int m1 = input.nextInt();
                int m2 = input.nextInt();
                if (m1 < 0 || m1 > 2 || m2 < 0 || m2 > 2) {
                    System.out.println("Invalid value. Try again.");
                    System.out.println("");
                    continue;
                }
                if (a[m1][m2] == " ") {
                    a[m1][m2] = "O";
                    u = 0;
                } else {
                    System.out.println("This box is full. Try again.");
                    System.out.println("");
                }
            }

            System.out.println("");
            bastir(a);
            System.out.println("");
            if (kontrol(a)) {
                return;
            }
        }
    }

}
