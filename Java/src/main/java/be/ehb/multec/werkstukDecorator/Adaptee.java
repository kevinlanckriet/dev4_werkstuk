<<<<<<< HEAD
package be.ehb.multec.werkstukDecorator;

public class Adaptee {
    public void converter(Model model) {
        int code = model.referenceCode();
        String assemblyReference = "";
        String VIN = "WBA";
        switch(code) {
            case 20:
                assemblyReference = "D8T4A6";
                break;
            case 27:
                assemblyReference = "G6E8VY";
                break;
            default:
                assemblyReference = "A5FG46";
        }

        VIN += assemblyReference;

        System.out.println("Converting assembly_request " + model.getIdentifier() + " for assembly line.");
        System.out.println("Conversion to assemblySyntax done: " + assemblyReference);
        System.out.println(VIN);
    }


=======
package be.ehb.multec.werkstukDecorator;

import be.ehb.multec.werkstukFactory.Car;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Adaptee {
    public void converter(Car car) {
        Random rnd = new Random();

        String assemblyReference;
        String VIN = "WBA";
        String factoryReference;
        switch(car.getTrim()) {
            case "BAU1":
                assemblyReference = "D8T4A6";
                break;
            case "BAU1U2":
                assemblyReference = "G6E8VY";
                break;
            default:
                assemblyReference = "A5FG46";
        }

        switch(car.getassemblyLine()) {
            case 1:
                factoryReference = "A";
                break;
            case 2:
                factoryReference = "F";
                break;
            default:
                factoryReference = "k";
        }

        VIN += assemblyReference + "M" + factoryReference + (100000 + rnd.nextInt(900000));


        System.out.println("Converting assembly_request " + car.getTrim() + " for assembly line: " + car.getassemblyLine());
        System.out.println("Conversion to assemblySyntax done: " + assemblyReference);
        System.out.println(VIN);
    }


>>>>>>> feature/FACTORY
}