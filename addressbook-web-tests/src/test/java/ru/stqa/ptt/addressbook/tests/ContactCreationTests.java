package ru.stqa.ptt.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.ptt.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoContactPage();
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().fillContactForm(new ContactData("Иван", "Иванов", "Почтовый адрес", "+79123456789", "ivanov@test1.ru", null, "Test1"), true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToContactPage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before + 1);
  }

}
