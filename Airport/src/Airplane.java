import java.util.HashMap;

class Airplane {

    private HashMap<String,Integer> airplanes;

    public Airplane() {
        airplanes = new HashMap<>();
    }

    void add(String ID, int capacity) {
        airplanes.put(ID,capacity);
    }

    String planeInfo(String ID) {
        if (airplanes.get(ID) != null) {
            return  ID + " " + "(" + airplanes.get(ID) + " ppl)";
        }
        else {
            return "null";
        }
    }

}
