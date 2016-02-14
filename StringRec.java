public class StringRec {
public static String decompress(String in, String count, String out) {
    if (in.equals("")) {
        return out;
    }
    if (Character.isLetter(in.charAt(0))) {
        out = out + number(in.charAt(0),Integer.parseInt(count));
        count = "";
    }
    else if(Character.isDigit(in.charAt(0))) {
        count = count + (""+in.charAt(0));
    }
      return decompress(in.substring(1), count, out);
    }
public static String decompress(String compressedText) {
    return decompress(compressedText, "", "");
}
public static String number(char x, int y) {
    if (y == 0) return "";
    return ""+x+number(x,y-1);
}
}