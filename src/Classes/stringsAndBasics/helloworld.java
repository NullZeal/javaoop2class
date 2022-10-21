package Classes.stringsAndBasics;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 10;
        a += 10;
        System.out.println(a);

        String someString = ""; // attn not a primitive type
        // char someChar = '';

        short minShort = -32768;
        short maxSHort = 32767;

        int minInt = -2147483648;
        int maxInt = -2147483647;

        double aDouble = 0;

        char uniChar = '\u0024'; // unicode range is found online
        System.out.print("Unichar: " + uniChar);

    }
}
