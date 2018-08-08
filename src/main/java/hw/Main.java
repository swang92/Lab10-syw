package hw;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    int max = 0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
        System.out.println("The argument entered must be integer");
        System.exit(1);
      }

      if (max <= 0) {
        try {
          throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
          System.out.println("The argument entered must be integer greater than 0");
          System.exit(1);
        }
      }

      List<String> fizzBuzzList = FizzBuzz.fizzBuzzList(max);

      System.out.println(fizzBuzzList);

    }
  }
}














