package celiocausjunior.injecaoDeDependencia.services;

import celiocausjunior.injecaoDeDependencia.models.OrderModel;

public class OrderService {
    public Double total(OrderModel order){
        return order.getBasic() - order.getDiscount();
    }
}
