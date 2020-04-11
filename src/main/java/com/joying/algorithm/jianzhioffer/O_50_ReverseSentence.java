package com.joying.algorithm.jianzhioffer;

/**
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 * 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 * 正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class O_50_ReverseSentence {
    public static String reverseSentence(String str) {
        if(str==null||str.trim().length()<=1)
            return str;
        String[] strs = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = strs.length - 1; i >= 0; i--)
            sb.append(strs[i] + " ");
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = " ";
        String s1 = "";
        String s2 = "student. a am I";
        System.out.println("reverseSentence(s) = " + reverseSentence(s));
        System.out.println("reverseSentence(s1) = " + reverseSentence(s1));
        System.out.println("reverseSentence(s2) = " + reverseSentence(s2));
    }
}
