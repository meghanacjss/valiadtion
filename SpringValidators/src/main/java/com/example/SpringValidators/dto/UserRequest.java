package com.example.SpringValidators.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    //private int userId;
 @NotNull(message = "username should not be null")
 @NotBlank(message ="name can't be blank")
    private String name;
 @Email(message ="invalid email id")
    private String email;

 @Pattern(regexp = "^\\d{10}$",message="invalid mobile number entered")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getMobile() {
  return mobile;
 }

 public void setMobile(String mobile) {
  this.mobile = mobile;
 }

 public String getGender() {
  return gender;
 }

 public void setGender(String gender) {
  this.gender = gender;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public String getNationality() {
  return nationality;
 }

 public void setNationality(String nationality) {
  this.nationality = nationality;
 }
}
