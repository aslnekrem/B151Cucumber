package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu. Cucumber ile junit entegrasyonu sağlar
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber1.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        //rerun ile belirttigimiz dosyada fail olan senaryolar tutulur
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@pozitif",
        dryRun = false,//--> true seçersek browser i çalıştırmaz
        monochrome = true //--> true kullanirsak konsoldaki ciktilar tek renk (siyah) olur
)

/*
@CucumberOptions() notasyonuna parametre olarak
    features --> features package'ının yolunu belirtiriz(Content Root)
    glue --> step definitionpackage (source root)
    tags--> çalıştırmak istediğimiz scenarioları bu parametred belirtiriz

@CucumberOptions() notasyonu scenarioların nerede ve nasıl çalışacağı, hangi raporu kullanacağı ile alakalı
seçenekleri bu notasyonda belirtiriz

@CucumberOptions() notasyonu içerisine plugin parametresi ile yukarıdaki gibi almak istediğimiz rapor çeşidini
seçip ekliyoruz.
pretty --> konsolda çalıştırdığımız scenario ile ilgili ayrıntılı bilgi verir.
 */

public class Runner {

}