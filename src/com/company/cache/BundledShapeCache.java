package com.company.cache;




import com.company.Shapes.Circle;
import com.company.Shapes.Line;
import com.company.Shapes.Shape;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.startX = 5;
        circle.startY = 7;
        circle.radius = 45;
        circle.color = Color.RED;

        Line line = new Line();
        line.startX = 6;
        line.startY = 9;
        line.endX = 8;
        line.endY = 10;
        line.color = Color.BLUE;

        cache.put("Big green circle", circle);
        cache.put("Medium blue line", line);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}