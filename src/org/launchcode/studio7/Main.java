package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        DVD readWrite = DVD.DVDRW(10);
        DVD writeOnly= DVD.DVDR(20);

        CD music = new CD("The Best of Simon & Garfunkel","For Emily, Wherever I May Find Her\nBridge Over Toubled Water\nThe Boxer");

        readWrite.spinDisc();
        readWrite.getDiscInfo();
        readWrite.writeDiscData("Andre's Home Movie", "0:00-3:00 : Andre's race\n3:00 - 3:30 : Andre wins 1st place");
        readWrite.readDiscData();
        readWrite.writeDiscData("ITT Tech video", "0:00 - 5:00 : Taking test");
        readWrite.readDiscData();

        System.out.println("\n--------------------------\n");

        writeOnly.spinDisc();
        writeOnly.getDiscInfo();
        writeOnly.writeDiscData("Computers For Beginner", "0:00 - 1:00 : Basic networking\n1:00 - 2:00 : Classes in networking");
        writeOnly.readDiscData();
        writeOnly.writeDiscData("Testing", "Lots of new videos");
        writeOnly.readDiscData();

        System.out.println("\n-------------------------\n");

        music.spinDisc();
        music.getDiscInfo();
        music.writeDiscData("More learning", "fun projects");
        music.readDiscData();

    }
}
