package polymorphism.architect;

public class Architect {

    public static void main(String[] args) {
        Plan planSketchPlan = new SketchPlan(10, "Sketchplan1");
        Plan planPermitPlan = new PermitPlan(10, "Sketchplan1",
                "John Doe", "address");
        Plan planConstructionPlan = new ConstructionPlan(10, "Sketchplan1", "John Doe",
                "address", 2);
        SketchPlan sketchPlanSketchPlan = new SketchPlan(11, "Sketchplan2");
        SketchPlan sketchPlanPermitPlan = new PermitPlan(11, "Sketchplan2",
                "Jack Doe", "address2");
        SketchPlan sketchPlanConstructionPlan = new ConstructionPlan(11, "Sketchplan2",
                "Jack Doe", "address2", 5);
        Header headerPermitPlan = new PermitPlan(12, "Sketchplan3",
                "Joan Doe", "address3");
        Header headerConstructionPlan = new ConstructionPlan(12, "Sketchplan3",
                "Joan Doe", "address3", 7);
        PermitPlan permitPlanPermitPlan = new PermitPlan(13, "Sketchplan4",
                "Jill Doe", "address4");
        PermitPlan permitPlanConstuctionPlan = new ConstructionPlan(13, "Sketchplan5",
                "Jill Doe", "address4", 10);
        ConstructionPlan constructionPlan = new ConstructionPlan(14, "Sketchplan6",
                "James Doe", "address5", 13);

        System.out.println("Plan: ");
        System.out.println(planSketchPlan.getPagesOfDocumentation());
        System.out.println(planPermitPlan.getPagesOfDocumentation());
        System.out.println(planConstructionPlan.getPagesOfDocumentation());

        System.out.println("SketchPlan:");
        System.out.println(sketchPlanSketchPlan.getPagesOfDocumentation() + ", "
                + sketchPlanSketchPlan.getTitle());
        System.out.println(sketchPlanPermitPlan.getPagesOfDocumentation() + ", "
                + sketchPlanPermitPlan.getTitle());
        System.out.println(sketchPlanConstructionPlan.getPagesOfDocumentation() + ","
                + sketchPlanConstructionPlan.getTitle());

        System.out.println("Header:");
        System.out.println(headerPermitPlan.getNameOfClient() + ", " + headerPermitPlan.getAddressOfBuilding());
        System.out.println(headerConstructionPlan.getNameOfClient() + ", " + headerConstructionPlan.getAddressOfBuilding());

        System.out.println("PermitPlan:");
        System.out.println(permitPlanPermitPlan.getPagesOfDocumentation() + ", " + permitPlanPermitPlan.getTitle() + ", "
                + permitPlanPermitPlan.getNameOfClient() + ", " + permitPlanPermitPlan.getAddressOfBuilding());
        System.out.println(permitPlanConstuctionPlan.getPagesOfDocumentation() + ", " + permitPlanConstuctionPlan.getTitle() + ", "
                + permitPlanConstuctionPlan.getNameOfClient() + ", " + permitPlanConstuctionPlan.getAddressOfBuilding());

        System.out.println("ConstructionPlan:");
        System.out.println(constructionPlan.getPagesOfDocumentation() + ", " + constructionPlan.getTitle() + ", "
                + constructionPlan.getNameOfClient() + ", " + constructionPlan.getAddressOfBuilding() + ", "
                + constructionPlan.getHeader() + ", " + constructionPlan.getSheetsOfConstructionDrawings());
    }
}
