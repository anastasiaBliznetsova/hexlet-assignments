package exercise;

import org.junit.jupiter.api.Test;

import static exercise.App.enlargeArrayImage;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testApp() {
        String[][] image = {
                {"*", "*", "*", "*"},
                {"*", " ", " ", "*"},
                {"*", " ", " ", "*"},
                {"*", "*", "*", "*"},
        };
        String[][] result = {
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", " ", " ", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*", "*", "*"}
        };
        String[][] enlargedImage = enlargeArrayImage(image);
        assertThat(enlargedImage).isEqualTo(result);
    }

    @Test
    void testApp2() {
        String[][] image = {
                {"*", "*", "*"},
                {"*", " ", "*"},
                {"*", "*", "*"},
        };
        String[][] result = {
                {"*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", "*", "*"},
                {"*", "*", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*"}
        };
        String[][] enlargedImage = enlargeArrayImage(image);
        assertThat(enlargedImage).isEqualTo(result);
    }

    @Test
    void testApp3() {
        String[][] image = {
                {"*", "*"},
                {"*", " "}
        };
        String[][] result = {
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", " ", " "},
                {"*", "*", " ", " "}
        };
        String[][] enlargedImage = enlargeArrayImage(image);
        assertThat(enlargedImage).isEqualTo(result);
    }

    @Test
    void testApp4() {
        String[][] image = {
                {"*", "*"},
                {"*", " "}
        };
        String[][] enlargedImage = enlargeArrayImage(image);
        assertThat(enlargedImage.length).isEqualTo(image.length * 2);
        assertThat(enlargedImage[0].length).isEqualTo(image[0].length * 2);
    }
}
// END
