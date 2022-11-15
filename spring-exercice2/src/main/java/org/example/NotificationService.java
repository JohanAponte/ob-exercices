package org.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    private UserService userService;

    public NotificationService(UserService userServiceAtt) {
        this.userService = userServiceAtt;
    }

    @Override
    public String toString() {
        return "NotificationService{" +
                "userService=" + userService +
                '}';
    }
}
