package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {9, 14, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 9, 14};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {11, 45, 7, 3, 20};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 7, 11, 20, 45};
        assertThat(result).containsExactly(expected);
    }
}