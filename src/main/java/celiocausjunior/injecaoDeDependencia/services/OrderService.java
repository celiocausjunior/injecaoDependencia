package celiocausjunior.injecaoDeDependencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import celiocausjunior.injecaoDeDependencia.models.OrderModel;


@Service
public class OrderService {
    @Autowired
    private ShipmentService shipmentService;
    
    public Double total(OrderModel order){
        return order.getBasic() * (100 - order.getDiscount()) / 100 + shipmentService.shipment(order);
    }
}
