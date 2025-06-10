package com.acme.center.platform.learning.domain.model.queries;

import com.acme.center.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;

public record GetStudentByAcmeStudentRecordIdQuery(AcmeStudentRecordId acmeStudentRecordId) {

    public GetStudentByAcmeStudentRecordIdQuery {
        if (acmeStudentRecordId == null) {
            throw new IllegalArgumentException("acmeStudentRecordId must not be null");
        }
    }
}
