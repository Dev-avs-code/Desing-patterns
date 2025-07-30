import java.util.List;

public class Hamburger {
    private String typeBread;
    private String typeMeat;
    private boolean cheese;
    private List<String> vegetables;
    private List<String> sauces;

    public Hamburger(String typeBread, String typeMeat, boolean cheese, List<String> vegetables, List<String> sauces) {
        this.typeBread = typeBread;
        this.typeMeat = typeMeat;
        this.cheese = cheese;
        this.vegetables = vegetables;
        this.sauces = sauces;
    }

    public String getTypeBread() {
        return typeBread;
    }

    public String getTypeMeat() {
        return typeMeat;
    }

    public boolean isCheese() {
        return cheese;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public List<String> getSauces() {
        return sauces;
    }


    @Override
    public String toString() {
        return "Hamburger{" +
                "typeBread='" + typeBread + '\'' +
                ", typeMeat='" + typeMeat + '\'' +
                ", cheese=" + cheese +
                ", vegetables=" + vegetables +
                ", sauces=" + sauces +
                '}';
    }
}
