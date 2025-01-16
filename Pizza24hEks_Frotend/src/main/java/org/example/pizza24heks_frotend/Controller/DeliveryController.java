package org.example.pizza24heks_frotend.Controller;

import org.example.pizza24heks_frotend.Client.DeliveryClient;
import org.example.pizza24heks_frotend.Model.Delivery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class DeliveryController {

    private final DeliveryClient deliveryClient;

    public DeliveryController(DeliveryClient deliveryClient) {
        this.deliveryClient = deliveryClient;
    }
    @GetMapping("/deliveries")
    public String getDeliveries(Model model) {

        List<Delivery> deliveries = deliveryClient.getDeliveries();

        model.addAttribute("deliveries", deliveries);
        return "deliveries";
    }
    @PostMapping("/deliveries/schedule")
    public String scheduleDelivery(Long delivery_id) {

        deliveryClient.scheduleDelivery(delivery_id);
        return "redirect:/deliveries";
    }
    @PostMapping("/drones/add")
    public String dronesAdd(){
        deliveryClient.addDrone();
        return "redirect:/deliveries";
    }
    @PostMapping("/deliveries/add")
    public String addDelivery() {

        Random random = new Random();
        Long pizza_id = random.nextLong(1, 5);
        deliveryClient.addDelivery(pizza_id);
        return "redirect:/deliveries";
    }

}
