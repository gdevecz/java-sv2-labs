package nestedclasses.soccer;

import java.util.List;

public class Championship {

    private List<TeamStatistics> leagueTable;

    public void addGame(GameResult result) {
        TeamStatistics home = getTeam(result.teamHome);
        TeamStatistics guest = getTeam(result.teamGuest);
        home.played(result.goalHome, result.goalGuest);
        guest.played(result.goalGuest, result.goalHome);
    }

    public List<TeamStatistics> getLeagueTable() {
        return leagueTable;
    }

    private TeamStatistics getTeam(String name) {
        for (TeamStatistics actual : leagueTable) {
            if (name.equals(actual.getTeamName())) {
                return actual;
            }
        }
        TeamStatistics newTeam =new TeamStatistics(name);
        return newTeam;
    }

    public static class GameResult {

        private String teamHome;

        private String teamGuest;

        private int goalHome;

        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }
}
