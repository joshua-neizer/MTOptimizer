// Child class of Vehicle that holds the information about every GoBus defined in the gobuses.txt file
public class GoBuses extends Vehicle {

    // Variables and accessor methods are inherited from the Vehicle class
    // Constructor class takes an array of Strings that is organizes
    GoBuses(String[] transportInfo, String description) {
        this.description = description.replace(",", ", ");
        this.unitNumber = Integer.valueOf(transportInfo[0]);
        this.identification = transportInfo[1];
        this.capacity = Integer.valueOf(transportInfo[2]);
    }
}