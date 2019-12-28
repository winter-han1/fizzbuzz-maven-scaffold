public class FizzBuzz {

    public static void main(String[] args) {

    }

    public static String of(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
