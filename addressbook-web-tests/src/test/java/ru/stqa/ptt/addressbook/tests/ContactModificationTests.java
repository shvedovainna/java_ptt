package ru.stqa.ptt.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.ptt.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().gotoHomepage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Иван", "Иванов", "Почтовый адрес", "+79123456789", "ivanov@test1.ru", "Адрес регистрации"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().gotoHomepage();

  }
}
