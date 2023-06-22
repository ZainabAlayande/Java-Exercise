from Algorithm.sortColor import Sort_Colors
from unittest import TestCase


class SortColorTest(TestCase):
    def test_first_list_can_be_sorted(self):
        arr = [2, 1, 1, 0, 2, 0]
        actual = Sort_Colors.sort(arr)
        expected = [0, 0, 1, 1, 2, 2]
        self.assertListEqual(expected, actual)

    def test_two_list_can_be_sorted(self):
        arr = [1, 2, 0]
        actual = Sort_Colors.sort(arr)
        expected = [0, 1, 2]
        self.assertListEqual(expected, actual)

    def test_three_list_can_be_sorted(self):
        arr = [2, 1, 1, 0, 2, 0, 2, 1, 0]
        actual = Sort_Colors.sort(arr)
        expected = [0, 0, 0, 1, 1, 1, 2, 2, 2]
        self.assertListEqual(expected, actual)
