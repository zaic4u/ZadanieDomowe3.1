public class TvTest {
    public static void main(String[] args) {
        Televisor Tv = new Televisor(false);
        Tv.showStatus();
        System.out.println();
        Tv.turnOn();
        Tv.showStatus();
        Tv.turnOff();
        System.out.println();
        Tv.showStatus();


    }
}
