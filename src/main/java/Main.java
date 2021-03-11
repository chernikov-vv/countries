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
            System.out.println("Страна " + Country.valueOf(currentCountry)
                    + isOpen(Country.valueOf(currentCountry).getIsOpen()));
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Наименование страны на английском языке введено некорректно, проверяем русское название...");
            if (Country.getByRuName(currentCountry) != null) {
                System.out.println("Страна " + Country.getByRuName(currentCountry)
                        + isOpen(Country.getByRuName(currentCountry).getIsOpen()));
            }
        } catch (NullPointerException e) {
            System.out.println("Название страны не может быть null");
        }
    }
}
