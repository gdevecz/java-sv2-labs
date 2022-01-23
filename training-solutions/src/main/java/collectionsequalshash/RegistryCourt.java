package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {

    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();

        Company company1 = new Company("cég1", "tax1");
        Company company2 = new Company("cég2", "tax2");
        Company company3 = new Company("cég3", "tax3");

        companies.add(company1);
        companies.add(company2);
        companies.add(company3);

        System.out.println(companies.contains(new Company("cég1", "tax1")));
        System.out.println(companies.contains(new Company("cég2", "tax2")));
        System.out.println(companies.contains(new Company("cég3", "tax3")));
        System.out.println(companies.contains(new Company("cég223123", "tax3123")));
    }
}
