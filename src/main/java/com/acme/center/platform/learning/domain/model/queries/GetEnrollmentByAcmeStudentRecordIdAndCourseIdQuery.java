package com.acme.center.platform.learning.domain.model.queries;

import com.acme.center.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;

public record GetEnrollmentByAcmeStudentRecordIdAndCourseIdQuery(AcmeStudentRecordId acmeStudentRecordId, Long courseId) {

    public GetEnrollmentByAcmeStudentRecordIdAndCourseIdQuery {
        if (acmeStudentRecordId == null || courseId == null || courseId <= 0) {
            throw new IllegalArgumentException("acmeStudentRecordId and courseId must not be null or empty");
        }
    }
}
