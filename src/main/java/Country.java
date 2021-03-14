public enum Country {
    ENGLAND("Англия", false),
    POLAND("Польша", true),
    PORTUGAL("Португалия", false),
    RUSSIA("Россия", true),
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

    static Country getByRuName(final String currentRuName) throws NoSuchCountryException {

        Country currentCountry = null;
        for (Country country : Country.values()) {
            if (country.ruName.equals(currentRuName)) {
                currentCountry = country;
            }
        }
        if (currentCountry == null) {
            throw new NoSuchCountryException();
        }
        return currentCountry;
    }

    @Override
    public String toString() {
        return name() + " (" + ruName + ")";
    }
}
