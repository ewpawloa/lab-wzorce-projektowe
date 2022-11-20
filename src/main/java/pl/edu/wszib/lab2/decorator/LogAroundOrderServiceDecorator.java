package pl.edu.wszib.lab2.decorator;

import java.util.logging.Logger;

public class LogAroundOrderServiceDecorator implements OrderService {
    private final OrderService orderService;
    private final Logger log = Logger.getLogger(LogAroundOrderServiceDecorator.class.getName());

    public LogAroundOrderServiceDecorator(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public Integer handle(String name) {
        log.info("handle method called with args[name=" + name + "]");
        Integer result = orderService.handle(name);
        log.info("handle method finished with result=" + result);
        return result;
    }
}
