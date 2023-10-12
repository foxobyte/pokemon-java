package edu.foxobyte.pokemon.calculator;

public class GrowthRateCalculator {
    public static int calculateErraticGrowthRate(int n) {
        if (n == 1) return 0;
        if (n < 50) {
            return (int) ((Math.pow(n, 3) * (100 - n)) / 50);
        } else if (n < 68) {
            return (int) ((Math.pow(n, 3) * (150 - n)) / 100);
        } else if (n < 98) {
            return (int) ((Math.pow(n, 3) * Math.floor((float) (1911 - (10 * n)) / 3)) / 500);
        }
        return (int) ((Math.pow(n, 3) * (160 - n)) / 100);
    }

    public static int calculateFastGrowthRate(int n) {
        return (int) ((4 * Math.pow(n, 3)) / 5);
    }

    public static int calculateMediumFastGrowthRate(int n) {
        if (n == 1) return 0;
        return (int) Math.pow(n, 3);
    }

    public static int calculateMediumSlowGrowthRate(int n) {
        if (n == 1) return 0;
        return (int) (((6f / 5) * Math.pow(n, 3)) - (15 * Math.pow(n, 2)) + (100 * n) - 140);
    }

    public static int calculateSlowGrowthRate(int n) {
        if (n == 1) return 0;
        return (int) ((5 * Math.pow(n, 3)) / 4);
    }

    public static int calculateFluctuatingGrowthRate(int n) {
        if (n < 15) {
            return (int) ((Math.pow(n, 3) * (Math.floor((float) (n + 1) / 3) + 24)) / 50);
        } else if (n < 36) {
            return (int) ((Math.pow(n, 3) * (float) (n + 14)) / 50);
        }
        return (int) ((Math.pow(n, 3) * (Math.floor(((float) n / 2)) + 32)) / 50);
    }
}
