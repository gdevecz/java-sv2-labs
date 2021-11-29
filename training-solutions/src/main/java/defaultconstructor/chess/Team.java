package defaultconstructor.chess;

public class Team {

    private Player playerOne;

    private Player playerTwo;

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(freeOrReserved(playerOne));
        sb.append(" : ");
        sb.append(freeOrReserved(playerTwo));
        return sb.toString();
    }

    private String freeOrReserved(Player player) {
        if (player == null) {
            return "Free";
        }
        return player.toString();
    }
}
