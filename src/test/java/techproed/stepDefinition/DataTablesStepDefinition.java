package techproed.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.DataTablePage;

public class DataTablesStepDefinition {
    DataTablePage dataTablePage = new DataTablePage();
    @Then("kullanici sayfadaki tabloda new butonuna tiklar")
    public void kullaniciSayfadakiTablodaNewButonunaTiklar() {
        dataTablePage.newButton.click();
    }

    @And("kullanici bilgileri girer {string},{string},{string},{string},{string},{string},{string}")
    public void kullaniciBilgileriGirer(String name, String lastname, String position, String office, String extention, String date, String salary) {
        dataTablePage.firstName.sendKeys(name, Keys.TAB,lastname, Keys.TAB,position, Keys.TAB,office, Keys.TAB,extention, Keys.TAB,date, Keys.TAB,salary);

    }

    @And("kullanici create buttonuna basar")
    public void kullaniciCreateButtonunaBasar() {
        dataTablePage.createButton.click();
    }

    @Then("kullanici Search bolumune {string} bilgisini girer")
    public void kullaniciSearchBolumuneBilgisiniGirer(String str) {
        dataTablePage.searchBox.sendKeys(str);
    }


    @And("kullanici {string} basarili bir sekilde giris yapildigini dogrular")
    public void kullaniciBasariliBirSekildeGirisYapildiginiDogrular(String str) {
        Assert.assertTrue(dataTablePage.searchVerify.getText().contains(str));
    }
}
