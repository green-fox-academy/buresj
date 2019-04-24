//        introduces numberOfStrings and
//        sound() method what's implementation is yet unknown
//        but with the help of the sound() the play() method is fully implementable


package main.java.music;

abstract class StringedInstrument extends Instrument {

    protected int numberOfStrings;

    public StringedInstrument(String name) {
        super(name);
    }

}
