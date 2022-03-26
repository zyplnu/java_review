package 设计模式.策略模式;

import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Set<String> promotionKeys = PromotionStrategyFactory.getPromotionKeys();
        String promotionKey = "COUPON";

        IPromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(promotionKey);
        promotionStrategy.doPromotion();
    }
}
