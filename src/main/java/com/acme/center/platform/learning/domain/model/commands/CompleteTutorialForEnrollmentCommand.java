package com.acme.center.platform.learning.domain.model.commands;

import com.acme.center.platform.learning.domain.model.valueobjects.TutorialId;

public record CompleteTutorialForEnrollmentCommand(TutorialId tutorialId, Long enrollmentId) {

    public CompleteTutorialForEnrollmentCommand {
        if (tutorialId == null || tutorialId.tutorialId() <= 0) {
            throw new IllegalArgumentException("TutorialId cannot be null nor negative.");
        }
        if (enrollmentId == null || enrollmentId <= 0) {
            throw new IllegalArgumentException("EnrollmentId must be a positive number.");
        }
    }
}
