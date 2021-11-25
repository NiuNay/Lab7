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

        for (int n = 1; n < 6; n++) {
            double intResult = (double) Math.pow(1.4, n);
            System.out.println(intResult);
        }

        System.out.println("Good Bye, Universe!");

    }
}
