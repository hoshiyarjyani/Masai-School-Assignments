public class RemoveDuplicateRecursion {

    static String duplicateRemove(String str) {
        if (str.isEmpty()) {
            return "Empty String";
        }
        if (str.length() == 1) {
            return str;
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    result += str.charAt(i);
                }
            }
            if (i == str.length() - 1) {
                if (str.charAt(i) != str.charAt(i - 1)) {
                    result += str.charAt(i);
                }
            } else {
                if (str.charAt(i) != str.charAt(i - 1) &&
                        str.charAt(i) != str.charAt(i + 1)) {
                    result += str.charAt(i);
                }
            }
        }

        if (str.length() == result.length()) {
            return result;
        } else {
            return duplicateRemove(result);
        }

    }

    public static void main(String[] args) {
        String str = "raceecar";
        String ans = duplicateRemove(str);
        System.out.println(ans);
        String str1 = "Hoshiyaayr";
        String ans1 = duplicateRemove(str1);
        System.out.println(ans1);
    }

}
