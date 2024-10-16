package com.phorscode.user.service.notification_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @GetMapping(value="/{notificationId}")
    public Notifications findAll(@PathVariable("notificationId") String notificationId){
        return new Notifications(notificationId, "Notification Details of " + notificationId);
        // return null;
    }
}
