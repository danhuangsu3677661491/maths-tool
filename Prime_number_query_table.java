import java.util.Scanner;

public class Prime_number_query_table {
    public Prime_number_query_table() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of prime numbers to be queried(upper limit 1000):");

        int inputInt;
        for(inputInt = scanner.nextInt(); inputInt > 1000; inputInt = scanner.nextInt()) {
            System.out.println("Please enter the number of prime numbers to be queried(upper limit 1000):");
        }

        int[] primeNumberTable = new int[inputInt];
        primeNumberTable[0] = 1;
        primeNumberTable[1] = 2;
        int cache = 3;
        int counter = 2;
        boolean flag = false;

        int i;
        while(counter < primeNumberTable.length) {
            for(i = counter - 1; i > 0; --i) {
                if (cache % primeNumberTable[i] == 0) {
                    ++cache;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                flag = false;
            } else {
                primeNumberTable[counter] = cache++;
                ++counter;
            }
        }

        for(i = 0; i < primeNumberTable.length; ++i) {
            System.out.println(primeNumberTable[i]);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}