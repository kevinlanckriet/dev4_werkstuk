package be.ehb.multec.werkstukFactory;

public class SUV extends Car {

    private String trimGrade;
    private int assemblyLine;


    public SUV(String trimGrade){
        this.trimGrade=trimGrade;
        this.assemblyLine= 1;
    }

    @Override
    public String getTrim() {
        return this.trimGrade;
    }

    @Override
    public int getassemblyLine() {
        return this.assemblyLine;
    }

}