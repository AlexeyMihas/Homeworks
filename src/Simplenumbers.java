public class Simplenumbers {
    public static void main(String[] args) {
long start = System.currentTimeMillis();
        for (int i = 2; i < 10000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("i = " + i);
            }
        }
System.out.println(System.currentTimeMillis() - start);
    }
}