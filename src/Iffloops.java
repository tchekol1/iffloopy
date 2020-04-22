import java.util.Scanner;

public class Iffloops {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Create ONE string variable to store the output of 5 words that a user will enter at random.
        String ONE="";
        String word;
        String ans;
        String input="";
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a word");
            word=scanner.nextLine();
            ONE+=word;
        }
        System.out.println(ONE);

        System.out.println();
        boolean RedEyes= false;
        while(!(input.equals("n"))) {
            System.out.println("Are your eyes red? ");
            ans = scanner.nextLine();

            if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("Y")) {
                RedEyes=true;
                System.out.println("Get some sleep! Red eyes: "+ RedEyes);
            } else {
                RedEyes=false;
                System.out.println("You look great! Red eyes: "+ RedEyes);

            }
            System.out.println("Do you want to try again? ");
            input=scanner.nextLine();
        }


    }
    
}


