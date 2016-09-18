import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Airplanes airplane = new Airplanes();
        Flights flight = new Flights();

        AirportServicePanel ui = new AirportServicePanel(reader, airplane,flight);
        ui.startAirportPanel();
        ui.startFlightService();
    }
}
