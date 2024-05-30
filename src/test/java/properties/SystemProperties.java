package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class SystemProperties {

    public static String wdHost = System.getProperty("wdHost", "");
}
