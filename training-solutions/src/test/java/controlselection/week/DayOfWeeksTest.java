package controlselection.week;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeeksTest {

    DayOfWeeks dayOfWeeks = new DayOfWeeks();

    @Test
    void tastCommentDAyOfWeek() {
        String[] source = {"hétfő", "kedd", "SzerDa", "CSÜtörTÖK", "péntek", "szombat", "vasÁRNAP", "elrontott"};
        String[] target = {"hét eleje", "hét közepe", "hét közepe",
                "hét közepe", "majdnem hétvége", "hét vége", "hét vége", "ismeretlen nap"};
        for (int i = 0; i < source.length; i++) {
            assertEquals(target[i],dayOfWeeks.commentDAyOfWeek(source[i]));
        }

    }
}