package com.company;

import com.company.Shapes.Circle;
import com.company.Shapes.Line;
import com.company.Shapes.Shape;
import com.company.Shapes.Point;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.startX = 10;
        circle.startY = 20;
        circle.radius = 15;
        circle.color = Color.RED;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Line line = new Line();
        line.endX = 10;
        line.endY = 20;
        line.color = Color.WHITE;
        shapes.add(line);

        cloneAndCompare(shapes, shapesCopy);

    }

    static public void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy){
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
         //   shapesCopy.add(shape); //если просто копировать, скопируется только ссылка на объекты
        }

        shapesCopy.get(2).color=Color.BLACK;//Изменяем цвет для того чтобы показать, что клонированные объекты не зависимы друг от друга
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Фигуры разные объекты");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": и они идентичны!");
                } else {
                    System.out.println(i + ": но они не идентичны!");
                }
            } else {
                System.out.println(i + ": Фигуры один и тоже объект!");
            }
        }
    }
}
