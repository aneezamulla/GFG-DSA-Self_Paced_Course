public class RopeCutting_problem {

  public static int max_pieces(int len, int a, int b, int c) {
    if (len == 0)
      return 0;
    if (len < 0)
      return -74848;
    int x = max_pieces(len - a, a, b, c) + 1;
    int y = max_pieces(len - b, a, b, c) + 1;
    int z = max_pieces(len - c, a, b, c) + 1;
    return Math.max(x, Math.max(y, z));
  }

  public static void main(String[] args) {
    int len = 27, a = 11, b = 9, c = 12;
    int max_parts = max_pieces(len, a, b, c);
    if (max_parts < 0)
      System.out.println(0);
    else
      System.out.println(max_parts);
  }
}
