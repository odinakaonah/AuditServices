package jumia.pay.service;

import jumia.pay.enums.Actions;
import jumia.pay.interfaces.Auditable;
import jumia.pay.interfaces.OrderService;
import jumia.pay.model.Product;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Auditable(actionType = Actions.ORDER)
    public String order(List<Product> products, String auditorEmail) {
        return null;
    }
    @Auditable(actionType = Actions.CANCEL_ORDER)
    public String cancelOrder(String trackingNum, String auditorEmail) {
        return null;
    }
    @Auditable(actionType = Actions.CANCEL_CUSTOMER_ORDER)
    public String cancelCustomerOrder(String trackingNum, String auditorEmail) {
        return null;
    }

    @Auditable(actionType = Actions.SEARCH_TRACKING_ID)
    public String getByTrackingId(String trackingNum, String auditorEmail) {
        return null;
    }
}
