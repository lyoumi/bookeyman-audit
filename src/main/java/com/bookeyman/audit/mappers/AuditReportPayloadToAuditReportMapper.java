package com.bookeyman.audit.mappers;

import com.bookeyman.audit.data.AuditReportPayload;
import com.bookeyman.audit.entities.AuditReport;
import org.mapstruct.Mapper;

import org.springframework.core.convert.converter.Converter;

@Mapper(componentModel = "spring")
public interface AuditReportPayloadToAuditReportMapper extends Converter<AuditReportPayload, AuditReport> {

}
