package creational.abstractfactory;

/**
 * @Author: mawenlei
 * @Date: 2018/7/20
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
