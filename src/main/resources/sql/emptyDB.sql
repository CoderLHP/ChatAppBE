CREATE DATABASE ChatApp;

USE ChatApp;

CREATE TABLE user(
    userId INT(8) NOT NULL AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    status VARCHAR(255) NOT NULL,
    PRIMARY KEY(userId)
);

CREATE TABLE role(
    roleId INT(2) NOT NULL AUTO_INCREMENT,
    roleName VARCHAR(255) NOT NULL,
    PRIMARY KEY(roleId)
);

CREATE TABLE userRole(
    userRoleId INT(8) NOT NULL AUTO_INCREMENT,
    userId INT(8) NOT NULL, 
    roleId INT(2) NOT NULL,
    PRIMARY KEY(userRoleId),
    CONSTRAINT fk_userRole_user FOREIGN KEY (userId) REFERENCES user(userId) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_userRole_role FOREIGN KEY (roleId) REFERENCES role(roleId) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE message(
    messageId INT(8) NOT NULL AUTO_INCREMENT,
    userId INT(8),
    time DATETIME NOT NULL,
    content TEXT NOT NULL,
    PRIMARY KEY(messageId),
    CONSTRAINT fk_massage_user FOREIGN KEY (userId) REFERENCES user(userId) ON DELETE SET NULL ON UPDATE CASCADE
);

