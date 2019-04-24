//        We start with a base, abstract class Instrument.
//        it reserves (e.g. protected) the name of the instrument
//        it should provide a play() method.


package main.java.music;

    abstract class Instrument {

        protected String name;

        public Instrument(String name) {
            this.name = name;
        }

        public abstract void play();
}
