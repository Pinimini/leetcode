package ru.pinimini.easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        boolean isPrefix = false;
        String model = strs[0];

        for (int i = 0; i <= strs.length - 1; i++) {
            String currentStr = strs[i];

            if (currentStr.startsWith(model)) {
                isPrefix = true;
            } else {
                isPrefix = false;
                model = model.substring(0, model.length() - 1);
                i--;
            }
        }
        return isPrefix ? model : "";
    }
}
