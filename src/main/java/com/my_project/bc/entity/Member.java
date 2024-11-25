package com.my_project.bc.entity;

import com.my_project.bc.entity.role.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String loginId;

    private String password;

    private String phoneNumber;

    private String email;

    private Role role;

    @OneToMany
    private List<Post> postList = new ArrayList<>();

//    private Address address;
}
