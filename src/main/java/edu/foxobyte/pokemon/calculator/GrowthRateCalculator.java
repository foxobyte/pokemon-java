package edu.foxobyte.pokemon.calculator;

/**
 * Growth rates determine how much experience a Pokémon will need before leveling up from its current level. Each growth rate is defined by their corresponding equation.
 * <img src="../../../../images/all_growth_rates_light.svg" alt="All Growth Rates Graph" style="display: block; margin-left: auto; margin-right: auto;">
 *
 * @author foxobyte
 * @since 1.0
 * @version 1.0
 * */
public class GrowthRateCalculator {
    /**
     * Cased cubic equation for calculating the experience required to reach a level of n <br><br>
     * \(EXP = \begin{cases} \frac{n^3\left(100 - n\right)}{50} & n < 50 \\ \frac{n^3\left(150 - n\right)}{100} & 50 \le n < 68 \\ \frac{n^3\lfloor\frac{1911-10n}{3}\rfloor}{500} & 68 \le n < 98 \\ \frac{n^3\left(160 - n\right)}{100} & 98 \le n < 100 \end{cases}\) <br>
     * <img src="../../../../images/erratic_growth_rate_light.svg" alt="All Growth Rates Graph" style="display: block; height: 300px;">
     *
     * @param n             int value of the level
     *
     * @return              int value of the experience required to reach the level n
     * */
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

    /**
     * Cubic equation for calculating the experience required to reach a level of n <br><br>
     * \(EXP = \frac{4n^3}{5}\) <br>
     * <img src="../../../../images/fast_growth_rate_light.svg" alt="All Growth Rates Graph" style="display: block; height: 300px;">
     *
     * @param n             int value of the level
     *
     * @return              return the total exp value required to reach level of n
     * */
    public static int calculateFastGrowthRate(int n) {
        return (int) ((4 * Math.pow(n, 3)) / 5);
    }

    /**
     * Cubic equation for calculating the experience required to reach a level of n <br><br>
     * \(EXP = n^3\) <br>
     * <img src="../../../../images/medium_fast_growth_rate_light.svg" alt="All Growth Rates Graph" style="display: block; height: 300px;">
     *
     * @param n             int value of the level
     *
     * @return              int value of the experience required to reach the level n
     * */
    public static int calculateMediumFastGrowthRate(int n) {
        if (n == 1) return 0;
        return (int) Math.pow(n, 3);
    }

    /**
     * Cubic equation for calculating the experience required to reach a level of n <br><br>
     * \(EXP = \frac{6}{5}n^3 - 15n^2 + 100n - 140\) <br>
     * <img src="../../../../images/medium_slow_growth_rate_light.svg" alt="All Growth Rates Graph" style="display: block; height: 300px;">
     *
     * @param n             int value of the level
     *
     * @return              int value of the experience required to reach the level n
     * */
    public static int calculateMediumSlowGrowthRate(int n) {
        if (n == 1) return 0;
        return (int) (((6f / 5) * Math.pow(n, 3)) - (15 * Math.pow(n, 2)) + (100 * n) - 140);
    }

    /**
     * Cubic equation for calculating the experience required to reach a level of n <br><br>
     * \(EXP = \frac{5n^3}{4}\) <br>
     * <img src="../../../../images/medium_slow_growth_rate_light.svg" alt="All Growth Rates Graph" style="display: block; height: 300px;">
     *
     * @param n             int value of the level
     *
     * @return              int value of the experience required to reach the level n
     * */
    public static int calculateSlowGrowthRate(int n) {
        if (n == 1) return 0;
        return (int) ((5 * Math.pow(n, 3)) / 4);
    }

    /**
     * Cased cubic equation for calculating the experience required to reach a level of n <br><br>
     * \(EXP = \begin{cases} \frac{n^3 \left( \lfloor\frac{n + 1}{3}\rfloor + 24\right)}{50} & n < 15 \\ \frac{n^3\left(n + 14\right)}{50} & 15 \le n < 36 \\ \frac{n^3\left(\lfloor\frac{n}{2}\rfloor + 32 \right)}{50} & 36 \le n < 100 \end{cases}\) <br>
     * <img src="../../../../images/fluctuating_growth_rate_light.svg" alt="All Growth Rates Graph" style="display: block; height: 300px;">
     *
     * @param n             int value of the level
     *
     * @return              int value of the experience required to reach the level n
     * */
    public static int calculateFluctuatingGrowthRate(int n) {
        if (n < 15) {
            return (int) ((Math.pow(n, 3) * (Math.floor((float) (n + 1) / 3) + 24)) / 50);
        } else if (n < 36) {
            return (int) ((Math.pow(n, 3) * (float) (n + 14)) / 50);
        }
        return (int) ((Math.pow(n, 3) * (Math.floor(((float) n / 2)) + 32)) / 50);
    }
}
