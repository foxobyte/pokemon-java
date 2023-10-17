package edu.foxobyte.pokemon.calculator;

public class DamageCalculator {
    /**
     * \(BaseDamage = min\{997, \left(\lfloor\frac{\lfloor\frac{\left( \lfloor\frac{2 \times level \times critical}{5}\rfloor + 2\right) \times power \times attack}{defense}\rfloor}{50}\rfloor \right) \}\)
     *
     * @param level         int value of the level of the attacking Pokémon
     * @param critical      is 2 for a critical hit, and 1 if otherwise
     * @param attack        int value of the effective attack stat of the attacking Pokémon for physical category moves or
     *                          int value of the effective special stat of the attacking Pokémon for special category moves
     * @param defense       int value of the effective defense stat of the defending Pokémon for physical category moves or
     *                          int value of the effective special stat of the defending Pokémon for special category moves
     * @param power         int value of the power of the move being used
     *
     * @return              int value of the damage calculated
     * */
    public static int calculateBaseDamageGeneration1(int level, int critical, int attack, int defense, int power) {
        float A = (float) attack;
        float D = (float) defense;

        if (attack > 255 || defense > 255) {
            A = (float) Math.floor(A / 4) % 256;
            D = (float) Math.floor(D / 4) % 256;
        }

        return (int) Math.min(997, Math.floor(Math.floor(((Math.floor(((float) (2 * level * critical) / 5)) + 2) * power * A) / D) / 50)) + 2;
    }
}
