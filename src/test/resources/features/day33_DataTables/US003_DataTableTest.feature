Feature: US002 BlueRentalCar Login Islemi

  Scenario: TC01 BlueRentalCar Pozitif Test
    Given kullanici "blueRentalUrl" sayfasina properties ile gider
    Then kullanici login buttonuna tiklar
    But kullanici 2 saniye bekler
    And kullanici tabloda verilen bilgileri kullanarak map ile login olur
      | email                              | password  |
      | sam.walker@bluerentalcars.com      | c!fas_art |
      | emkate.brown@bluerentalcars.comail | tad1$Fas  |
    And sayfayi kapatir