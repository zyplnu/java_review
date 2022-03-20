package 设计模式.门面模式;

public class ShippingService {
    public String delivery(GiftInfo giftInfo){
        System.out.println(giftInfo.getName() + "进入物流系统");
        String shipping = "666";
        return shipping;
    }
}
