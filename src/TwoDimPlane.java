import java.util.ArrayList;

public class TwoDimPlane {
    public static void main(String[] args) {
        int n = 8;  // 8 x 8 grid

        // Window size in pixels
        StdDraw.setCanvasSize(500, 500);
        // Make the x and y axis go from -5.1 to 5.1
        StdDraw.setScale(-5.1, 5.1);

        // Select pen color blue (default is black)
        StdDraw.setPenColor(StdDraw.BLUE);
        // Draw the x and y axis
        StdDraw.line(-5, 0, 5, 0);
        StdDraw.line(0, -5, 0, 5);

        // Change back to black pen color
        StdDraw.setPenColor();

        // Make tick marks
        for (int i = -5; i <= 5; i++) {
            StdDraw.text(i, 0-0.2, "" + i);
            StdDraw.text(0-0.1, i, "" + i);
        }

        // Choose pen color red
        StdDraw.setPenColor(StdDraw.RED);

        ArrayList<Double> xlist = new ArrayList<Double>();
        ArrayList<Double> ylist = new ArrayList<Double>();

        double x, y;
        // Plot a quadratic function: y = x^2 - 4
        for (x = -4.5; x <= 4.5; x+=0.05) {
            y = x * x - 4;
            xlist.add(x);
            ylist.add(y);
            StdDraw.circle(x, y, 0.03);
        }

        // Choose pen color green
        StdDraw.setPenColor(StdDraw.GREEN);

        // Shift the function by constant 3
        for (int i = 0; i < xlist.size(); i++) {
            StdDraw.circle(xlist.get(i), -(ylist.get(i) + 3), 0.03);
        }
    }
}
