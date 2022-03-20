package 设计模式.门面模式;

public class Test {
    public static void main(String[] args) {
        GiftInfo giftInfo = new GiftInfo("spring");
        FacadeService facadeService = new FacadeService();
        facadeService.exchange(giftInfo);
    }
}
