/*
 Brief drawing code developed in class
 June 15
 */
public class Shapes {
    public static void main(String[] args) {

        StdDraw.setCanvasSize(500,500);

        StdDraw.setScale(-5, 5);

        StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);

        // change pen color to red
        StdDraw.setPenColor(StdDraw.RED);

        StdDraw.filledCircle(0.25, 0.75, .5);

    }
}
