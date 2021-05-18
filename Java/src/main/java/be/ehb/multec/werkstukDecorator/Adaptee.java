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


}