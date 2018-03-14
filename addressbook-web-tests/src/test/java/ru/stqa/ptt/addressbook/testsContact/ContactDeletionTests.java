package ru.stqa.ptt.addressbook.testsContact;

import org.testng.annotations.Test;

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
