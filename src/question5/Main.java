package question5;

public class Main {
    public static void main(String[] args) {
        Students student = new Students(100);
        PointsStore pointsStore = new PointsStore();
        Seniors senior = new Seniors();

        senior.givePoints(student, 20);
        student.buy(pointsStore, "商品");
        student.buy(pointsStore, "手办");
    }
}
