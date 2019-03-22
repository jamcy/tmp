package jamcy;

import org.apache.commons.io.IOUtils;

import java.nio.charset.StandardCharsets;

public final class Utils {
  private Utils() {}

  public static String readShader(String name) {
    try (var shaderResource = ClassLoader.getSystemResourceAsStream(name)) {
      return String.join("\n", IOUtils.readLines(shaderResource, StandardCharsets.UTF_8));
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}
