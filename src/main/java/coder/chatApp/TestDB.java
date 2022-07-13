package coder.chatApp;




import java.util.List;

import org.hibernate.Session;


import coder.entities.*;
import coder.connectionDB.HibernateUtils;

public class TestDB {
    public static void main(String args[]) {
        try {
            var session = (Session) HibernateUtils.getSessionFactory().openSession();
            session.beginTransaction();
            List<User> users = session.createQuery("FROM User", User.class).list();
            for (var user:users) session.delete(user);
            User user = new User();
            user.setUsername("chung");
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
        }
    }
}
