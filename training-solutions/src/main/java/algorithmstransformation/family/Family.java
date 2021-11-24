package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<FamilyMember> familyMembers;

    public Family() {
        this.familyMembers = new ArrayList<>();
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven(String name) {
        List<Integer> result = new ArrayList<>();
        for (FamilyMember member : familyMembers) {
            if(member.getName().contains(name)) {
                result.add(member.getAge());
            }
        }
        return result;
    }

    public void addFamilyMember(FamilyMember newFamilyMember) {
        familyMembers.add(newFamilyMember);
    }

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }
}
