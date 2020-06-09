
public class Goods {


    private int sellin;
    private int quality;

    public Goods(int sellin, int quality) {
        this.sellin = sellin;
        if (quality > 50) {
            this.quality = 50;
        } else if (quality < 0) {
            this.quality = 0;
        } else {
            this.quality = quality;
        }
    }

    public int getSellin() {
        return sellin;
    }

    public int getQuality() {
        return quality;
    }

    public void hold(int holdDays) {
        if (sellin > holdDays) {
            quality -= holdDays;
        } else {
            quality = quality - sellin - 2 * (holdDays - sellin);
        }

        if (sellin > holdDays) {
            sellin -= holdDays;
        } else {
            sellin = 0;
        }
    }
}
