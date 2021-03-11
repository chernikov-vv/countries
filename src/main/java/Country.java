public enum Country {
    ENGLAND("Англия", false), POLAND("Польша", true),
    PORTUGAL("Португалия", false), RUSSIA("Россия", true),
    USA("США", false);

    private final String ruName;
    private final boolean isOpen;

    Country(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    boolean getIsOpen() {
        return this.isOpen;
    }

    static Country getByRuName(final String currentRuName) {

        Country currentCountry = null;
        for (Country country : Country.values()) {
            if (country.ruName.equals(currentRuName)) {
                currentCountry = country;
            }
        }
        if (currentCountry == null) {
            try {
                throw new NoSuchCountryException();
            } catch (NoSuchCountryException e) {
                System.out.println("Страны '" + currentRuName + "' не существует");
            }
        }
        return currentCountry;
    }

    @Override
    public String toString() {
        return name() + " (" + ruName + ")";
    }
}


