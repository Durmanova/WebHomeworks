public class MicrowaveTester {
    public static void main(String[] args) {
        Microwave mw = new Microwave(15, 1);
        mw.start();
        mw.reset();
        mw.increaseTime();
        mw.increaseTime();
        mw.powerSwitch();
        mw.start();
    }
}