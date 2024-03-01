package com.example.SpringValidators.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_table")
@Data
@NoArgsConstructor
//@AllArgsConstructor(staticName = "build")
public class User {
    @Id
    @GeneratedValue
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;

    public User(int userId, String name, String email, String mobile, String gender, int age, String nationality) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public static User build(int id, String name, String email, String mobile, String gender, int age, String nationality) {
        return new User(id,name,email,mobile,gender,age,nationality);
    }
}
