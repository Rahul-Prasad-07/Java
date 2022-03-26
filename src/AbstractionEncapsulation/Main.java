package AbstractionEncapsulation;

  public class Main {
    public static float radius = 10.0f;
      public static float length = 20.0f;
    public static void main(String[] a){
        System.out.println(Circle.area(radius));
        System.out.println(Square.area(length));
    }
 }

 class Circle{
    public static float area(float radius){
        return 3.141f * radius * radius;
    }

 }
class Square{
    public static float area(float length){
        return length*length;
    }

}

