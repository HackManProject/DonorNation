package com.example.donornation;


public class Donors {
    String donorID;
    String name;
    String age;
    String gender;
    String bloodGroup;
    String city;
    String contactNo;
    public Donors() {


    }

    public Donors(String donorID, String name, String age, String gender, String bloodGroup, String city, String contactNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.contactNo = contactNo;
    }

    public String getDonorID() {
        return donorID;
    }
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getCity() {
        return city;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setDonorID(String donorID) {
        this.donorID = donorID;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
