package 设计模式.策略模式;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PromotionStrategyFactory {
    private PromotionStrategyFactory(){}

    private static Map<String , IPromotionStrategy> map = new HashMap<>();

    static {
        map.put(PromotionKey.COUPON , new CouponStrategy());
        map.put(PromotionKey.CASH , new CashBackStrategy());
        map.put(PromotionKey.GROUPBUY , new GroupBuyStrategy());
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy strategy = map.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASH = "CASH";
        String GROUPBUY = "GROUPBUY";

    }

    public static Set<String> getPromotionKeys(){
        return map.keySet();
    }
}
