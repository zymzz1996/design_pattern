package com.zym.principle.ocp;

/**
 * 错误示范
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
            shape.draw(shape);
        }
    }

    static class Shape{
        int type;

        public void draw(Shape shape) {
            if (shape.type == 1) {
                Circular circular = (Circular) shape;
                circular.drawCircular();
            } else if (shape.type == 2) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.drawRectangle();
            } else if (shape.type == 3) {
                Triangle triangle = (Triangle) shape;
                triangle.drawTriangle();
            }
        }
    }

    static class Circular extends Shape{

        public Circular() {
            super.type = 1;
        }

        public void drawCircular() {
            System.out.println(" 绘制圆形");
        }
    }

    static class Rectangle extends Shape{

        public Rectangle() {
            super.type = 2;
        }

        public void drawRectangle() {
            System.out.println(" 绘制矩形");
        }
    }

    static class Triangle extends Shape{
        public Triangle() {
            super.type = 3;
        }

        public void drawTriangle() {
            System.out.println(" 绘制三角形");
        }
    }
}
