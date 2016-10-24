import java.util.Objects;

class RegistrationPlate {

    private final String regCode;
    private final String country;

    RegistrationPlate(String regCode, String country) {
        this.regCode = regCode;
        this.country = country;
    }

    public String toString(){
        return country + " " + regCode;
    }

    private String getRegCode() {
        return regCode;
    }

    private String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }

        if(getClass() != object.getClass()){
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if(!Objects.equals(this.regCode, compared.getRegCode())){
            return false;
        }

        if(this.country == null || !this.country.equals(compared.getCountry())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode(){
        if (this.country == null) {
            return -1;
        }

        return + this.country.hashCode();
    }
}