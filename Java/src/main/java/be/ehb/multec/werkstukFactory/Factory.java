package be.ehb.multec.werkstukFactory;

public class Factory {

    public static Car getDetails(String vehicleType, String trimIdentifier){

        if("SUV".equalsIgnoreCase(vehicleType)) return new SUV(trimIdentifier);
        else if("SEDAN".equalsIgnoreCase(vehicleType)) return new SEDAN(trimIdentifier);
        else if("HATCHBACK".equalsIgnoreCase(vehicleType)) return new HATCHBACK(trimIdentifier);


        return null;
    }
}