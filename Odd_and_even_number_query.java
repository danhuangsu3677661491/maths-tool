import java.util.Scanner;
public  class Odd_and_even_number_query {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of times to query:");
        int inputInt = scanner.nextInt();
        System.out.println("Please enter the number of milliseconds to wait:");
        int inputInt2 = scanner.nextInt();
        Thread.sleep(1000);
        int a = 0;
        while (a <= inputInt){
            if (a % 2 == 0){
                System.out.println("Odd number:" + a);
            }
            else {
                System.out.println("Even number:" + a);
            }
            a++;
            Thread.sleep(inputInt2); // 等待c毫秒
        }
    }
}