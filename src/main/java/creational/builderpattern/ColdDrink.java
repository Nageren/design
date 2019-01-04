package creational.builderpattern;

/**
 * @Author: mawenlei
 * @Date: 2018/7/23
 */
public abstract class ColdDrink  implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
