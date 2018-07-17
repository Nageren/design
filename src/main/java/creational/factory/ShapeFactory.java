package creational.factory;

import java.util.Objects;

/**
 * @Author: mawenlei
 * @Date: 2018/7/17
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if(Objects.isNull(shapeType)){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

}
