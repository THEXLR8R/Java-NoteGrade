package lecture13.task00;

enum  Gender {
    MALE('M', "He"),
    FEMALE('F', "She");

    private final char abbreviation;
    private final String genderPronoun;

    Gender(char abbreviation, String genderPronoun) {
        this.abbreviation = abbreviation;
        this.genderPronoun = genderPronoun;
    }

    static Gender of(char abbreviation) {
        for (Gender gender : Gender.values()) {
            if (gender.abbreviation == abbreviation) {
                return gender;
            }
        }

        throw new IllegalArgumentException("No gender for abbreviation: " + abbreviation);
    }

    public String getPronoun() {
        return this.genderPronoun;
    }


}
