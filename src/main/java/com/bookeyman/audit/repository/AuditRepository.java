package com.bookeyman.audit.repository;

import com.bookeyman.audit.entities.AuditReport;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AuditRepository extends ReactiveMongoRepository<AuditReport, String> {

}
