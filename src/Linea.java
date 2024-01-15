public class Linea {

    private Punto p1;
    private Punto p2;
    private int id;

    public Linea(Punto p1, Punto p2, int id) {
        this.p1 = p1;
        this.p2 = p2;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Linea {" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", id=" + id +
                '}';
    }
}
