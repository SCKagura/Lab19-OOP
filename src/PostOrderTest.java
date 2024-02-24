import java.util.Iterator;
import java.util.Random;

public class PostOrderTest {
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
        System.out.println("expected postorder:");
        System.out.println("0 1 4 3 2 6 8 7 5 10 12 11 14 15 13 18 17 16 9 20 22 21 24 26 25 23 28 29 31 30 27 19 33 35 " +
                "34 37 39 38 36 41 43 42 46 45 44 40 49 48 51 53 54 52 50 56 58 57 60 62 61 59 55 47 32");
        // แสดง Postorder
        System.out.println("Postorder Got:");
        for (Iterator<Integer> itr = t.getPostorderIterator(); itr.hasNext(); )
            System.out.print(itr.next() + " ");
        System.out.println();
    }
}
