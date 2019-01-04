package creational.builderpattern;

/**
 * @Author: mawenlei
 * @Date: 2018/7/23
 */
public class ChickenBurger extends  Burger{

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
