package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {

        Building building = new Building("épület", 101,2);
        SchoolBuilding schoolBuilding = new SchoolBuilding("iskola", 600, 3, 20);

        System.out.println(building.getClass());
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        System.out.println(schoolBuilding.getClass());
        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
