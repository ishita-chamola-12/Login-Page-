package com.example.BackendLogin.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_details",
        uniqueConstraints ={
                @UniqueConstraint(columnNames = "username")})
@Data

public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long user_id;

    @Column(name="username", unique = true)
    private String username;

    @Column(name="password")
    private String password;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="user_role",
            joinColumns = {@JoinColumn(name="user_id")},
            inverseJoinColumns = {@JoinColumn(name="role_id")}
    )
    private Set<Role> roles = new HashSet<>();

    // constructor for only two args
    public User(String username,String password){
        this.username=username;
        this.password=password;
    }
}
