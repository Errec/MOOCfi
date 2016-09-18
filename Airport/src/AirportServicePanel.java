import java.util.Scanner;

public class AirportServicePanel {
    private Scanner reader;
    private Airplanes airplanes;
    private Flights flights;
    private String airplaneID;
    private String departureCode;
    private String destinationCode;
    private String str;
    private String airplaneCapacity;
    private boolean done;

    public AirportServicePanel(Scanner reader, Airplanes airplanes, Flights flights) {
        this.reader = reader;
        this.airplanes = airplanes;
        this.flights = flights;
    }

    public void startAirportPanel() {
        done = false;
        System.out.println("Airport panel\n" + "--------------------\n");

        while (!done) {
            System.out.print("Choose operation:\n" +
                    "[1] Add airplane\n" +
                    "[2] Add flight\n" +
                    "[x] Exit\n" +
                    ">");
            str = reader.nextLine();

            switch (str) {
                case "1":
                    System.out.print("Give plane ID: ");
                    airplaneID = reader.nextLine();
                    System.out.print("Give plane capacity: ");
                    airplaneCapacity = reader.nextLine();
                    airplanes.addAirplane(airplaneID,airplaneCapacity);
                    break;

                case "2":
                    System.out.print("Give plane ID: ");
                    airplaneID = reader.nextLine();
                    System.out.print("Give departure airport code: ");
                    departureCode = reader.nextLine();
                    System.out.print("Give destination airport code: ");
                    destinationCode = reader.nextLine();
                    if (airplanes.checkAirplaneID(airplaneID)) {
                        flights.addFlight(airplaneID,departureCode+"-"+destinationCode);
                        break;
                    }
                    else {
                        System.out.println("Invalid airplane ID");
                        break;
                    }

                case "x":
                    done = true;
                    break;

                default:
                    System.out.println("Invalid option\n");
                    break;
            }
        }
    }

    public void startFlightService() {
        done = false;
        System.out.println("Flight service\n" + "------------\n");

        while (!done) {
            System.out.print("Choose operation:\n" +
                    "[1] Print planes\n" +
                    "[2] Print flights\n" +
                    "[3] Print plane info\n" +
                    "[x] Quit\n" +
                    ">");
            str = reader.nextLine();

            switch (str) {
                case "1":
                    airplanes.getAllAirplanesInfos();
                    break;

                case "2":
                    flights.getAllFlightsInfos();
                    break;

                case "3":
                    System.out.print("Give plane ID: ");
                    airplaneID = reader.nextLine();
                    if (airplanes.checkAirplaneID(airplaneID)) {
                        System.out.println(airplaneID + " " + "(" + airplanes.getAirplaneCapacity(airplaneID)+ "ppl)");
                        break;
                    }
                    else {
                        System.out.println("Invalid airplane ID");
                        break;
                    }

                case "x":
                    done = true;
                    break;

                default:
                    System.out.println("Invalid option\n");
                    break;
            }
        }
    }
}

