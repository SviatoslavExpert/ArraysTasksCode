package com.gmail.granovskiy.s;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import java.util.Arrays;

@RunWith(JUnit4.class)
public class SequenceRepairTest {
    SequenceRepair repair = new SequenceRepair();
    @Test
    public void testSequenceThatShouldReturnSuccessfulRepair() {
        int[] expectedResult = {1, 2, 3, 4, 7, 6, 5, 4};
        int[] wrongSequenceArray = {1, 2, -1, 4, 7, 6, -2, 4};
        int[] actualResult = repair.repairArray(wrongSequenceArray);
        Arrays.equals(expectedResult, actualResult);
    }
}
