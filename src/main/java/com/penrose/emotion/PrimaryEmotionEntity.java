package com.penrose.emotion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PrimaryEmotionEntity {
    @Id
    Long id;
    String emotionName;
}
