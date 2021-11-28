package com.zym.principle.ocp.improve;

/**
 * 开闭原则
 * @author zhouyumeng
 * @date 2021/11/28
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circular());
        graphicEditor.drawShape(new Triangle());
    }

    static class GraphicEditor{

        public void drawShape(Shape shape) {
            shape.draw();
        }
    }

    static abstract class Shape{
        int type;

        abstract void draw();
    }

    static class Circular extends Shape{

        public Circular() {
            super.type = 1;
        }

        @Override
        void draw() {
            System.out.println(" 绘制圆形");
        }
    }

    static class Rectangle extends Shape{

        public Rectangle() {
            super.type = 2;
        }

        @Override
        void draw() {
            System.out.println(" 绘制矩形");
        }
    }

    static class Triangle extends Shape{

        public Triangle() {
            super.type = 3;
        }

        @Override
        void draw() {
            System.out.println(" 绘制三角形");
        }
    }
}
