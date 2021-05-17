package be.ehb.multec.werkstukDecorator;

import org.junit.jupiter.api.Test;

public class WerkstukUnitTests {
    @Test
    void trimPicker() {
        Model model = new BaseModel();
        model = new UpgradeModel1(model);
        model = new UpgradeModel2(model);

        System.out.println(model.getDescription());
    }
}
