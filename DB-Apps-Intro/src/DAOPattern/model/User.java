package DAOPattern.model;

import java.util.Date;

public class User {
    private int id;
    private String name;
    private int age;
    private Date registrationDate;

    public User(int id,String name,int age,Date registrationDate){
        this.id = id;
        this.name = name;
        this.age = age;
        this.registrationDate = registrationDate;
    }

}
