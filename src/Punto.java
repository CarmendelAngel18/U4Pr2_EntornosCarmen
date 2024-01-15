public class Punto {

    private int x;
    private int y;
    private int id;

    public Punto(int x, int y, int id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Punto {" +
                "x=" + x +
                ", y=" + y +
                ", id=" + id +
                '}';
    }
}
