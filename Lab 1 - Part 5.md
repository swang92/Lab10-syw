## Lab 1 - Mark Down Document & Discussion Questions ##

Stephanie Wang

### Part 2 ###

If we didn't have to take into consideration the user's input, then we could create a loop that always has the goes from 1 to 17. The iterations of the loop would be set. Also, we wouldn't have to account for if the user enters invalid input (such as a String or negative value). The other option is just to print out the sequence as we know what it should be.


### Part 3 ###

You could have tested the solution from part 2 by using assertEquals in your jUnit test (instead of assertArray) and checked for a specific element that you expected or a subset that included all unique outputs of FizzBuzz (i.e. n=10 through n=15 because this includes all the unique outputs of a value, fizz, buzz, and fizz buzz). 


### Part 4 ###
When we changed to Array List, we had to import Array and List packages across the Main, FizzBuzz, and TestFizzBuzz classes. We had to make changes to the Main class to use a List and changes to the Fizz Buzz class so that our final method was a List. In the if statement before the for loop in the Fizz Buzz class, we had to declare a list for when a user input a value less than or equal to 0. The other changes were made to the Junit testing from assertArrayEquals to assertEquals and our lists are converted to Arrays using Arrays.toList and using just system.out.println(fizzBuzzList) instead of converting to String as we did with the Array.

Everything else should stay the same:for loop in the FizzBuzz class, keep the fizzBuzz method as static and declaring a List in the Main class so that all the "fizzbuzzing" is happen in the FizzBuzz class and Main is simpling printing it out. Our Junit are also testing against the same expected values - we are just changing the assert method used. The type of List implemented determines which methods we have to use in testing and parts of our FizzBuzz class (such as Arrays.asList which we use because we are using Array Lists). 



