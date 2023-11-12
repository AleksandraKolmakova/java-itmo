package ru.itmo.java.basics.lab5;

public class MainEx4 {
    public static void main(String[] args) {
        String text = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне." +
                " Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI " +
                "века. В то время некий безымянный печатник создал большую коллекцию размеров и " +
                "форм шрифтов, используя Lorem Ipsum для распечатки образцов.";

        String substringText = "безымянный печатник";
        String substringText1 = "Lorem Ipsum";

        stringSubstring(text, substringText);
        stringSubstring(text, substringText1);
    }

    public static void stringSubstring(String text, String substringText) {
        int countSubstr = 0;
        int index = text.indexOf(substringText);
        while (index != -1) {
            countSubstr++;
            index = text.indexOf(substringText, index + 1);
        }
        System.out.println("Количество вхождений подстроки: \"" + substringText + "\" в текст = " + countSubstr);
    }

}

