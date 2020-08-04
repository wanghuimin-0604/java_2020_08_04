package demomethod06;
//多态；让调用者不必关注对象的具体类型
class Shape{
    public void draw(){

    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        System.out.println("圆形");
    }
}
class Rectle extends Shape {
    @Override
    public void draw() {
        System.out.println("矩形");
    }
}
    public  class Demo07 {
        public static void main(String[] args) {
            //多态
            Shape shape1 = new Circle();
            Shape shape2 = new Rectle();
            shapeMap(shape1);
            shapeMap(shape2);
        }
        public static void shapeMap(Shape shape) {
            shape.draw();
        }

    }
