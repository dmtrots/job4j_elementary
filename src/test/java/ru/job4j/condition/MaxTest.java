package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax35To38Then38() {
        int left = 38;
        int right = 35;
        int result = Max.max(left, right);
        int expected = 38;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void leftMax() {
        int left = 39;
        int right = 37;
        int result = Max.max(left, right);
        int expected = 39;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void rightMax() {
        int left = 34;
        int right = 40;
        int result = Max.max(left, right);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void leftEqualToRight() {
        int left = 33;
        int right = 33;
        int result = Max.max(left, right);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }
}