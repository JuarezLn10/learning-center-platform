package com.acme.center.platform.learning.domain.model.queries;

import com.acme.center.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;

public record GetAllEnrollmentsByAcmeStudentRecordIdQuery(AcmeStudentRecordId studentRecordId) {

    public GetAllEnrollmentsByAcmeStudentRecordIdQuery {
        if (studentRecordId == null || studentRecordId.studentRecordId() == null) {
            throw new IllegalArgumentException("Student record ID cannot be null");
        }
    }
}
