package com.examples.service;

import com.examples.bean.LoginBean;
import org.springframework.stereotype.Service;


@Service
public class LoginService
{
    public String validateUser(LoginBean loginBean)
    {
        String userName = loginBean.getUserName();
        String password = loginBean.getPassword();
        if(userName.equals("Zaynab") && password.equals("TestPassword"))
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }

}