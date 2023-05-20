package zadanie5_2;

public class MovablePoint implements Movable{
    int x;
    int y;

    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return ("x = " + this.x + ", y = " + this.y);
    }

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }
}
