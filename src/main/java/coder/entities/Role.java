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
@Table (name = "role")
public class Role {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "roleId")
    private int roleId;

    @Column (name = "roleName", length = 255)
    private String roleName;
}
