import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String partyChoice = "";
        System.out.println("Enter your party affiliation:");
        System.out.print("Enter your choice (D, R, I): ");
partyChoice = in.nextLine();
partyChoice = partyChoice.toUpperCase();
        if (partyChoice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        }else if (partyChoice.equals("R")){
                System.out.println("You get a Republican Elephant.");
            } else if (partyChoice.equals("I")) {
            System.out.println("You get a Independent Person.");
        }else{
            System.out.println("You entered: "+ partyChoice + " which is invalid.You may enter only D, R, or I ");
        }
    }
    }

