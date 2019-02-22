package lecture07.task00;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SecondaryEducation {
    float finalGrade;
    boolean graduated;
    LocalDate enrollmentDate;
    LocalDate graduationDate;
    String institutionName;

    SecondaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate) {
        this.institutionName = institutionName;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
    }

    LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    LocalDate getGraduationDate() {
        return graduationDate;
    }

    String getInstitutionName() {
        return institutionName;
    }

    void graduatedWith(float finalGrade) {

        if (graduationDate.isAfter(LocalDateTime.now().toLocalDate())) {
            // ERROR
            return;
        }

        this.finalGrade = finalGrade;
        this.graduated = true;
    }

    float getFinalGrade() {

        if (graduated) {
            return finalGrade;
        }

        return -1;
    }

    boolean hasGraduated() {
        return graduated;
    }

}
