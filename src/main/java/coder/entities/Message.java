package coder.entities;

import java.sql.Date;

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
@Table(name = "message")
public class Message {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "messageId")
    private int messageId;

    @ManyToOne
    @JoinColumn (name = "userId")
    private User user;

    @Column (name = "time")
    private Date time;

    @Column (name = "content")
    private String content;
}
