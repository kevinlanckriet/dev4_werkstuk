package be.ehb.multec.werkstukFactory;

public class HATCHBACK extends Car {

    private String trimGrade;
    private int assemblyLine;

    public HATCHBACK(String trimGrade){
        this.trimGrade=trimGrade;
        this.assemblyLine = 0;
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