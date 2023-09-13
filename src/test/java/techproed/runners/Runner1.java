package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//-->Scenario çalıştırıcı notasyonu. Cucumber ile junit entegrasyonu sağlar
@CucumberOptions(plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber2.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        //rerun ile belirttigimiz dosyada fail olan senaryolar tutulur
        features = "src/test/resources/features",
        glue = {"techproed/stepDefinition"},
        tags = "@negative",
        dryRun = false,//--> true seçersek browser i çalıştırmaz
        monochrome = true //--> true kullanirsak konsoldaki ciktilar tek renk (siyah) olur
)
public class Runner1 {
}
