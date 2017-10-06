package com.company.Shapes;

public class Line extends Shape {
    public int endX;
    public int endY;

    public Line(){

    }

    public Line(Line target){
        super(target);
        if (target!=null){
            endX = target.endX;
            endY = target.endY;
        }

    }
    @Override
    public Shape clone() {
        return new Line(this);
    }

    @Override
    public boolean equals(Object obj2) {
        if(!(obj2 instanceof Line) || !super.equals(obj2)) return false;
        Line shape2 = (Line)obj2;
        return shape2.endX == endX && shape2.endY == endY;
    }
}
