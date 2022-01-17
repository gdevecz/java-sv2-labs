package nestedclasses.soccer;

import java.util.Objects;

public class TeamStatistics {

    private String teamName;

    private PlayedStats playedStats;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
        this.playedStats = new PlayedStats();
    }


    private int goalsFor;

    private int goalsAgainst;

    private int points;

    public String getTeamName() {
        return teamName;
    }

    public int getPlayed() {
        return playedStats.played;
    }

    public int getWon() {
        return playedStats.won;
    }

    public int getTied() {
        return playedStats.tied;
    }

    public int getLost() {
        return playedStats.lost;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamStatistics that = (TeamStatistics) o;
        return Objects.equals(teamName, that.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamName);
    }

    public void played(int plusGoalsFor, int plusGoalsAgainst) {
        goalsFor += plusGoalsFor;
        goalsAgainst += plusGoalsAgainst;
        playedStats.played++;
        int result = plusGoalsFor-plusGoalsAgainst;
        if(result > 0) {
            result = 3;
        } else if (result < 0) {
            result = 0;
        } else {
            result = 1;
        }
        points += result;
    }

    private class PlayedStats {
        private int played;

        private int won;

        private int tied;

        private int lost;
    }

}
