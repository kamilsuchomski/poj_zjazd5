package zadanie5_2;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint pointObj = new MovablePoint(5, 7);
        System.out.println("Values after creating object: " + pointObj.toString());

        pointObj.moveDown();
        pointObj.moveLeft();
        pointObj.moveDown();
        pointObj.moveUp();
        pointObj.moveRight();
        pointObj.moveRight();

        System.out.println("Values after calling some methods: " + pointObj.toString());
    }
}
