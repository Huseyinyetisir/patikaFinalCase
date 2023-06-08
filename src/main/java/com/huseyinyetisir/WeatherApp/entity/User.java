package com.huseyinyetisir.WeatherApp.entity;

import com.huseyinyetisir.WeatherApp.general.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "users")
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    @GeneratedValue(generator = "User", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "User", sequenceName = "USER_ID_SEQ")
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "SURNAME", length = 100, nullable = false)
    private String surname;

    @NotBlank
    @Column(name = "USERNAME", length = 50, nullable = false,unique = true)
    private String username;

    @Email
    @Column(name = "EMAIL", length = 50,nullable = false,unique = true)
    private String email;

    @NotNull
    @NotBlank
    @Column(name = "PASSWORD", length = 100, nullable = false)
    private String password;

}
