package models;

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
        @Column(name = "profile_picture")
        private byte[] pictureProfile;
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
            return this.id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getUsername() {
            return this.username;
        }

        public void setUsername(String username) {
            if(this.username.length() < 4 || this.username.length() > 30){
                throw new IllegalArgumentException("Username length is incorrect");
            }
            this.username = username;
        }

        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            if(this.password.length() < 6 || this.password.length() > 50){
                throw new IllegalArgumentException("Password length is incorrect");
            }
            if(!this.password.matches("[a-z]")){
                throw new IllegalArgumentException("password should contain lowercase letters");
            }
            if(!this.password.matches("[A-Z]")){
                throw new IllegalArgumentException("password should contain uppercase letters");
            }
            if(!this.password.matches("[0-9]")){
                throw new IllegalArgumentException("password should contain number");
            }
            this.password = password;
        }

        public String getEmail() {
            return this.email;
        }

        public void setEmail(String email) {

            this.email = email;
        }

        public byte[] getPictureProfile() {
            return this.pictureProfile;
        }

        public void setPictureProfile(byte[] pictureProfile) {
            int oneMb = 1024;
            if(this.pictureProfile.length < oneMb){
                throw new IllegalArgumentException("Profile pictures is too large");
            }
            this.pictureProfile = pictureProfile;
        }

        public Date getRegistrationDate() {
            return this.registrationDate;
        }

        public void setRegistrationDate(Date registrationDate) {
            this.registrationDate = registrationDate;
        }

        public Date getLastTimeLogIn() {
            return this.lastTimeLogIn;
        }

        public void setLastTimeLogIn(Date lastTimeLogIn) {
            this.lastTimeLogIn = lastTimeLogIn;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isDeleted() {
            return this.isDeleted;
        }

        public void setDeleted(boolean deleted) {
            isDeleted = deleted;
        }
    }
