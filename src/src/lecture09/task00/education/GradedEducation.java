package lecture09.task00.education;

import java.time.LocalDate;

public abstract class GradedEducation extends Education {

    private double finalGrade;

    GradedEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate) {
        super(institutionName, enrollmentDate, graduationDate);
    }

    public void graduate(double finalGrade) {
        super.graduate();
        this.finalGrade = finalGrade;
    }

    public double getFinalGrade() {

        if (hasGraduated()) {
            return finalGrade;
        }

        return -1;
    }

    @Override
    public String toString() {
        String info = super.toString();

        if(hasGraduated()) {
            info += String.format(" with a grade of %.3f", finalGrade);
        }

        return info;
    }


}
