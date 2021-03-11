package com.Application;

public class ApplicationLogin implements IApplication{

    public static String username;
    @Override
    public void login(String username, String password) {
        if(username.equalsIgnoreCase("Thilak") && password.equalsIgnoreCase("thilak14")) {
            System.out.println("welcome " + username);
            setUserName(username);
        }
        else {
            System.out.println("Invalid User !!!!");
            System.exit(0);
        }
    }
    public void setUserName(String username)
    {
        this.username=username;
    }
    public String getUserName()
    {
        return username;
    }
}
