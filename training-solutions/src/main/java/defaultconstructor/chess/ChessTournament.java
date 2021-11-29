package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessTournament {

    private List<Team> teams;

    public ChessTournament() {
        teams = Arrays.asList(new Team(), new Team(), new Team());
    }

    public void addPlayersToTeams(List<Player> playersRegistrated) {
        int maxPlayers = min(playersRegistrated.size(), teams.size() * 2);
        int i = 0;
        while (i < maxPlayers / 2) {
            teams.get(i).setPlayerOne(playersRegistrated.get(i * 2));
            teams.get(i).setPlayerTwo(playersRegistrated.get(i * 2 + 1));
            i++;
        }
        if (maxPlayers % 2 != 0) {
            teams.get(i).setPlayerOne(playersRegistrated.get(i * 2));
        }
    }

    public List<Team> getTeams() {
        return teams;
    }

    private int min(int a, int b) {
        return a > b ? b : a;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Team team : teams) {
            if (first){
                first = false;
            } else {
                sb.append("\n");
            }
            sb.append(team);
        }
        return sb.toString();
    }
}

