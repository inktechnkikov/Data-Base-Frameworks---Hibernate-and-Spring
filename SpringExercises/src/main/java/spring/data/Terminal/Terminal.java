package spring.data.Terminal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.data.Models.User;
import spring.data.Services.UserService;

@Component
public class Terminal implements CommandLineRunner{
    private final UserService service;

    @Autowired
    public Terminal(UserService service) {
        this.service = service;
    }

    @Override
    public void run(String... strings) throws Exception {
            User user = new User();

            user.setUsername("Stamat");
            user.setPassword("pass");
            service.persist(user);
    }
}
