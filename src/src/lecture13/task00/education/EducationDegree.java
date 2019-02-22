package lecture13.task00.education;

public enum EducationDegree {

    NONE('N'),
    PRIMARY('P'),
    SECONDARY('S'),
    BACHELOR('B'),
    MASTER('M'),
    DOCTORATE('D');

    private final char abbreviation;

    EducationDegree(char abbreviation) {
        this.abbreviation = abbreviation;
    }

    public static EducationDegree of(char abbreviation) {

        for (EducationDegree degree : EducationDegree.values()) {
            if (degree.abbreviation == abbreviation) {
                return degree;
            }
        }

        throw new IllegalArgumentException("Unrecognized education code.");
    }

}
