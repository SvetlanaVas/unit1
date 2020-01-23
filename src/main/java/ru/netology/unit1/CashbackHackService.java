package ru.netology.unit1;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }

        boolean isNeedMore = amount % boundary != 0;
        if (!isNeedMore) {
            return 0;
        }

        int remain = boundary - amount % boundary;
        return remain;
    }
}
