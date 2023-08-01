package MultiThreading;

public class DisplayNameThread  extends Thread{
    Display display;
    String name;

    DisplayNameThread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run() {
        display.wish(this.name);
    }
}
