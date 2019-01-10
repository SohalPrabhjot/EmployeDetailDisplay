package org.EmployeWorld.services;

public class UserAuthenticationImpl implements UserAuthentication {


    public boolean isValid(String userName, String password) {

        if (userName.equals("john") && password.equals("john")) {
            return true;
        } else {
            return false;
        }
    }
            }
