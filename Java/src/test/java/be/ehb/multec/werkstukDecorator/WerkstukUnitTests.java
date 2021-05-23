package be.ehb.multec.werkstukDecorator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static be.ehb.multec.werkstukDecorator.Main.convertOrder;
import static be.ehb.multec.werkstukDecorator.Main.trimPicker;
<<<<<<< HEAD
=======
import be.ehb.multec.werkstukFactory.Factory;
import be.ehb.multec.werkstukFactory.Car;
>>>>>>> feature/FACTORY

public class WerkstukUnitTests {

/*trim codes client side:
       Base: BA
       Stage1: BAU1
       Stage2: BAU1U2
<<<<<<< HEAD

=======
>>>>>>> feature/FACTORY
  trim codes assembly side:
       Base: A5FG46
       Stage1: D8T4A6
       Stage2: G6E8VY
*/

<<<<<<< HEAD
    @Test
    void decorateTrim() {
        Assert.assertEquals("Base car setup",trimPicker(0).getDescription());
    }

    @Test
    void adaptIdentifier() {
        Model toBeConvertered = trimPicker(2);
        System.out.println("We expect stage 2 code. -> " +toBeConvertered.getIdentifier());
        convertOrder(toBeConvertered);
    }


}
=======
    @Test
    void decorateTrim() {
        Model test = trimPicker(0);
        Assert.assertEquals("Base car setup",trimPicker(0).getDescription());
        Assert.assertEquals("BA",trimPicker(0).getIdentifier());
        System.out.println(test.getIdentifier());

    }
    @Test
    void sendTrimThoughFactory() {
        Model trimGrade = trimPicker(0);
        Car suv = Factory.getDetails("suv",trimGrade.getIdentifier());
        Car sedan = Factory.getDetails("sedan",trimGrade.getIdentifier());
        Car hatch = Factory.getDetails("hatchback",trimGrade.getIdentifier());
        System.out.println("Factory configuration for:"+ suv);
        System.out.println("Factory configuration for:"+ sedan);
        System.out.println("Factory configuration for:"+ hatch);

    }

    @Test
    void adaptIdentifier(){
        Model trim = trimPicker(2);
        Car suv = Factory.getDetails("suv",trim.getIdentifier());
        convertOrder(suv);
        System.out.println("We expect stage 2 code. -> " +suv.getTrim());
        System.out.println("Assembly line received VIN number:");

    }


}
>>>>>>> feature/FACTORY
