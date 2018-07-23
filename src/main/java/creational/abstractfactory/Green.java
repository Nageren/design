package creational.abstractfactory;

/**
 * @Author: mawenlei
 * @Date: 2018/7/20
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
