package coder.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "userrole")
public class UserRole {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "userRoleId")
    private int userRoleId;

    @ManyToOne
    @JoinColumn (name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn (name = "roleId")
    private Role role;
}
