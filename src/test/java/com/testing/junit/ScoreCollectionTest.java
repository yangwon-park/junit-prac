package com.testing.junit;

import com.testing.junit.part1.ScoreCollection;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ScoreCollectionTest {

    @Test
    void answerArithmeticMeanOfTwoNumbers() {
        // Given
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // When
        int actualResult = collection.arithmeticMean();

        // Then
        assertThat(actualResult).isEqualTo(6);
    }
}
