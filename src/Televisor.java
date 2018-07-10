public class Televisor {
    boolean standby;

    Televisor(boolean stb) {
        standby = stb;
        standby = false;
    }

    void turnOn() {
        standby = true;
    }

    void turnOff() {
        standby = false;
    }

    void showStatus() {
        System.out.println("Tv status is?");
        if (standby == true) {
            System.out.println("online");
            ;
        } else if (standby == false) {
            System.out.println("offline");
        }

    }
}
