package tests;

import dto.Student;
import enums.Gender;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTests extends AppManager {
    @Test
    public void studentRegFormPositiveTest() {
        Student student = new Student("Vasya", "Vasilev", "vasyavasilev@gmail.com",
                Gender.MALE, "0123456789", "23 Mar 2013",
                "Maths,Physics,Chemistry", "sport",
                "", "avenue 12", "NCB", "Holon");
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
    }
}