package lecture10.task00.education;

import java.time.LocalDate;

public class PrimaryEducation extends Education {

    public PrimaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate) {
        super(institutionName, enrollmentDate, graduationDate);
    }

    @Override
    public void graduate() {
        super.graduate();
    }

}
