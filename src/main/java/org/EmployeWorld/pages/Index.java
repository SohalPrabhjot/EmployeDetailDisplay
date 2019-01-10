package org.EmployeWorld.pages;

import org.EmployeWorld.components.Layout;
import org.EmployeWorld.services.UserAuthentication;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;


public class Index {

  //@InjectPage
 // private Layout layout;

  @Property
  private String userName;

  @Property
  private String password;

  @Inject
  private UserAuthentication authenticator;

  @InjectComponent("password")
  private PasswordField passwordField;

  @Inject
  private Messages messages;
  @Component
  private Form loginForm;

  @InjectPage
private EmployDisplay employDisplay ;
  /**
   * Do the cross-field validation
   */
  void onValidateFromloginForm() {
    if (!authenticator.isValid(userName, password)) {
      // record an error, and thereby prevent Tapestry from emitting a "success" event
      loginForm.recordError(passwordField, messages.get("error"));
      // }
    }
  }


    /**
     * Validation passed, so we'll go to the "PostLogin" page
     */
    Object onSuccessFromLoginForm()
    {
      return employDisplay;
    }

  }
  //}



  /**
   * Validation passed, so we'll go to the "PostLogin" page
   */



