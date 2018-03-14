package ru.stqa.ptt.addressbook.testsContact;

import org.testng.annotations.Test;
import ru.stqa.ptt.addressbook.modelContact.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoContactPage();
    app.getContactHelper().fillContactForm(new ContactData("Иван", "Иванов", "Почтовый адрес", "+79123456789", "ivanov@test1.ru", "Адрес регистрации"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
  }

}
