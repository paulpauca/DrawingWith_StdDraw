import java.util.Random;

public class SimAnt {
    public static void main(String[] args) {
        Ant[] ant_list = new Ant[3];
        int i;
        Random rand = new Random();
        int direction;

        // Creates three ant objects all at (0,0)
        for ( i = 0; i < ant_list.length; i++) {
            ant_list[i] = new Ant();
        }

        // Move the ants randomly
        for ( i = 0; i < ant_list.length; i++) {
            direction = rand.nextInt(4);
            if (direction == 0) {
                ant_list[i].moveUp();
            }
            else if (direction == 1) {
                ant_list[i].moveRight();
            }
            else if (direction == 2) {
                ant_list[i].moveDown();
            }
            else {
                ant_list[i].moveLeft();
            }
        }

        // Print current locations of the ants
        for (i = 0; i < ant_list.length; i++) {
            System.out.println("ant" + (i+1) + ": (" + ant_list[i].getX() +
                    ", " + ant_list[i].getY() + ")");
        }
    }
}
