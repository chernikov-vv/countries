import javax.naming.NameNotFoundException;

public class NoSuchCountryException extends NameNotFoundException {
    public NoSuchCountryException() {
        super("указанная страна отсутствует в перечислении");
    }
}