import java.util.HashMap;
import java.util.Map;

class Flights {

    private HashMap<String,String> flights;

    public Flights() {
        flights = new HashMap<>();
    }

    void addFlight(String airplaneID, String flightRoute) {
        flights.put(airplaneID,flightRoute);
    }

    void getAllFlightsInfos() {
        for (Map.Entry<String, String> entry : flights.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
        }
    }
}