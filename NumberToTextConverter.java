package kz.eh.portal.api.converter;

public class NumberToTextConverter {

    private static final String[] hundreds = {
            "", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"
    };

    private static final String[] tens = {
            "", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"
    };

    private static final String[] num = {
            "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
            "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
            "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    };

    public String convertRussian(int number) {
        if (number == 0) {
            return "ноль";
        }

        StringBuilder words = new StringBuilder();

        if (number / 100 > 0) {
            words.append(hundreds[number / 100]).append(" ");
            number %= 100;
        }

        if (number > 10 && number < 20) {
            words.append(num[number]).append(" ");
        } else {
            if (number / 10 > 0) {
                words.append(tens[number / 10]).append(" ");
                number %= 10;
            }
            if (number > 0) {
                words.append(num[number]).append(" ");
            }
        }

        return words.toString().trim();
    }
}

