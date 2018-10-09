package online.aiks.zhen_yuan.controller;

import online.aiks.zhen_yuan.result.JsonResult;
import online.aiks.zhen_yuan.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/createOrder")
    public JsonResult createOrder() {
        return JsonResult.getJsonResult();
    }
}
