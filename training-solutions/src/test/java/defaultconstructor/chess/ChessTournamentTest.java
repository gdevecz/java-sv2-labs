package defaultconstructor.chess;

import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ChessTournamentTest {

    ChessTournament ct = new ChessTournament();

    @Test
    void addPlayersToTeamsTest() {
        Player playerOne = new Player();
        playerOne.setName("Walaki");
        playerOne.setEmail("e-mail");
        ct.addPlayersToTeams(Arrays.asList(playerOne));

        assertEquals(3, ct.getTeams().size());
        assertSame(playerOne, ct.getTeams().get(0).getPlayerOne());
        assertSame(null, ct.getTeams().get(0).getPlayerTwo());
        assertEquals("Walaki", ct.getTeams().get(0).getPlayerOne().getName());
        assertEquals("e-mail", ct.getTeams().get(0).getPlayerOne().getEmail());
    }

    @Test
    void testToStringTest() {
        String expected ="Walaki, e-mail : Free\n" +
                "Free : Free\n" +
                "Free : Free";
        Player playerOne = new Player();
        playerOne.setName("Walaki");
        playerOne.setEmail("e-mail");
        ct.addPlayersToTeams(Arrays.asList(playerOne));

        assertEquals(expected, ct.toString());
    }
}