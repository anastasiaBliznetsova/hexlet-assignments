package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReversedSequenceTest {
    @Test
    void testToString() {
        CharSequence text = new ReversedSequence("abcdef");
        String result = "fedcba";
        assertThat(text.toString()).isEqualTo(result);
    }

    @Test
    void testCharAt() {
        CharSequence text = new ReversedSequence("abcdef");
        char result = 'e';
        assertThat(text.charAt(1)).isEqualTo(result);
    }

    @Test
    void testLength() {
        CharSequence text = new ReversedSequence("abcdef");
        int result = 6;
        assertThat(text.length()).isEqualTo(result);
    }

    @Test
    void testSubSequence() {
        CharSequence text = new ReversedSequence("abcdef");
        String result = "edc";
        assertThat(text.subSequence(1, 4)).isEqualTo(result);
    }
}
