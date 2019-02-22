package lecture09.task00.education;

import java.time.LocalDate;

public class Education {

    private boolean graduated;
    private LocalDate enrollmentDate;
    private LocalDate graduationDate;
    private String institutionName;

    Education(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate) {
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.institutionName = institutionName;
    }

    void graduate() {
        if (this.graduationDate.isAfter(LocalDate.now())) {
            // ERROR
            return;
        }

        this.graduated = true;
    }

    public boolean hasGraduated() {
        return graduated;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    @Override
    public String toString() {

        String enrollmentInfo = String.format("started %s on %s and", institutionName, enrollmentDate);

        String graduationState;

        if(hasGraduated()) {
            graduationState = "graduated";
        } else {
            graduationState = "is supposed to graduate";
        }

        return String.format("%s %s on %s", enrollmentInfo, graduationState, graduationDate);
    }

}
