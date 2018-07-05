package jamcy;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Utils {
  public static String readShader(String name) {
    try {
      Path path = Paths.get(ClassLoader.getSystemResource(name).toURI());
      return Files.readAllLines(path).stream()
          .collect(Collectors.joining("\n"));
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}
