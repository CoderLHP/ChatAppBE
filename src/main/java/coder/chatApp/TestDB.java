package coder.chatApp;




import java.util.List;

import org.hibernate.Session;


import coder.entities.*;
import coder.connectionDB.HibernateUtils;

public class TestDB {
    public static Session session;
    public static void main(String args[]) {
        try {
            session = (Session) HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            
            User user = new User();
            user.setUsername("username");
            user.setPassword("password");
            user.setStatus("status");
            session.save(user);

            Role role = new Role();
            role.setRoleName("roleName");
            session.save(role);

            UserRole userRole = new UserRole();
            userRole.setRole(role);
            userRole.setUser(user);
            session.save(userRole);

            session.getTransaction().commit();
        } catch (Exception e) {
            //TODO: handle exception
            //session.getTransaction().rollback();
        }
    }
}
