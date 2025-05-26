//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 45, 66, 78, 91};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
        for (int i=0;i<numbers.length;i++){
            boolean isPrime = true;

            if (numbers[i] <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(numbers[i]); j++) {
                    if (numbers[j] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(numbers[i] + " is a prime number.");
            } else {
                System.out.println(numbers[i] + " is not a prime number.");
            }
        }
    }
}
