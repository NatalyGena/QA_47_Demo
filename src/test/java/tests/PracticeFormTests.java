package tests;

import dto.Student;
import enums.Gender;
import enums.Hobbies;
import enums.StateCity;
import manager.AppManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTests extends AppManager {
    @Test
    public void studentRegFormPositiveTest() {
        List<Hobbies> hobbies= new ArrayList<>();
        hobbies.add(Hobbies.MUSIC);
        hobbies.add(Hobbies.SPORTS);
        Student student = new Student("Nataly", "Gena", "genashvili@yahoo.com",
                Gender.FEMALE, "0523378148", "10 Nov 1981",
                "Maths,Physics,Chemistry", hobbies,
                "", "Sokolov 30", StateCity.RAJASTHAN.getState(),
                StateCity.RAJASTHAN.getCity()[0]);
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);
        Assert.assertTrue(new PracticeFormPage(getDriver()).validateModalMessage());
    }
}