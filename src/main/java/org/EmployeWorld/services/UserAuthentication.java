package org.EmployeWorld.services;

import org.EmployeWorld.pages.Index;

public interface UserAuthentication {
    //Index getLoggedUser();
    //boolean isLoggedIn();
    public boolean isValid(String userName, String password);

}
