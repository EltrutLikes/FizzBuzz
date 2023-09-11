public class Reduce {

    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            count++;
        }
        return count;
    }
}
