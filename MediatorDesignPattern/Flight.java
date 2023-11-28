package MediatorDesignPattern;

public class Flight implements Command {
    private IATCMediator trafficController;
    private String name;
 
    public Flight(IATCMediator trafficController, String name) {
        this.trafficController = trafficController;
        this.name = name;
    }
 
    public void land() {
        if (trafficController.isAvailable()) {
            System.out.println("Flight " + name + " has landed");
            trafficController.setAvailability(false);
        } else
            System.out.println("Flight " + name + " is waiting for runway to clear");
    }

    public void parked() {
        System.out.println("Flight " + name + " has now parked and the runway is clear for landing");
        trafficController.setAvailability(true);
    }
 
    public void getReady() {
        System.out.println("Ready for landing.");
    }
}
