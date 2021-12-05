package inheritancemethods.plane;

public class Plane {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("John Doe", 15000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Jack Doe", 15000, 10);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Jill Doe", 15000, 20);

        System.out.println(passenger.getName() + ", " + passenger.getPriceOfPlaneTicket());
        System.out.println();
        System.out.println(priorityPassenger.getName() + ", " + priorityPassenger.getPriceOfPlaneTicket()
                + ", " + priorityPassenger.getPercent());
        System.out.println();
        System.out.println(firstClassPassenger.getName() + ", " + firstClassPassenger.getPriceOfPlaneTicket()
                + ", " + firstClassPassenger.getPercent() + ", " + firstClassPassenger.extraCharge);

    }
}
