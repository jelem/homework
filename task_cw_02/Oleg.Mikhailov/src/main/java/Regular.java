import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {

  public static final String regex = "[a-z]{1}[a-z0-9:;]*///[a-z0-9]+:[a-z]?";

  public static int count(String str) {
    Pattern pattern = Pattern.compile(regex);
    Matcher result = pattern.matcher(str);

    int count = 0;
    while (result.find()) {
      count++;
    }
    return count;
  }
}
