package ru.pinimini.easy;

public class RomanToInteger {
    public int romanToInt(String s) {
        Integer prevValue = null;
        int totalValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = charToValue(c);
            if (prevValue != null && prevValue > value) {
                totalValue -= value;
            } else {
                totalValue += value;
            }
            prevValue = value;
        }
        return totalValue;
    }

    public int charToValue(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                throw new IllegalArgumentException("bad char");
        }
    }


    //Solution 1
/*    public int romanToInt(String s) {
        Map<Character, Integer> romanAlphabet = new HashMap<>();
        romanAlphabet.put('G', 0);
        romanAlphabet.put('I', 1);
        romanAlphabet.put('V', 5);
        romanAlphabet.put('X', 10);
        romanAlphabet.put('L', 50);
        romanAlphabet.put('C', 100);
        romanAlphabet.put('D', 500);
        romanAlphabet.put('M', 1000);

        //MCMXCIV
        char[] charArray = s.toCharArray();
        int resultInt = 0;
        int tmpChange = 0;
        int previousCharWeight = 0;
        for (char ch : charArray) {
            Integer currentCharWeight = romanAlphabet.get(ch);
            if (currentCharWeight <= previousCharWeight) {
                resultInt += currentCharWeight;

            } else {
                resultInt += currentCharWeight - tmpChange - previousCharWeight;
            }
            tmpChange = currentCharWeight;
            previousCharWeight = currentCharWeight;
        }
        return resultInt;
    }*/
}
