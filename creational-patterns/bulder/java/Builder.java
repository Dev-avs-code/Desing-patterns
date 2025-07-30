import java.util.ArrayList;
import java.util.List;

public class Builder {
    private String typeBread;
    private String typeMeat;
    private boolean cheese;
    private List<String> vegetables = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();

    public Builder withBread(String typeBread){
        this.typeBread = typeBread;
        return this;
    }

    public Builder withMeat(String typeMeat){
        this.typeMeat = typeMeat;
        return this;
    }

    public Builder withCheese(boolean cheese){
        this.cheese = cheese;
        return this;
    }

    public Builder withVegetables(List<String> vegetables){
        this.vegetables = vegetables;
        return this;
    }

    public Builder withSauces(List<String> sauces){
        this.sauces = sauces;
        return this;
    }

    public Hamburger build(){
        return new Hamburger(this.typeBread, this.typeMeat, this.cheese, this.vegetables, this.sauces);
    }
}

