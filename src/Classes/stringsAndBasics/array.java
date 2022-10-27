package Classes.stringsAndBasics;

public class array {

    public static String reverseString(String originalString) {
        var reversedString = "";
        for (int i = 0; i < originalString.length(); i++) {
            reversedString = originalString.charAt(i) + reversedString;
        }
        return reversedString;

    }

    public static String reverseString2(String originalString) {
        var reversedString = "";
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }
        return reversedString;

    }

    public static boolean isPalindrome(String originalString) {

        String reversedString = reverseString(originalString);

        for (int i = 0; i < originalString.length() - 1; i++) {
            if (reversedString.charAt(i) != originalString.charAt(i))
                return false;
        }
        return true;
    }

    public static boolean isPalindrome2(String originalString) {

        if (originalString.length() == 1 || originalString.length() == 0) {
            return true;
        }
        int start = 0;
        int end = originalString.length() - 1;
        for (int i = 0; i < originalString.length() / 2; i++) {
            if (originalString.charAt(start) != originalString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("-------------------A");
        System.out.println("---------A type1");
        System.out.println(reverseString("hello"));
        System.out.println("---------A type2");
        System.out.println(reverseString2("hello"));

        System.out.println("---------B");
        System.out.println("-------------------B type1");
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("zooz"));
        System.out.println(("---------B type2"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("zooz"));

        // var cArray = new array();

        // int[] dArray = { 1, 2, 3, 4 };

        // // for (int elem : dArray) {
        // // System.out.println(elem);
        // // }

        // var cars = new ArrayList<String>();

        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("Mazda");
        // // System.out.println(cars);

        // int[] eArray = { 1, 2, 3, 4 };

        // System.out.println("Binary search: " + Arrays.binarySearch(eArray, 2)); //
        // binary search (int[], key)
        // System.out.println("Binary search with range: " + Arrays.binarySearch(eArray,
        // 0, 1, 4)); // binary search
        // // (int[],
        // boolean[] boolArray = { true, false, true, false };
        // boolean[] boolArray2 = { true, false, true, false };

        // System.out.println("Compare: It returns 0 since the array is equal to the
        // other array: "
        // + Arrays.compare(boolArray, boolArray2)); // compare (int[], int[])

        // int[] copiedArray1 = Arrays.copyOf(eArray, 7);
        // System.out.println("--CopyOf---");
        // for (int elem : copiedArray1)
        // System.out.println(elem);

        // System.out.println("--CopyOfRange---");

        // int[] copiedArray2 = Arrays.copyOfRange(eArray, 0, 2);

        // for (int elem : copiedArray2)
        // System.out.println(elem);

        // int[] fArray = { 1, 2, 3, 4 };

        // System.out.println("Equals: " + Arrays.equals(eArray, fArray)); // equals
        // System.out.println("Equals with range: " + Arrays.equals(eArray, 0, 1,
        // fArray, 0, 1)); // equals

        // System.out.println("ToString: " + Arrays.toString(eArray));

        // Arrays.fill(eArray, 1);

        // System.out.println("-------Fill------");

        // for (int elem : eArray)
        // System.out.println(elem);

        // System.out.println("-------Fill with range------");

        // Arrays.fill(eArray, 0, 2, 7);

        // for (int elem : eArray)
        // System.out.println(elem);

        // System.out.println("-------Sort------");

        // int[] sortArray = { 2, 6, 3, 4, 1 };
        // Arrays.sort(sortArray);
        // for (int elem : sortArray)
        // System.out.println(elem);

        // System.out.println("-------Sort with range------");

        // int[] sortArray2 = { 2, 6, 3, 4, 1 };
        // Arrays.sort(sortArray, 0, 2);

        // for (int elem : sortArray2)
        // System.out.println(elem);

        // var zArray = new int[5];
        // // for (int i = 0; i < zArray.length; i++)

        // // System.out.println(zArray[0]);

        // for (int i : zArray) {
        // System.out.println(zArray[i]);
        // }

        // int[] yArray;
        // System.out.println(zArray[0]);

        // var myArrayList1 = new ArrayList<>();
        // var myArrayList2 = new ArrayList<>();

        // myArrayList1.add("allo");
        // myArrayList1.add("allo2");

        // myArrayList1.forEach((x) -> {
        // System.out.println("ez" + x);
        // });

        // myArrayList2.add("allo");
        // myArrayList2.add("allo2");

        // System.out.println(myArrayList1);

        // myArrayList1.removeAll(myArrayList2);

        // System.out.println(myArrayList1);
        // System.out.println(myArrayList2);

        // var st1 = new StringTokenizer("Hello teacher michelle");
        // System.out.println("---------------- Constructor 1 ----------------");
        // while (st1.hasMoreTokens()) {
        // System.out.println(st1.nextToken());
        // }

        // System.out.println("---------------- Constructor 2 ----------------");
        // var st2 = new StringTokenizer("Hello@teacher@michelle", "@");

        // while (st2.hasMoreTokens()) {
        // System.out.println(st2.nextToken());
        // }

        // System.out.println("---------------- Constructor 3 ----------------");
        // var st3 = new StringTokenizer("Hello@teacher, michelle", "@,", true);

        // while (st3.hasMoreTokens()) {
        // System.out.println(st3.nextToken());
        // }

    }

}
