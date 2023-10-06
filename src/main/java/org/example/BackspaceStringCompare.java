package org.example;
public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        String S = buildStringAfterBackspace(s);
        String T = buildStringAfterBackspace(t);
        return S.equals(T);
    }

    private static String buildStringAfterBackspace(String str) {
        StringBuffer result = new StringBuffer();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                result.append(c);
            } else if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));


    }
}