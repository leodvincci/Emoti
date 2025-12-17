package com.penrose.emotion;

import java.util.List;


public record EmotionTerm(
        EmotiTermId id,
        EmotionLabel label,          // anxious
        HedonicValence valence,      // unpleasant
        EmotionFamily family,        // fear/anxiety
        EmotionSubfamily subfamily,  // worry / panic / insecurity (optional)
        EmotionDefinition definition,
        List<Prompt> prompts
) {}