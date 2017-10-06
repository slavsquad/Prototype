package com.company.Shapes;

public class Point implements Cloneable{
    public int x;
    public int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Point p = (Point)super.clone();
        return p;
    }

    @Override
    public String toString() {
        return String.format("x: %d, y: %d.",x,y);
    }
}
