public class MakeOutWord2 {
  public String makeOutWord(String out, String word) {
    return (out.substring(0, 2) + word + out.substring(2, out.length()));
  }
}
