public class Main {
    public static void main(String[] args) {
        System.out.println("Good Morning, Universe!");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        int sum = 0;
        for (int i = 30; i < 41; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        int factorial = 1;
        for (int i = 1; i < 6; i++) {
            factorial = factorial*i;
            System.out.println(factorial);
        }
    }
}
