package practices.practice22.entity;

import com.google.gson.Gson;

import java.sql.Date;
import java.time.LocalDate;

public class Person {
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private Integer age;
    private String gender;
    private LocalDate dateOfBirth;
    private String occupation;
    private String educationLevel;
    private String maritalStatus;
    private Double income;

    public Person(Integer id, String name, String email, String phoneNumber, int age, String gender, Date date, String occupation, String educationLevel, String maritalStatus, double income) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.educationLevel = educationLevel;
        this.maritalStatus = maritalStatus;
        this.income = income;
        this.occupation = occupation;

    }

    public Person(Integer id,
                  String name,
                  String email,
                  String phoneNumber,
                  Integer age,
                  String gender,
                  LocalDate dateOfBirth,
                  String educationLevel,
                  String maritalStatus,
                  Double income) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.educationLevel = educationLevel;
        this.maritalStatus = maritalStatus;
        this.income = income;
    }

    public Person(String name, String email, String phoneNumber
            , Integer age, String gender, LocalDate dateOfBirth
            , String educationLevel, String maritalStatus, Double income) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.educationLevel = educationLevel;
        this.maritalStatus = maritalStatus;
        this.income = income;
    }

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Person setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Person setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Person setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public Person setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public Person setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public Double getIncome() {
        return income;
    }

    public Person setIncome(Double income) {
        this.income = income;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", occupation='" + occupation + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", income=" + income +
                '}';
    }
}
