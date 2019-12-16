public class TriangleSquare {
    public static void main(String[] args) {
        double x1 = -5;
        double y1 = 0;
        double x2 = 7;
        double y2 = -9;
        double x3 = 11;
        double y3 = 13;

        double square = Math.abs((x1-x3)*(y2-y3) - (y1-y3)*(x2-x3));
        System.out.println("Площадь равна " + square);
    }
}
