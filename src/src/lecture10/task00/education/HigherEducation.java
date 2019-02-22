package lecture10.task00.education;

import java.time.LocalDate;

public class HigherEducation extends GradedEducation {

    public HigherEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate) {
        super(institutionName, enrollmentDate, graduationDate);
    }

}
