package ru.stqa.ptt.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptt.addressbook.model.ContactData;
import ru.stqa.ptt.addressbook.tests.TestBase;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion(){
    app.getNavigationHelper().gotoHomepage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoContactCreationPage();
      app.getContactHelper().createContact(new ContactData("Иван", "Иванов", "Почтовый адрес", "+79123456789", "ivanov@test1.ru", null, "Test1"), true);
      app.getNavigationHelper().gotoHomepage();
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().submitContactDeletion();
    app.getNavigationHelper().gotoHomepage();
  }

}
