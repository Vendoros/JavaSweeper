package sweeper;

public class Coord {

    public final int x;
    public final int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Coord){

            Coord to  = (Coord) o;
            return to.x == x && to.y ==y;
        }
        return super.equals(o);
    }
}
