package com.bookeyman.audit.services.impl;

import com.bookeyman.audit.data.AuditReportPayload;
import com.bookeyman.audit.repository.AuditRepository;
import com.bookeyman.audit.services.AuditService;
import com.bookeyman.audit.services.ConverterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class AuditServiceImpl implements AuditService {

    private final AuditRepository auditRepository;
    private final ConverterService converter;

    @Override
    public Mono<AuditReportPayload> saveAuditReport(Mono<AuditReportPayload> auditReportDto) {
        return auditReportDto.map(converter::convert)
                .doOnNext(auditReport -> log.info(auditReport.toString()))
                .doOnNext(auditRepository::save)
                .map(converter::convert);
    }
}
