package creational.prototypepattern;

/**
 * @Author: mawenlei
 * @Date: 2018/8/7
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
