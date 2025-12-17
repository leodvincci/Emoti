package com.penrose.emotion;

import com.penrose.emotideck.emoticard.EmotionDefinition;
import com.penrose.emotion.coreaffect.HedonicValence;

import java.util.List;


public record EmotionTerm(
        EmotionTermId id,
        EmotionLabel label,          // anxious
        HedonicValence valence,      // unpleasant
        TopLevelEmotion family,        // fear/anxiety
        EmotionSubfamily subfamily,  // worry / panic / insecurity (optional)
        EmotionDefinition definition,
        List<Prompt> prompts
) {}