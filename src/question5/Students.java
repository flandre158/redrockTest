package question5;

public class Students {
    public Students(int points) {
        this.points = points;
    }

    private int points = 0;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void buy(PointsStore p, String name) {
        try {
            this.setPoints(this.getPoints() - p.store.get(name));
            System.out.println("购买" + name + "成功");
            System.out.println("您的余额为" + this.getPoints() + "积分");
        } catch (NullPointerException e) {
            System.out.println("您购买的商品不存在");
        }
    }
}
