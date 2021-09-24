public class PrimeNumbers {
    public static void main(String[] args) {
        int number = 9;
        System.out.println("A prime number is only divisible by 1 and itself.");
        System.out.println("Is " + number + " divisible by 1 up to " + number + "?");
        System.out.println("Divisible by 1? " + (number % 1 <= 0));
        System.out.println("Divisible by 2? " + (number % 2 <= 0));
        System.out.println("Divisible by 3? " + (number % 3 <= 0));
        System.out.println("Divisible by 4? " + (number % 4 <= 0));
        System.out.println("Divisible by 5? " + (number % 5 <= 0));
        System.out.println("Divisible by 6? " + (number % 6 <= 0));
        System.out.println("Divisible by 7? " + (number % 7 <= 0));

        // 1. 5 is a prime number.

        // 2. Finding the modulo of the number because if it is 0 it will be prime, if
        // it isn't is not prime.

        // 3. 6 is not a prime number.

        // 4. 7 is a prime number

        // 5. Yes it would still work because it is checking if the result is less than
        // 0 which in this case of a modulo is impossible so it functions the same.

        // 6. No it would not work because it is checking if the result is greater than
        // 0 which means that it returns true no matter what.

        // 7. 9 is a odd non-prime number because it is divisible by itself and 3.

        // 8. 2 is a prime even number because it is only divisible by itself and 1.

    }
}
