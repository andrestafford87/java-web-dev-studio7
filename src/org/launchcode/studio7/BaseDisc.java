package org.launchcode.studio7;

public class BaseDisc {

    //class properties
    protected boolean isBlank;
    protected boolean isRewritable;
    protected int capacity;


    //Basic constructor
    public BaseDisc(boolean isBlank, boolean isRewritable, int capacity) {
        this.isBlank = isBlank;
        this.isRewritable = isRewritable;
        this.capacity = capacity;
    }
        //Unwriteable disc constructor
        public BaseDisc(boolean isBlank, boolean isRewritable) {
            this.isBlank = isBlank;
            this.isRewritable = isRewritable;
    }

    public BaseDisc() {

    }


    //method
    public void printCapacity(){
        System.out.println("This disc has a capicity of" + this.capacity + " GB.");
    }
}
