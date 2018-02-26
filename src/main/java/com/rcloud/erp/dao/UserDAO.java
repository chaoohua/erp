package com.rcloud.erp.dao;

import com.rcloud.erp.datasource.MyBatisConfig;
import com.rcloud.erp.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    @Autowired
    public MyBatisConfig dao;

    public MyBatisConfig getDao() {
        return this.dao;
    }

    public void setDao(MyBatisConfig dao) {
        this.dao = dao;
    }

    public void addUser(User user){
        SqlSessionFactory sqlSessionFactory  = this.getDao().sqlSessionFactoryBean();
        SqlSession session =sqlSessionFactory.openSession();
        session.insert("add",user);
        session.commit();
        session.close();
    }
}
