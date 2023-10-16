package edu.foxobyte.pokemon.calculator;

import java.util.HashMap;
import java.util.Map;

public class EffectivenessCalculator {

    // I used float because you were working with float , can make it double or  whatever you prefer

    private static final Map<String, Map<String, Float>> effectivenessMap = new HashMap<>();

    static {
        // Create inner maps for each Pokémon type and its effectiveness against other types
        Map<String, Float> fireTypeEffectiveness = new HashMap<>();
        fireTypeEffectiveness.put("Grass", 2.0f);
        fireTypeEffectiveness.put("Water", 0.5f);
        fireTypeEffectiveness.put("Electric", 1.0f);

        Map<String, Float> waterTypeEffectiveness = new HashMap<>();
        waterTypeEffectiveness.put("Fire", 2.0f);
        waterTypeEffectiveness.put("Grass", 0.5f);
        waterTypeEffectiveness.put("Electric", 1.5f);

        // Put inner maps into the outer map
        effectivenessMap.put("Fire", fireTypeEffectiveness);
        effectivenessMap.put("Water", waterTypeEffectiveness);
    }


    public static float getEffectiveness(String attackingType, String defendingType) {
        if (effectivenessMap.containsKey(attackingType) && effectivenessMap.get(attackingType).containsKey(defendingType)) {
            return effectivenessMap.get(attackingType).get(defendingType);
        } else {
            // Default effectiveness if types are not found in the map
            return 1.0f;
        }
    }
}
