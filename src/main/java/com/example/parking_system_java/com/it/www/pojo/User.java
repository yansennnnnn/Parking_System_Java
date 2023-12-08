package com.example.parking_system_java.com.it.www.pojo;

public class User {
    private int userId;

    private String userName;

    private String userPassword;

    private int role;

    private String userEmail;

    private String userPhone;

    private int carId;

    private String userPicture;

    public User(String userName) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.role = role;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.carId = carId;
        this.userPicture = userPicture;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", role=" + role +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", carId=" + carId +
                ", userPicture='" + userPicture + '\'' +
                '}';
    }

}
