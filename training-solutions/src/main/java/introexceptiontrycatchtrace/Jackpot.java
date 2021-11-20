package introexceptiontrycatchtrace;

public class Jackpot {

    public static void main(String[] args) {
        Winner winner= new Winner();
        System.out.println(winner.getWinners().size());
        try {
            System.out.println(winner.getWinner());
        } catch (IllegalArgumentException iae) {
            System.out.println("Nincs egy elem sem a tömbben.");
            System.out.println(iae.getMessage());
        } catch (NullPointerException npe) {
            System.out.println("Az egyik név null string.");
            System.out.println(npe.getMessage());
        }

        winner.addWinner("John Doe");
        System.out.println(winner.getWinner());
        winner.addWinner(null);
        winner.getWinner();
        try {
            System.out.println(winner.getWinner());
        } catch (IllegalArgumentException iae) {
            System.out.println("Nincs egy elem sem a tömbben.");
            System.out.println(iae.getMessage());
        } catch (NullPointerException npe) {
            System.out.println("Az egyik név null string.");
            System.out.println(npe.getMessage());
        }
    }
}
