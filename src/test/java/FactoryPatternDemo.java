import creational.factory.Circle;
import creational.factory.Shape;
import creational.factory.ShapeFactory;

/**
 * @Author: mawenlei
 * @Date: 2018/7/17
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Circle circle = (Circle) shapeFactory.getShape("CIRCLE");



    }
}
