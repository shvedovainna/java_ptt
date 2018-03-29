package ru.stqa.ptt.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.ptt.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().gotoHomepage();
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoContactCreationPage();
      app.getContactHelper().createContact(new ContactData("Иван", "Иванов", "Почтовый адрес", "+79123456789", "ivanov@test1.ru", null, "Test1"), true);
      app.getNavigationHelper().gotoHomepage();
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Иван", "Иванов", "Почтовый адрес", "+79123456789", "ivanov@test1.ru", "Адрес регистрации", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomepage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);
  }
}
