package org.example.fullstackexample.domain;

import jakarta.persistence.*;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String employeeCode;

    @Override
    public String toString() {
        return "Employee{" +
                "id= " + id +
                ", name= " + name + '\'' +
                ", email= " + email + '\'' +
                ", jobTitle= " + jobTitle + '\'' +
                ", phone= " + phone + '\'' +
                ", imageUrl= " + imageUrl + '\'' +
                '}';
    }
}
