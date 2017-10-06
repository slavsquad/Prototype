package com.company.Shapes;

import java.awt.*;

public abstract class Shape {
    public int startX;
    public int startY;
    public Color color;
    private int iha;

    public Shape(){

    }

    public Shape(Shape target){
        if(target!=null){
            startX = target.startX;
            startY = target.startY;
            color = target.color;
        }
    }

    @Override
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Shape)) return false;
        Shape shape2 = (Shape)obj2;
        return shape2.startX == this.startX
                && shape2.startY == this.startY
                && shape2.color.equals(this.color);
    }

    public abstract Shape clone ();
}
