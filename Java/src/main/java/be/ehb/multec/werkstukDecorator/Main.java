package be.ehb.multec.werkstukDecorator;

public class Main {

    int trimChoice = 0;
    public static Model trimPicker(int choice) {
        Model model = new BaseModel();
        if (choice == 1) {model = new UpgradeModel1(model);}
        if (choice == 2) {
            model = new UpgradeModel1(model);
            model = new UpgradeModel2(model);
        }
        return (model);

        //System.out.println(model.getDescription());
    }

    public static void convertOrder(Model model){
        String VIN;
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.targetRequest(model);
    }

}

