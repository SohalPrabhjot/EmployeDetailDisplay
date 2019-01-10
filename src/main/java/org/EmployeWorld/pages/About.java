package org.EmployeWorld.pages;

import org.EmployeWorld.components.Layout;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.PageActivationContext;
public class About
{
 // @InjectPage
  //private Layout layout;

  @PageActivationContext
  private String learn;


  public String getLearn() {
    return learn;
  }

  public void setLearn(String learn) {
    this.learn = learn;
  }
}
