import java.awt.desktop.SystemSleepEvent;

public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600 && this.year < 1993) {
            System.out.println("This notebook is crap.");
        } else if (this.price < 1000 && this.year < 2010) {
            System.out.println("This notebook is quite ok.");
        } else {
            System.out.println("This notebook is damn good.");
        }
    }
    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This device light");
        } else if (this.weight <= 1000) {
            System.out.println("This device is quite heavy");
        } else {
            System.out.println("This device is fucking heavy");
        }
    }
}