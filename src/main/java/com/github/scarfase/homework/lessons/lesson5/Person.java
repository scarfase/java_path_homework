package com.github.scarfase.homework.lessons.lesson5;
// ФИО, должность, email, телефон, зарплата, возраст
public class Person {
  private String fullName;
  private String jobTitle;
  private String email;
  private String phoneNumber;
  private int salary;
  private int age;

  public String getFullName() {
    return fullName;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public String getEmail() {
    return email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public int getSalary() {
    return salary;
  }

  public int getAge() {
    return age;
  }

  public Person(String fullName, String jobTitle, String email, String phoneNumber, int salary, int age) {
    this.fullName = fullName;
    this.jobTitle = jobTitle;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.salary = salary;
    this.age = age;
  }

  void getInfoAboutPerson() {
    System.out.printf("Info about person: %s\n" +
            "Job title is: %s\n" +
            "Email is: %s\n" +
            "Phone number is: %s\n" +
            "Salary is: %d\n" +
            "Age is: %d\n", this.fullName, this.jobTitle, this.email, this.phoneNumber, this.salary, this.age);
  }
}
