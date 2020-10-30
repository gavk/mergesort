package ru.gavk;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {
    @Test
    public void merge_2_1_expect_1_2() {
        int[] expected = {1, 2};
        int[] actual = {2, 1};
        MergeSort.merge(actual, 0, actual.length / 2, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void merge_2_3_1_2_expect_1_2_3_4() {
        int[] expected = {1, 2, 3, 4};
        int[] actual = {2, 3, 1, 4};
        MergeSort.merge(actual, 0, actual.length / 2, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void merge_2_1_3_expect_1_2_3() {
        int[] expected = {1, 2, 3};
        int[] actual = {2, 1, 3};
        MergeSort.merge(actual, 0, actual.length / 2, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void merge_3_2_6_6_expect_2_3_6_6() {
        int[] expected = {2, 3, 6, 6};
        int[] actual = {3, 2, 6, 6};
        MergeSort.merge(actual, 0, actual.length / 2, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void sort_5_2_4_6_1_3_2_6_expect_1_2_2_3_4_5_6_6() {
        int[] expected = {1, 2, 2, 3, 4, 5, 6, 6};
        int[] actual = {5, 2, 4, 6, 1, 3, 2, 6};

        MergeSort.sort(actual, 0, actual.length);
        assertArrayEquals(expected, actual);
    }

}