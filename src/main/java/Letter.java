import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Letter {
    public String  main(String args){
        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int count = 0;
        String randomLetter =  newLetter(alphabet);
        //Scanner sc = new Scanner(System.in);
        String Answare = "";
//        while (true) {
            //System.out.println("Input your letter");
            //String letterUser = sc.nextLine().toLowerCase();
            int tryKey = Arrays.binarySearch(alphabet, args);
            if (tryKey < 0) {
//                System.out.println("Incorrect input");
                  Answare = "Incorrect input";
//                  break;
            }
            else {
                if (Arrays.asList(alphabet).indexOf(args) > Arrays.asList(alphabet).indexOf(randomLetter)) {
//                    System.out.println("Too high!");
                    Answare = "Too high!";
                    count += 1;
                }
                if (Arrays.asList(alphabet).indexOf(args) < Arrays.asList(alphabet).indexOf(randomLetter)) {
//                    System.out.println("Too low!");
                    Answare = "Too low";
                    count += 1;

                }
                if (args.equals(randomLetter)) {
                    count += 1;
//                    System.out.println("You win!");
                    Answare = "You win";
                    System.out.println(count);
//                    break;
                }
            }
//        }
        return Answare;
    }
    public static String newLetter(String[] alphabet){
        Random random = new Random();
        int randomLetterNumber = random.nextInt(alphabet.length);
        String randomLetter = alphabet[randomLetterNumber];
        return randomLetter;

    }
}




