package 设计模式.门面模式;

public class QualityService {
    public boolean isAvailable(GiftInfo giftInfo){
        System.out.println(giftInfo.getName() + "积分足够");
        return true;
    }
}
