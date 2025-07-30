import java.util.List;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburguesa = new Builder().withBread("integral")
                .withMeat("res")
                .withCheese(true)
                .withVegetables(List.of("tomate", "lechuga"))
                .withSauces(List.of("mostaza"))
                .build();

        Hamburger hamburguesa2 = new Builder().withBread("centeno")
                .withMeat("pollo")
                .withCheese(true)
                .withSauces(List.of("habanero"))
                .build();

        System.out.println(hamburguesa.toString());

        System.out.println("========================");

        System.out.println(hamburguesa2.toString());

    }
}