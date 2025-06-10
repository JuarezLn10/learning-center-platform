package com.acme.center.platform.learning.domain.model.queries;

import com.acme.center.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;

public record ExistsByAcmeStudentRecordIdQuery(AcmeStudentRecordId studentRecordId) {

    public ExistsByAcmeStudentRecordIdQuery {
        if (studentRecordId == null) {
            throw new IllegalArgumentException("Student record ID cannot be null");
        }
    }
}
