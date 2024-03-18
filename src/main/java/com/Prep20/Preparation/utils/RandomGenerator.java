package com.Prep20.Preparation.utils;

import com.Prep20.Preparation.constants.CoreConstants;

import java.util.Random;

public class RandomGenerator {

    public static int[] generateRandomArray(){
        Random random = new Random();
        return random.ints(CoreConstants.RANDOM_ARRAY_SIZE,CoreConstants.RANDOM_ARRAY_START_INTEGER, CoreConstants.RANDOM_ARRAY_END_INTEGER).toArray();
    }
}
