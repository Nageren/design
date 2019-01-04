package creational.builderpattern;

/**
 * @Author: mawenlei
 * @Date: 2018/7/23
 */
public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
