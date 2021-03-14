import java.util.Scanner;

public class Main {
    private static String isOpen(final boolean isOpen) {
        if (!isOpen) {
            return " закрыта для посещения";
        }
        return " открыта для посещения";
    }

    public static void main(final String[] args) {
        System.out.println("Список доступных стран:");

        for (Country country : Country.values()) {
            System.out.println(country);
        }

        Scanner scanner = new Scanner(System.in);

        String currentCountry = scanner.nextLine();

        try {
            Country enCountry = Country.valueOf(currentCountry);
            System.out.println("Страна " + enCountry + isOpen(enCountry.getIsOpen()));
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Наименование страны на английском языке введено некорректно, проверяем русское название...");
            try {
                Country ruCountry = Country.getByRuName(currentCountry);
                System.out.println("Страна " + ruCountry + isOpen(ruCountry.getIsOpen()));
            } catch (NoSuchCountryException ex) {
                System.out.println("Страны '" + currentCountry + "' не существует");
            }
        } catch (NullPointerException e) {
            System.out.println("Название страны не может быть null");
        }
    }
}
