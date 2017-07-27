package Demo.terminal;

import Demo.models.User;
import Demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Terminal implements CommandLineRunner{

    private final UserService service;

    @Autowired
    public Terminal(UserService service){
        this.service = service;
    }

    @Override
    public void run(String... strings) throws Exception {
        User user = new User();
        user.setUsername("Pesho");
        user.setPassword("pesho123");
        user.setEmail("peshko@abv.bg");
        user.setAge(22);
        User user1 = new User();
        user1.setUsername("Stamat");
        user1.setPassword("stamat22");
        user1.setEmail("stamat@mail.bg");
        user1.setAge(26);
        User thirdUser = new User();
        thirdUser.setUsername("Trump");
        thirdUser.setAge(35);
        thirdUser.setEmail("trump@outlook.com");
        thirdUser.setPassword("trump2211");
        List<User> userList = new ArrayList<User>();
        userList.add(user);
        userList.add(user1);
        userList.add(thirdUser);
         service.multipleUsersPersist(userList);
    }
}
