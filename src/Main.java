import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String partyType;
        String partyDemocrat = "D";
        String partyRepublican = "R";
        String partyIndependent = "I";

        Scanner scan = new Scanner(System.in);
        System.out.println("What political party are you involved in? Options are D, R, and I ");

       if (scan.hasNextLine())   {

        partyType = scan.nextLine();

            if (partyType.equals(partyDemocrat))
                System.out.println("You get a Democratic Donkey.");
            else if (partyType.equals(partyRepublican))
                System.out.println("You get a Republican Elephant.");
            else if (partyType.equals(partyIndependent))
                System.out.println("You get an Independent Person.");


		else
                System.out.println("You have entered the wrong data type");
        }
    }
}