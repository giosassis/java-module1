public class ConditionalTwo {
    public static void main(String[] args) {
        System.out.println("Testing conditionals");

        int age = 35;
        boolean helper = true;

        if (age >= 18) {
            System.out.println("You have more than 18 years! 🍻 ");
            System.out.println("Welcome to our party! 📣");

        } else if (helper && age < 18) {
            System.out.println("Ok! You are not 18 however you have a helper, so... Welcome to our party! 📣");
        } else {
            System.out.println("Sorry, you don't have neither enough years nor a helper.😞😞");
        }
    }
}
