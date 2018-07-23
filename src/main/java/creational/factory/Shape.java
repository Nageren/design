package creational.factory;

/**
 * @Author: mawenlei
 * @Date: 2018/7/17
 */
public interface Shape {

    static String SHAPE_CIRCLE = Circle.class.getName();
    static String SHAPE_SQUARE = Square.class.getName();
    static String SHAPE_RECTANGLE = Rectangle.class.getName();
    void draw();
}
