package com.bookeyman.audit.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuditReportPayload {

    @JsonProperty("book_id")
    private String bookId;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("action_type")
    private ActionType actionType;
    @JsonProperty("action_date")
    private LocalDateTime actionDate;


    public enum ActionType {
        @JsonProperty("purchase") PURCHASE,
        @JsonProperty("refund") REFUND
    }
}
