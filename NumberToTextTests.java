package kz.eh.portal.api;

import kz.eh.portal.api.converter.NumberToTextConverter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberToTextTests {

    @Test
    void testRussianDigits() {
        NumberToTextConverter converter = new NumberToTextConverter();

        String result0 = converter.convertRussian(0);
        String result1 = converter.convertRussian(1);
        String result2 = converter.convertRussian(2);
        String result3 = converter.convertRussian(3);
        String result4 = converter.convertRussian(4);
        String result5 = converter.convertRussian(5);
        String result6 = converter.convertRussian(6);
        String result7 = converter.convertRussian(7);
        String result8 = converter.convertRussian(8);
        String result9 = converter.convertRussian(9);

        assertThat(result0).isEqualTo("ноль");
        assertThat(result1).isEqualTo("один");
        assertThat(result2).isEqualTo("два");
        assertThat(result3).isEqualTo("три");
        assertThat(result4).isEqualTo("четыре");
        assertThat(result5).isEqualTo("пять");
        assertThat(result6).isEqualTo("шесть");
        assertThat(result7).isEqualTo("семь");
        assertThat(result8).isEqualTo("восемь");
        assertThat(result9).isEqualTo("девять");
    }

    @Test
    void testRussianTwoDigits() {
        NumberToTextConverter converter = new NumberToTextConverter();

        String result10 = converter.convertRussian(10);
        String result11 = converter.convertRussian(11);
        String result12 = converter.convertRussian(12);
        String result13 = converter.convertRussian(13);
        String result14 = converter.convertRussian(14);
        String result15 = converter.convertRussian(15);
        String result16 = converter.convertRussian(16);
        String result17 = converter.convertRussian(17);
        String result18 = converter.convertRussian(18);
        String result19 = converter.convertRussian(19);
        String result20 = converter.convertRussian(20);
        String result30 = converter.convertRussian(30);
        String result40 = converter.convertRussian(40);
        String result50 = converter.convertRussian(50);
        String result60 = converter.convertRussian(60);
        String result70 = converter.convertRussian(70);
        String result80 = converter.convertRussian(80);
        String result90 = converter.convertRussian(90);
        String result21 = converter.convertRussian(21);
        String result32 = converter.convertRussian(32);
        String result43 = converter.convertRussian(43);
        String result54 = converter.convertRussian(54);
        String result65 = converter.convertRussian(65);
        String result76 = converter.convertRussian(76);
        String result87 = converter.convertRussian(87);
        String result98 = converter.convertRussian(98);
        String result99 = converter.convertRussian(99);

        assertThat(result10).isEqualTo("десять");
        assertThat(result11).isEqualTo("одиннадцать");
        assertThat(result12).isEqualTo("двенадцать");
        assertThat(result13).isEqualTo("тринадцать");
        assertThat(result14).isEqualTo("четырнадцать");
        assertThat(result15).isEqualTo("пятнадцать");
        assertThat(result16).isEqualTo("шестнадцать");
        assertThat(result17).isEqualTo("семнадцать");
        assertThat(result18).isEqualTo("восемнадцать");
        assertThat(result19).isEqualTo("девятнадцать");
        assertThat(result20).isEqualTo("двадцать");
        assertThat(result30).isEqualTo("тридцать");
        assertThat(result40).isEqualTo("сорок");
        assertThat(result50).isEqualTo("пятьдесят");
        assertThat(result60).isEqualTo("шестьдесят");
        assertThat(result70).isEqualTo("семьдесят");
        assertThat(result80).isEqualTo("восемьдесят");
        assertThat(result90).isEqualTo("девяносто");
        assertThat(result21).isEqualTo("двадцать один");
        assertThat(result32).isEqualTo("тридцать два");
        assertThat(result43).isEqualTo("сорок три");
        assertThat(result54).isEqualTo("пятьдесят четыре");
        assertThat(result65).isEqualTo("шестьдесят пять");
        assertThat(result76).isEqualTo("семьдесят шесть");
        assertThat(result87).isEqualTo("восемьдесят семь");
        assertThat(result98).isEqualTo("девяносто восемь");
        assertThat(result99).isEqualTo("девяносто девять");
    }
}
