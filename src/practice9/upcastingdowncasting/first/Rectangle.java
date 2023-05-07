package practice9.upcastingdowncasting.first;

import practice9.upcastingdowncasting.first.Shape;

class Rectangle extends Shape {
        void draw() {
            System.out.println("Drawing a rectangle");
        }

        void shrink() {
            System.out.println("Shrinking rectangle...");
        }
    }
