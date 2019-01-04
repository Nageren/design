package creational.prototypepattern;

/**
 * @Author: mawenlei
 * @Date: 2018/8/7
 */
public class Rectangle extends Shape{

    public Rectangle(){
        type = "Rectangle";
    }


    /**
     * 抽象方法
     */
    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
