package MediatorDesignPattern;

public class Runway implements Command {
    private IATCMediator trafficController;
 
    public Runway(IATCMediator trafficController) {
        this.trafficController = trafficController;
    }
 
    @Override
    public void land() {
        System.out.println("Runway is available for landing");
        trafficController.setAvailability(true);
    }
}
