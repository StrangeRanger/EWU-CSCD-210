import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        /* ****************************************************************** /*
         * Task 1)
         * (Days of a month) Write a Java program that prompts the user to enter
         * the year and the first three letters of a month name (in either
         * lowercase or uppercase letters; or just the first letter uppercase),
         * and displays the number of days in the month. Assume the year is
         * between 1900 and 2100. If the input for month is incorrect, your
         * code should display a message telling the user, it’s not a correct
         * month name (e.g., “Avr” or “$A8” is not a correct month name). Feel
         * free to use loops if you’d like to repeatedly prompt the user for a
         * year and a month.
         *
         * Show five sample runs of your program on different inputs, including
         * at least one invalid input (such as, a string that’s not a proper
         * abbreviated name of a month; or a year that is not in the specified
         * range).
        /* ****************************************************************** */
///*
        int year;
        String month;
        Scanner userInput = new Scanner(System.in);

        System.out.println("**********************\n* Performing Task 1! *\n" +
                "**********************");
        System.out.println("Possible years: 1900-2100\nPossible months: Jan, " +
                "Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec\n");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Sample run %d\n", i+1);

            while (true) {
                System.out.print("Enter a year: ");
                // Reading the complete line for the integer and converting it
                // to an integer
                // Source: https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
                year = Integer.parseInt(userInput.nextLine());
                if (year < 1900 || year > 2100) {
                    System.out.printf("%sInvalid year: Enter a year between 1900 " +
                            "and 2100%s\n", "\033[1;31m", "\033[0m");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Enter a month: ");
                month = userInput.nextLine().toLowerCase();
                switch (month) {
                    case "jan":
                        System.out.println("There are 31 days in January of " + year);
                        break;
                    case "feb":
                        int day;

                        // Detects if it's a leap year
                        // Source: https://www.programiz.com/java-programming/examples/leap-year
                        if (year % 4 == 0) {
                            if( year % 100 == 0) {
                                if ( year % 400 == 0) {
                                    day = 29;
                                } else {
                                    day = 28;
                                }
                            } else {
                                day = 29;
                            }
                        } else {
                            day = 28;
                        }

                        System.out.println("There are " + day + " days in February " + year + "\n");
                        break;
                    case "mar":
                        System.out.println("There are 31 days in March of " + year + "\n");
                        break;
                    case "apr":
                        System.out.println("There are 30 days in April of " + year + "\n");
                        break;
                    case "may":
                        System.out.println("There are 31 days in May of " + year + "\n");
                        break;
                    case "jun":
                        System.out.println("There are 30 days in June of " + year + "\n");
                        break;
                    case "jul":
                        System.out.println("There are 31 days in July of " + year + "\n");
                        break;
                    case "aug":
                        System.out.println("There are 31 days in August of " + year + "\n");
                        break;
                    case "sep":
                        System.out.println("There are 30 days in September of " + year + "\n");
                        break;
                    case "oct":
                        System.out.println("There are 31 days in October of " + year + "\n");
                        break;
                    case "nov":
                        System.out.println("There are 30 days in November of " + year + "\n");
                        break;
                    case "dec":
                        System.out.println("There are 31 days in December of " + year + "\n");
                        break;
                    default:
                        System.out.printf("%sInvalid month: Enter one of the possible " +
                                "months displayed in the list above%s\n", "\033[1;31m", "\033[0m");
                        continue;
                }
                break;
            }
        }
//*/

        /* ***************************************************************** /*
         * Task 2)
         * (Cities in ascending order) Write a Java program that prompt the
         * user to enter three cities, and then displays those cities names in
         * ascending order. Use string comparison operator.
         * Example: Atlanta < Boston < Chicago.
         *
         * Show output of five sample runs of your program (for five different
         * “triplets” of cities).
         *
         * STUDENT NOTE:
         * I honestly couldn't figure this out, so I used the code here as a
         * template and made modifications to it.
         * https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_04/Exercise_04_24/Exercise_04_24.java
        /* ****************************************************************** */
///*
        String city1, city2, city3, temp;
        Scanner userInputTwo = new Scanner(System.in);

        System.out.println("**********************\n* Performing Task 2! *\n" +
                "**********************");

        for (int i = 0; i < 5; i++) {
            System.out.printf("*** Sample run %d ***\n", i+1);

            System.out.print("Enter first city: ");
            city1 = userInputTwo.nextLine();
            System.out.print("Enter second city: ");
            city2 = userInputTwo.nextLine();
            System.out.print("Enter third city: ");
            city3 = userInputTwo.nextLine();

            // Ignores case, because a different ascii number would be used,
            // for example, 'S' and 's', making it possible for inaccurate
            // output to occur
            if ((city2.compareToIgnoreCase(city1) < 0) &&
                    (city2.compareToIgnoreCase(city3) < 0)) {
                temp = city1; city1 = city2; city2 = temp;
            }
            else if ((city3.compareToIgnoreCase(city1) < 0) &&
                    (city3.compareToIgnoreCase(city2) < 0)) {
                temp = city1; city1 = city3; city3 = temp;
            }
            if (city3.compareToIgnoreCase(city2) < 0) {
                temp = city2; city2 = city3; city3 = temp;
            }

            System.out.printf("Cities in ascending order: %s < %s < %s\n\n", city1, city2, city3);
        }
//*/

        /* ****************************************************************** /*
         * Task 3)
         * (Prime integers) Write a Java program that displays the prime numbers
         * between 1 and 1,000, inclusive. Feel free to use, and modify
         * appropriately, the code in Chapter 5 of Liang.  Format your output so
         * that eight primes are printed per each line. Separate different
         * numbers by one or more spaces.
        /* ****************************************************************** */



        /* ****************************************************************** /*
         * Task 4)
         * (Count vowels and consonants) Write a program that prompts the user
         * to enter a string, and then counts separately the total # of vowels
         * (in lowercase or uppercase) and the total # of consonants (also
         * either in lowercase or uppercase). All non-letter characters in the
         * string should be ignored, i.e., not counted.
         *
         * Show the output of your program for five different sample strings,
         * each of which of length 10 or greater, and each including both
         * uppercase & lowercase letters, and non-letter characters such as
         * numbers, ‘_’, ‘&’, ‘$’ or similar (spec. characters)
        /* ****************************************************************** */



        /* ****************************************************************** /*
         * Task 5)
         * Write a Java program that prompts the user to enter a string and then
         * displays that string in reverse order. The string should be at least
         * 10 characters long. Show five sample outputs of your code; at most
         * one example is allowed to be a palindrome.
         * Example: “AbCD1” reversed becomes “1DCbA”.
        /* ****************************************************************** */


    }
}