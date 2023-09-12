package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result = new ArrayList<>(Arrays.asList(1, 2));
        List<Integer> test1 = App.take(numbers1, 2);
        assertThat(test1).isEqualTo(result);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        result = Arrays.asList(7, 3, 10);
        List<Integer> test2 = App.take(numbers2, 8);
        assertThat(test2).isEqualTo(result);

        List<Integer> numbers3 = new ArrayList<>(Arrays.asList(5, 6, 8, 2));
        List<Integer> test3 = App.take(numbers3, 3);
        assertThat(test3.size())
                .isEqualTo(3)
                .isLessThan(4);

        List<Integer> numbers4 = new ArrayList<>(Arrays.asList(4, 8, 4, 2, 7));
        List<Integer> test4 = App.take(numbers4, 4);
        assertThat(test4.size())
                .isPositive()
                .isGreaterThan(3);

        List<Integer> numbers5 = new ArrayList<>(Arrays.asList(2, 7, 3));
        List<Integer> test5 = App.take(numbers5, 2);
        assertThat(test5.size()).isLessThan(3);

        List<Integer> numbers6 = new ArrayList<>(Arrays.asList(6, 3, 9, 2, 5, 7));
        List<Integer> test6 = App.take(numbers6, 5);
        assertThat(test6.size()).isBetween(4, 6);

        List<Integer> numbers7 = new ArrayList<>(Arrays.asList(8, 4, 3, 7, 6));
        List<Integer> test7 = App.take(numbers7, 3);
        assertThat(test7.get(1)).isEqualTo(4);

        // END
    }
}
