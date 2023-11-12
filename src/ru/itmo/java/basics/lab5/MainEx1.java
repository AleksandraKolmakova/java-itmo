package ru.itmo.java.basics.lab5;

public class MainEx1 {
    public static void main(String[] args) {
        String text = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне." +
                " Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI " +
                "века. В то время некий безымянный печатник создал большую коллекцию размеров и " +
                "форм шрифтов, используя Lorem Ipsum для распечатки образцов.";

        theLongestWord(text);
    }

    public static void theLongestWord(String text) {
        String[] split = text.split("[\\s.,\";:]+");
        String result = " ";
        for (String s : split) {
            if (s.length() > result.length())
                result = s;
        }
        System.out.println(result);
    }

}

