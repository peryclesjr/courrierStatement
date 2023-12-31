package com.courrier.courrierStatement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdjustementModifier {
    private UUID adjustmentId;
    private UUID deliveryId;
    private UUID courierId;
    private Instant createdTimestamp;
    private String value;
}

