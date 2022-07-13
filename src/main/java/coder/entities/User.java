package coder.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table (name = "user")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "userId", length = 8)
    private int userId;

    @Column (name = "username", length = 255)
    private String username;

    @Column (name = "password", length = 255)
    private String password;

    @Column (name = "status")
    private String status;
}
