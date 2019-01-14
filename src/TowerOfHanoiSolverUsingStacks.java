
import java.util.*;

public class TowerOfHanoiSolverUsingStacks {

    public static int N;

    public static Stack[] tower = new Stack[4];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        tower[1] = new Stack();
        tower[2] = new Stack();
        tower[3] = new Stack();

        System.out.println("=== TOWER OF HANOI SOLVER ===");
        System.out.println(" ");
        System.out.print("Masukkan jumlah kepingan : ");
        int num = scan.nextInt();
        N = num;
        toh(num);
    }

    public static void toh(int y) {
        for (int d = y; d > 0; d--) {
            tower[1].push(d);
        }
        display();
        move(y, 1, 2, 3);
    }

    public static void move(int z, int a, int b, int c) {
        if (z > 0) {
            move(z - 1, a, c, b);
            int d = Integer.parseInt(tower[a].pop().toString());
            tower[c].push(d);

            display();
            move(z - 1, b, a, c);

        }
    }

    public static void display() {
        for (int i = N - 1; i >= 0; i--) {
            String d1 = " ", d2 = " ", d3 = " ";
            try {
                d1 = String.valueOf(tower[1].get(i));
            } catch (Exception e) {
            }
            try {
                d2 = String.valueOf(tower[2].get(i));
            } catch (Exception e) {
            }
            try {
                d3 = String.valueOf(tower[3].get(i));
            } catch (Exception e) {
            }
            System.out.println("  |  " + d1 + "  |  " + d2 + "  |  " + d3 + "  |  ");

        }
        System.out.println("  -------------------");
        System.out.println("  |  A  |  B  |  C  |");
        System.out.println("\n");
    }

}
