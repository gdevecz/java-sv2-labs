package stringconcat.nameconcat;

public class Name {

    private String familyName;

    private String middleName;

    private String givenName;

    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {
        String result = "";
        if (title != null) {
            result += title.getText() + " ";
        }
        result += givenName + " ";
        if (middleName != null) {
            result += middleName + " ";
        }
        result += familyName;
        return result;
    }

    public String concatNameHungarianStyle() {
        String result = ((title != null)
                ? title.getText() + " "
                : (""));
        return result.concat(familyName).concat(" ").concat(givenName)
                .concat((middleName != null)
                        ? (" ").concat(middleName)
                        : (""));
    }
}
