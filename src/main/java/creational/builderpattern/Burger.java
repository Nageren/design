package creational.builderpattern;

/**
 * @Author: mawenlei
 * @Date: 2018/7/23
 */
public abstract  class Burger implements  Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;
}
