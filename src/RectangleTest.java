public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        System.out.println(rectangle);
        rectangle =new Rectangle(2.4,5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5,3.8,"orangeg",false);
        System.out.println(rectangle);
    }
}
