package com.rcloud.erp.service;

import com.rcloud.erp.dao.UserDAO;
import com.rcloud.erp.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource(type = UserDAO.class)
    private UserDAO userDAO;

    public UserDAO getUserDAO() {
        return this.userDAO;
    }



    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void addUser(User user){
        this.getUserDAO().addUser(user);
    }
}
