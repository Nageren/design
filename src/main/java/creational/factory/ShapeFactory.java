package creational.factory;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/**
 * @Author: mawenlei
 * @Date: 2018/7/17
 */
public class ShapeFactory {
//    public static Object getClass(Class<?extends Shape> clazz) {
//        Object obj = null;
//
//        try {
//            obj = Class.forName(clazz.getName()).newInstance();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        return obj;
//    }
//




// 在jdk9中直接使用泛型的newInstance方法已经过时。重写的getClass()方法如下：
//    public <T> T getClass(Class<? extends T> clazz) {
//        T obj = null;
//        try {
//            obj = clazz.getDeclaredConstructor().newInstance();
//        }
//        catch (ReflectiveOperationException e) {
//            e.printStackTrace();
//        }
//        return obj;
//    }

    public static <T> T getClass(Class<? extends T> clazz) {
        T obj = null;
        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return obj;
    }

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


    public static Shape getShape2(String type) {
        try {
            return (Shape) Class.forName(type).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
