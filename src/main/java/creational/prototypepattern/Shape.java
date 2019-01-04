package creational.prototypepattern;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: mawenlei
 * @Date: 2018/8/7
 */
public abstract class Shape implements Cloneable {

    @Setter
    @Getter
    private String id;

    @Setter
    @Getter
    protected String type;

    /**
     * 抽象方法
     */
    abstract void draw();


    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
