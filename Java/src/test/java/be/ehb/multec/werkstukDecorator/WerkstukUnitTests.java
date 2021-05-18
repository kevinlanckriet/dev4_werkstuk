package be.ehb.multec.werkstukDecorator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static be.ehb.multec.werkstukDecorator.Main.convertOrder;
import static be.ehb.multec.werkstukDecorator.Main.trimPicker;

public class WerkstukUnitTests {

/*trim codes client side:
       Base: BA
       Stage1: BAU1
       Stage2: BAU1U2

  trim codes assembly side:
       Base: A5FG46
       Stage1: D8T4A6
       Stage2: G6E8VY
*/

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
