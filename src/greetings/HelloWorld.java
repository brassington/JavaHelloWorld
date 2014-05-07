package greetings;

public class HelloWorld {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        int number = 3;
        number += 2;
        String name = "Joe";
        System.out.println(number);
        System.out.println(name);

        String firstName = "John";
        String fullName = firstName + " Sonmez";
        System.out.println(fullName.indexOf('z'));

        int[] numbers = new int[10];
        numbers[0] = 5;
        numbers[1] = 8;

        System.out.print(numbers[2]);
    }
}
