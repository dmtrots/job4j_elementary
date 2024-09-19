package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax35To38Then38() {
        int first = 38;
        int second = 35;
        int result = Max.max(first, second);
        int expected = 38;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void firstMax() {
        int first = 39;
        int second = 37;
        int result = Max.max(first, second);
        int expected = 39;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void secondMax() {
        int first = 34;
        int second = 40;
        int result = Max.max(first, second);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax78To33To45Then78() {
        int first = 78;
        int second = 33;
        int third = 45;
        int result = Max.max(first, second, third);
        int expected = 78;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax63To19To44Then92() {
        int first = 63;
        int second = 19;
        int third = 44;
        int four = 92;
        int result = Max.max(first, second, third, four);
        int expected = 92;
        assertThat(result).isEqualTo(expected);
    }
}