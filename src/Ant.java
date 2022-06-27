public class Ant {
    private double x;
    private double y;

    public Ant() {
        x = 0;
        y = 0;
    }
    public Ant(double xin, double yin) {
        x = xin;
        y = yin;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double xin) { x = xin; }
    public void setY(double yin) { y = yin; }
    public void moveLeft() { x--; }
    public void moveRight() { x++;}
    public void moveUp() { y++;}
    public void moveDown() { y--;}
}
