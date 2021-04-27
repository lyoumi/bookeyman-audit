package com.bookeyman.audit.services;

import com.bookeyman.audit.data.AuditReportPayload;
import reactor.core.publisher.Mono;

public interface AuditService {

    Mono<AuditReportPayload> saveAuditReport(Mono<AuditReportPayload> auditReportDto);

}
