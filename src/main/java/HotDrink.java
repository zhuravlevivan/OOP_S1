public class HotDrink extends Bottle{
    private Double temp;

    public HotDrink(String name, Double cost, Double volume, Double temp) {
        super(name, cost, volume);
        this.temp = temp;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink: {" +
                "name = '" + super.getName() + '\'' +
                ", cost = " + super.getCost() + '\'' +
                ", volume = " + super.getVolume() + '\'' +
                ", temp = " + temp +
                '}';
    }
}
