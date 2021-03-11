public class NoSuchCountryException extends IllegalArgumentException {
    public NoSuchCountryException() {
        super("указанная страна отсутствует в перечислении");
    }
}