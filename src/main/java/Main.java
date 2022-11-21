import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Product> list = new ArrayList<Product>(
                Arrays.asList(
                new Product("Mars", 2.0),
                new Product("Mars", 2.0),
                new Product("Twix", 3.0)
                )
        );

        Machine machine = new Machine(list);

        String key = "Mars";
        System.out.println(machine.getProductByName(key));

        List<Product> listBottle = new ArrayList<Product>(
                Arrays.asList(
                    new Bottle("Cola", 21.0, 1.0),
                    new Bottle("Cola", 25.0, 2.0),
                    new Bottle("Sprite", 31.0, 0.5),
                    new Bottle("Aqua", 12.0, 0.5)
                )
        );

        Machine bottleMachine = new BottleMachine(listBottle);

        String bottleKey = "Cola";
        System.out.println(bottleMachine.getProductByName(bottleKey));

        List<Product> listHotDrink = new ArrayList<Product>(
                Arrays.asList(
                    new HotDrink("Coffee", 12.0, 0.25, 85.0),
                    new HotDrink("Coffee", 15.0, 0.4, 85.0),
                    new HotDrink("Cacao", 10.0, 0.4, 90.0),
                    new HotDrink("Latte", 16.0, 0.2, 80.0),
                    new HotDrink("GlintWine", 25.0, 0.4, 75.0)
                )
        );

        Machine hotDrinkMachine = new HotDrinkMachine(listHotDrink);

        String hotDrinkKey = "Coffee";
        System.out.println(hotDrinkMachine.getProductByName(hotDrinkKey));
    }
}
