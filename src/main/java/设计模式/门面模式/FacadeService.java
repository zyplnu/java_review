package 设计模式.门面模式;

public class FacadeService {
    private QualityService qualityService = new QualityService();
    private PaymentService paymentService = new PaymentService();
    private ShippingService shippingService = new ShippingService();

    public void exchange(GiftInfo giftInfo){
        if(qualityService.isAvailable(giftInfo)){
            if(paymentService.pay(giftInfo)){
                shippingService.delivery(giftInfo);
            }
        }
    }

}
