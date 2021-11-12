package meetingroom;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class meetingRoomIOTest {

    MeetingRoomIO mIO = new MeetingRoomIO();

    @Test
    void testLabeledRequestAString() {
        String officeName = "test room";
        System.setIn(new ByteArrayInputStream(officeName.getBytes(StandardCharsets.UTF_8)));
        String result = mIO.labeledRequestAString("teszt labeledRequestAString");
        Scanner sc = new Scanner(System.in);
        System.setIn(System.in);

        assertEquals("test room", result);

    }

    @Test
    void labeledRequestANumber() {
        String number = "  137 ";
        System.setIn(new ByteArrayInputStream(number.getBytes(StandardCharsets.UTF_8)));
        int result = mIO.labeledRequestANumber("teszt labeledRequestANumber");
        System.setIn(System.in);

        assertEquals(137, result);
    }


    @Test
    void yesNoQuestion() {
        String answerYes = "i";
        String answerNo = "N";
        String answerFailed ="x\ni";
        System.setIn(new ByteArrayInputStream(answerYes.getBytes(StandardCharsets.UTF_8)));
        boolean resultYes = mIO.yesNoQuestion("test true yesNoQuestion");
        System.setIn(new ByteArrayInputStream(answerNo.getBytes(StandardCharsets.UTF_8)));
        boolean resultNo = mIO.yesNoQuestion("test false yesNoQuestion");
        System.setIn(new ByteArrayInputStream(answerFailed.getBytes(StandardCharsets.UTF_8)));
        boolean resultFailed = mIO.yesNoQuestion("test failed yesNoQuestion");
        System.setIn(System.in);

        assertEquals(true, resultYes);
        assertEquals(false, resultNo);
        assertEquals(true, resultFailed);
    }

    @Test
    void isStringValidInteger() {
    }
}