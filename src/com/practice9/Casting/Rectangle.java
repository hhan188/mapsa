package com.practice9.Casting;

public class Rectangle extends Shape
{
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    void shrink() {
        System.out.println("Shrinking rectangle...");
    }
}
