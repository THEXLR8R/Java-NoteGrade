package lecture11.task00.education;

import java.time.LocalDate;

public abstract class GradedEducation extends Education {

    private double finalGrade;

    GradedEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate) {
        super(institutionName, enrollmentDate, graduationDate);
    }

    public void graduate(double finalGrade) {

        if (finalGrade < 2 || 6 < finalGrade) {
            throw new IllegalArgumentException("Graduation grade is expected to be between 2 and 6.");
        }

        super.graduate();
        this.finalGrade = finalGrade;
    }

    public double getFinalGrade() {

        if (hasGraduated()) {
            return finalGrade;
        }

        throw new IllegalStateException("No final grade can be provided before graduation.");
    }

    @Override
    public String toString() {
        String info = super.toString();

        if (hasGraduated()) {
            info += String.format(" with a grade of %.3f", finalGrade);
        }

        return info;
    }

}
