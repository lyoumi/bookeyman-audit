package com.bookeyman.audit.services;

import com.bookeyman.audit.data.AuditReportPayload;
import com.bookeyman.audit.entities.AuditReport;

public interface ConverterService {

    default AuditReport convert(AuditReportPayload source) {
        return convert(source, AuditReport.class);
    }

    default AuditReportPayload convert(AuditReport source) {
        return convert(source, AuditReportPayload.class);
    }

    <T> T convert(Object source, Class<T> targetType);

}
