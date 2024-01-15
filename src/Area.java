public class Area {

    private Punto p1;
    private Punto p2;
    private Punto p3;
    private int id;

    public Area(Punto p1, Punto p2, Punto p3, int id) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Area {" +
                "p1=" + p1 +
                ", p2=" + p2 +
                ", p3=" + p3 +
                ", id=" + id +
                '}';
    }
}
