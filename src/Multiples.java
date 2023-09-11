public class Multiples {

    public static void main(String[] args) {
        System.out.println(multiples(3, 1000));
    }

    private static int multiples(int divisor, int max) {
        int count = 0;
        for (int i = 0; i < max; i++) {
            if (i % divisor == 0) {
                count++;
            }
        }
        return count;
    }
}
