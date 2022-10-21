package Classes.stringsAndBasics;

import java.text.MessageFormat;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        // Integer aString = Integer.valueOf(1); // attn not a primitive type
        // // char someChar = '';

        // Integer bString = 2;

        // aString = bString;
        // System.out.println(aString);

        // bString = 3;
        // System.out.println(bString);
        // // String Pool = Pool of strings that java checks 1st before allocating a
        // space

        // System.out.println(aString);

        // halt the behavior of the string pool with a New String
        String someString = new String("Jane");
        String someOtherThing = new String("Doe");

        // int i = 5;
        // System.out.println(i + 5);
        // System.out.println("i = " + i + 5);
        // System.out.println("i = " + (i + 5));

        // you can create a mutable string with the StringBuilder Class
        System.out.println(new StringBuilder(someString).append(" ").append(someOtherThing));
        System.out.println(someString);

        System.out.println(new StringBuffer(someString).append(" ").append(someOtherThing)); // multithreading
        System.out.println(someString);

        StringBuilder test = new StringBuilder(someString).append("allo");

        test = test.append("allo");
        System.out.println(test);

        System.out.println(String.format("String.format = %s %s", someString, someOtherThing));
        System.out.println(MessageFormat.format("MessageFormat.format = {1} {0}", someString, someOtherThing));

        var cString = "Java";
        var someInt = 55L;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Hi " + name);
        // System.out.println("How old are you ?");
        // int age = sc.nextInt();
        // System.out.println("Wow " + name + " you are so old at " + age);

        // if statements are bool intake only
        // ex : if(keepGoing) would be wrong

        StringBuilder test1 = new StringBuilder("test1");
        StringBuilder test2 = new StringBuilder("test2");

        test1 = test2;
        test2 = test2.append("YAHHOOO");
        System.out.println(test1);

        // equality op compares the ref
        // .equals compares the value

        int aa = 10;

        Integer bb = 10;

        System.out.println(bb.equals(aa)); // autoboxing aa?

        System.out.println(aa == bb); // unboxing bb?
        // System.out.printl());

        System.out.println(System.identityHashCode(aa)); // cause autoboxing

        System.out.println(System.identityHashCode(bb)); // hence identical hascodes.

        var allo = new newClass(1, 2);

        System.out.println(allo.a);

        // boxing and unboxing

        int azzz = 111111111;

        switch (azzz) {

            case (222):
                System.out.println("Yallah");

            default:
                System.out.println("Yallah2");
                ;
        }

    }

}
