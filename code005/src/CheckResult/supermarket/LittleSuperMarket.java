package CheckResult.supermarket;

public class LittleSuperMarket {
    public String superMarketName;
    public String address;
    public int parkingCount;
    public double incomingSum;
    public Merchandise[] merchandises;
    public int[] merchandiseSold;

    //找出利润最高的商品
//    public Merchandise getBiggestProfitMerchandise() {
//        Merchandise curr = null;
//        for (int i = 0; i < merchandises.length; i++) {
//            Merchandise m = merchandises[i];
//            if (curr == null) {
//                curr = m;
//            }
//            else {
//                if (curr.calculateProfit() < m.calculateProfit()) {
//                    curr = m;
//                }
//            }
//        }
//        return curr;
//    }
}

