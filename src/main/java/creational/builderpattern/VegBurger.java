package creational.builderpattern;

/**
 * @Author: mawenlei
 * @Date: 2018/7/23
 */
public class VegBurger extends Burger{

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
