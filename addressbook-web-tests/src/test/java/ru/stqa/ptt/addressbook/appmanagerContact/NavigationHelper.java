package ru.stqa.ptt.addressbook.appmanagerContact;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {
  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void gotoContactPage() {
    wd.findElement(By.linkText("add new")).click();
  }
}
