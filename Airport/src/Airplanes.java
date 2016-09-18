import java.util.HashMap;
import java.util.Map;

class Airplanes {

    private HashMap<String,String> airplanes;

    public Airplanes() {
        airplanes = new HashMap<>();
    }

    void addAirplane(String planeID, String planeCapacity) {
        airplanes.put(planeID,planeCapacity);
    }

    String getAirplaneCapacity(String planeID) {
        if (airplanes.get(planeID) != null) {
            return airplanes.get(planeID);
        }
        else {
            return null;
        }
    }

    boolean checkAirplaneID(String airplaneID) {
        return airplanes.containsKey(airplaneID);
    }

    void getAllAirplanesInfos() {
        for (Map.Entry<String, String> entry : airplanes.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getValue() + " ppl)");
        }
    }
}