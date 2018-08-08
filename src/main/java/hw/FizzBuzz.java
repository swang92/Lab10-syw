package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FizzBuzz {

    public static List<String> fizzBuzzList(final int n) {

        int arrayIndex = 0;
        List<String> myList;

        if (n <= 0) {
            myList = new ArrayList<>(Arrays.asList("This need to be an positive integer > 0"));
        }
        else {
            myList = new ArrayList<>(n);
            if (n > 0) {
                for (int x = 1; x <= n; x++, arrayIndex++) {
                    if (x % 3 == 0 && x % 5 == 0) {
                        myList.add("Fizz Buzz");
                    } else if (x % 3 == 0) {
                        myList.add("Fizz");
                    } else if (x % 5 == 0) {
                        myList.add("Buzz");
                    } else {
                        myList.add(String.valueOf(x));
                    }
                }
            }

        }
        return myList;
    }
}















