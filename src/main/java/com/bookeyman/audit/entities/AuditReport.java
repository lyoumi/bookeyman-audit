package com.bookeyman.audit.entities;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class AuditReport {

    @Id
    private String id;
    private String bookId;
    private Double price;
    private ActionType actionType;
    private LocalDateTime actionDate;


    public enum ActionType {
        PURCHASE,
        REFUND
    }
}
