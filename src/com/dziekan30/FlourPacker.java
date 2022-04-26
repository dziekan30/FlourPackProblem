package com.dziekan30;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) { // #1 validation
            return false;
        }

        int bigCountToUse = bigCount < goal/5 ? bigCount : goal/5 ; // #2 determine how many bigCount to use
        return (goal - bigCountToUse*5) <= smallCount; // #3 evaluate if enough smallCount to fill the rest of the order

    }
}
