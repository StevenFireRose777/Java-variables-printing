public class Main {
    public static void main(String[] args) {
        /*The purpose of this program to show
        simple use of variables with data types such as
        String, int, float, double
        */

        // String type
        String greeting = "Hello, ";
        String first_name = "John ";
        String last_name = "Pork\n"; // '\n' == newline (enter-key)

        System.out.print(greeting);
        System.out.print(first_name + last_name);
        
        //int type
        int num1 = 70;
        int num2 = 7;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1 + num2);
        System.out.println(num1 % num2); // Modulo
        System.out.println(num1 / num2);
        System.out.println(num2 - num1); // Negative val
        System.out.println(num2 * num1);

        //float && Double type
        double double_num = 92.123231;
        double double_num2 = 1.12342;
        float floating_num = 21.21f;
        float floating_num2 = 21.22f;

        System.out.print("This is a double: ");
        System.out.println(double_num);
        System.out.println(double_num2);
        System.out.print("This is a float: ");
        System.out.println(floating_num);
        System.out.println(floating_num2);
        System.out.print("92.123231 + 1.12342 = ");
        System.out.println(double_num + double_num2);
        System.out.print("21.21 + 21.22 = ");
        System.out.println(floating_num + floating_num2);

        // char
        
        char letter1 = 'J';
        char letter2 = 'O';
        char letter3 = 'E';

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);

        // boolean
        boolean myBool = true;
        System.out.println(myBool);
        myBool = false;
        System.out.println(myBool);

        
    }   
}