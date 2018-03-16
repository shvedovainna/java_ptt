package ru.stqa.ptt.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptt.addressbook.tests.TestBase;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion(){
    app.getNavigationHelper().gotoHomepage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().submitContactDeletion();
    app.getNavigationHelper().gotoHomepage();
  }

}
