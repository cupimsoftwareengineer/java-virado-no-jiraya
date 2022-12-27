package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
  public static void main(String[] args) {
    Aircraft aircraft = new Aircraft("7777");
    Country country = Country.BRAZIL;
    Currency currency = CurrencyFactory.newCurrency(country);
    Person person = Person.PersonBuilder
            .builder()
            .firstName("George")
            .lastName("Bias")
            .build();

    ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
            .aircraftName(aircraft.getName())
            .country(country)
            .currency(currency)
            .personName(person.getFirstName())
            .build();


    System.out.println(reportDto);
  }
}
