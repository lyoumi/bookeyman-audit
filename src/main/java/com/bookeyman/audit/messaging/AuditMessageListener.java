package com.bookeyman.audit.messaging;

import com.bookeyman.audit.data.AuditReportPayload;
import com.bookeyman.audit.services.AuditService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Mono;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class AuditMessageListener {

    private final AuditService auditService;

    @MessageMapping("audit-report")
    public Mono<AuditReportPayload> receiveAuditReport(AuditReportPayload auditReportDto) {
        return auditService.saveAuditReport(Mono.just(auditReportDto));
    }

}
