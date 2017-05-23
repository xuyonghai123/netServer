package com.xuyh.netserver.common.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Thinkpad on 17/04/13.
 **/
public class DBTools {
    private static SqlSessionFactory sessionFactory;

    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis.cfg.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    static SqlSession getSession(){
        return sessionFactory.openSession();
    }

    public static void main(String[] args) {
        getSession();
    }
}
