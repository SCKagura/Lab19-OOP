import java.util.Iterator;
import java.util.Random;

public class PreOrderTest {
    public static void main(String[] args) {
        int N = 63;
        int seed = 2022;
        int[] a = new int[N];
        for (int i = 0; i < N; i++)
            a[i] = i;
        Random rand = new Random(seed);
        // create a random permutation
        for (int i = 0; i < N; i++) {
            int j = rand.nextInt(N - i) + i;
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        Tree<Integer> t = new AVLTree<>();
        for (int i = 0; i < N; i++)
            t.add(a[i]);
        System.out.println("expected preorder:");
        System.out.println("32 19 9 5 2 1 0 3 4 7 6 8 16 13 11 10 12 15 14 17 18 27 23 21 20 22 25 24 26 30 29 28 31 47 40 36 34 33 35 " +
                "38 37 39 44 42 41 43 45 46 55 50 48 49 52 51 54 53 59 57 56 58 61 60 62");
        // แสดง Preorder
        System.out.println("Preorder Got:");
        for (Iterator<Integer> itr = t.getPreorderIterator(); itr.hasNext(); )
            System.out.print(itr.next() + " ");
        System.out.println();
    }
}
