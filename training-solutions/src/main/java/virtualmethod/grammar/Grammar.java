package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {
        Verb verb1 = new PhrasalVerb("alkot", "meg");
        System.out.println(verb1.getWord());

        Verb verb2 = new PhrasalVerbWithSuffix("alkot", "meg", "ás");
        System.out.println(verb2.getWord());
        System.out.println();

        Preposition preposition1 = new PhrasalVerb("alkot", "meg");
        System.out.println(preposition1.getPreposition());
        System.out.println(preposition1.getWholeWord());
        System.out.println();

        Preposition preposition2 = new PhrasalVerbWithSuffix("alkot", "meg", "ás");
        System.out.println(preposition2.getPreposition());
        System.out.println(preposition2.getWholeWord());
        System.out.println();

        PhrasalVerb phrasalVerb1 = new PhrasalVerb("alkot", "meg");
        System.out.println(phrasalVerb1.getWord());
        System.out.println(phrasalVerb1.getPreposition());
        System.out.println(phrasalVerb1.getWholeWord());
        System.out.println();

        PhrasalVerb phrasalVerb2 = new PhrasalVerbWithSuffix("alkot", "meg", "ás");
        System.out.println(phrasalVerb2.getWord());
        System.out.println(phrasalVerb2.getPreposition());
        System.out.println(phrasalVerb2.getWholeWord());
        System.out.println();

        PhrasalVerbWithSuffix phrasalVerbWithSuffix1 = new PhrasalVerbWithSuffix("alkot", "meg", "ás");
        System.out.println(phrasalVerbWithSuffix1.getWord());
        System.out.println(phrasalVerbWithSuffix1.getPreposition());
        System.out.println(phrasalVerbWithSuffix1.getSuffix());
        System.out.println(phrasalVerbWithSuffix1.getWholeWord());
    }
}
