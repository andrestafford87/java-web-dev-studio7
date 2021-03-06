package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{

    //class properities
    private static final String spinRate = "200 - 500";
    private String name;
    private String content;

    // Basic constructor
    public DVD(boolean isBlank, boolean isRewritable, int capacity, String name, String content) {
        super(isBlank, isRewritable, capacity);
        this.name = name;
        this.content = content;
    }


    //Blank DVD constructor
    public DVD(boolean isBlank, boolean isRewritable, int capacity){
        super(isBlank, isRewritable, capacity);
    }
    //movie DVD costructor
    public DVD(String name, String content){
        super();
        this.name = name;
        this.content = content;
    }
    //New CD-RW constructor
    public static DVD DVDRW(int capacity){
        return new DVD(true, true, capacity);
    }
    //New CD-R constructor
    public static DVD DVDR(int capacity) {
        return new DVD(true, false, capacity);
    }
    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of " + spinRate + "rpm.");
    }


    @Override
    public void getDiscInfo() {
        if (this.isBlank && this.isRewritable) {
            System.out.println("This is a blank,rewritable CD.");
            this.printCapacity();
        } else if (this.isBlank && !this.isRewritable) {
            System.out.println("This is a blank, non-rewritable CD.");
        } else if (!this.isBlank && this.isRewritable) {
            System.out.println(this.name + "is a rewritable CD.");
        } else if (!this.isBlank && !this.isRewritable) {
            System.out.println("This is a CD named " + this.name + ".");
            System.out.println("It contains: " + this.content);
        }
    }

    @Override
    public void writeDiscData(String name,String content){
        if (this.isBlank) {
            System.out.println("Naming CD " + name + "'");
            System.out.println("Writing " + content + " to " + name + "'");
            this.name = name;
            this.content = content;
            this.isBlank = false;
        } else if (this.isRewritable) {
            System.out.println("Erasing rewritable CD.");
            System.out.println("Renaming CD " + name + "'");
            System.out.println("Writing " + content + " to " + name + "'");
            this.name = name;
            this.content = content;
            this.isBlank = false;
        } else {
            System.out.println("Error! Disc not writable!");
        }
    }
    @Override
    public void readDiscData(){
        if (name != null || name != ""){
            System.out.println(this.name);
        } else {
            System.out.println("Error!  Disc not named.");
        }
        if (content != null || content != "") {
            System.out.println(this.content);
        }else {
            System.out.println("Error! Disc has no contents.");
        }
    }




}
