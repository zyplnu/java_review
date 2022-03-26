package 设计模式.策略模式;

public class PromotionContext {
    private IPromotionStrategy strategy;

    public PromotionContext(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doPromotion();
    }
}
