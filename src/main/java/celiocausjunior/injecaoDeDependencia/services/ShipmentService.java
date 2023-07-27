package celiocausjunior.injecaoDeDependencia.services;

import celiocausjunior.injecaoDeDependencia.models.OrderModel;

public class ShipmentService {

    public Double shipment(OrderModel order) {
        if (order.getBasic() < 0) {
            throw new IllegalArgumentException("Basic must be greater than zero");
        } else
        if (order.getBasic() < 100) {
            return 20.00;
        } else if (order.getBasic() < 200) {
            return 12.00;
        } else {
            return 0.00;
        }
    }

}
