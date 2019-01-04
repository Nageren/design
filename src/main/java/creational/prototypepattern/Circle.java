package creational.prototypepattern;

/**
 * @Author: mawenlei
 * @Date: 2018/8/7
 */
public class Circle extends Shape{

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
