public class Conditional {

    private static boolean isNaN(int number) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Conditional Math 🤓🤓 ");

        int number = 16;

        if (!isNaN(number)) {
            System.out.println("Your number is square root of " + (number * number) + " 🧮");
        }
    }

}
