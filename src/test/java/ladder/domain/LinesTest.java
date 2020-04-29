package ladder.domain;

import ladder.view.exception.InvalidLadderHeightException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class LinesTest {
    public static final int COUNT_OF_PERSON_DEFAULT = 5;
    public static final int COUNT_OF_PERSON_DEFAULT_TEST = 2;
    public static final int HEIGHT_DEFAULT = 1;
    public static final Lines LINES_PERSON2 = Lines.getInstance(Arrays.asList(LineTest.LINE_PERSON2));

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 10})
    @DisplayName("주어진 높이만큼의 사다리를 생성")
    public void generateLadderSuccess(int height) {
        Lines lines = Lines.getInstance(height, COUNT_OF_PERSON_DEFAULT);

        assertThat(lines.isHeightSame(height)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    @DisplayName("유효하지 않은 높이 값이 주어진 경우 exception")
    public void generateLadderThrowException(int height) {
        assertThatExceptionOfType(InvalidLadderHeightException.class)
                .isThrownBy(() -> Lines.getInstance(height, COUNT_OF_PERSON_DEFAULT));

    }
}