package question5;

import java.util.HashMap;
import java.util.Map;

public class PointsStore {
    Map<String, Integer> store = new HashMap<>();

    public PointsStore() {
        Goods good1 = new Goods("手办", 20);
        store.put(good1.getName(), good1.getPrice());
        Goods good2 = new Goods("漫画", 1);
        store.put(good2.getName(), good1.getPrice());
    }
}
