
package maze;

public class Cell {
    public static char EMPTY_VAL = '0', BLOCKED ='1';
    int x, y;
    char value;
    boolean visited = false;
    Cell previous = null;

    public Cell(int x, int y, char value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }
    public boolean canMoveto(){
        return (visited ==false && value != BLOCKED);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + value + ')';
    }
    
}
