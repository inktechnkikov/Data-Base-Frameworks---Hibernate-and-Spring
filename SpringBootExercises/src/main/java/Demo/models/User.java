package Demo.models;

import javax.persistence.*;
import java.util.Date;

    @Entity
    @Table(name = "users")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "username",nullable = false)
        private String username;
        @Column(name = "password",nullable = false)
        private String password;
        @Column(name = "email_address",nullable = false)
        private String email;
        @Column(name = "registration_date")
        private Date registrationDate;
        @Column(name = "last_time_logged_in")
        private Date lastTimeLogIn;
        @Column(name = "age")
        private int age;
        @Column(name = "is_deleted")
        private boolean isDeleted;

        public User(){

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Date getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(Date registrationDate) {
            this.registrationDate = registrationDate;
        }

        public Date getLastTimeLogIn() {
            return lastTimeLogIn;
        }

        public void setLastTimeLogIn(Date lastTimeLogIn) {
            this.lastTimeLogIn = lastTimeLogIn;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isDeleted() {
            return isDeleted;
        }

        public void setDeleted(boolean deleted) {
            isDeleted = deleted;
        }
    }
