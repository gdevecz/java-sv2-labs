package defaultconstructor.date;

public class SimpleDateFormatter {

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(CountryCode.HU, simpleDate);
    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        switch (countryCode) {
            case HU:
                return getHuFormat(simpleDate);
            case EN:
                return getEnFormat(simpleDate);
            case US:
                return getUsFormat(simpleDate);
            default:
                throw new IllegalArgumentException("Invalid country code: " + countryCode.name());
        }
    }

    private String getHuFormat(SimpleDate simpleDate) {
        return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
    }

    private String getEnFormat(SimpleDate simpleDate) {
        return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
    }

    private String getUsFormat(SimpleDate simpleDate) {
        return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
    }
}
