package com.acme.center.platform.learning.domain.model.queries;

import com.acme.center.platform.learning.domain.model.valueobjects.ProfileId;

public record GetStudentByProfileIdQuery(ProfileId profileId) {

    public GetStudentByProfileIdQuery {
        if (profileId == null) {
            throw new IllegalArgumentException("ProfileId cannot be null");
        }
    }
}
