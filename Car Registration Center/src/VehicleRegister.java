class VehicleRegister {

    private final RegistrationPlate plate;
    private final String owner;

    VehicleRegister(RegistrationPlate plate, String owner) {
        this.plate = plate;
        this.owner = owner;
    }

    /*
     * This function adds the parameter owner of the car which corresponds to the parameter registration plate.
     * The method returns true if the car had no owner; if the car had an owner already,
     * the method returns false and it doesn't do anything
     */
    public boolean add(RegistrationPlate plate, String owner){

    } //TODO

    /*
     * This function returns the car owner which corresponds to the parameter register number.
     * If the car was not registered, it returns null
     */
    public String get(RegistrationPlate plate){

    } //TODO

    /*
    * This function delete the information connected to the parameter registration plate.
    * The method returns true if the information was deleted,
    * and false if there was no information connected to the parameter in the register.
    */
    public boolean delete(RegistrationPlate plate){

    } //TODO

    /*
     * This function prints out all the registration plates stored
     */
    public void printRegistrationPlates(){

    } //TODO

    /*
     * This function prints all the car owners stored. Each owner's name has to be printed only once,
     * even though they had more than one car
     */
    public void printOwners(){

    } //TODO
}
