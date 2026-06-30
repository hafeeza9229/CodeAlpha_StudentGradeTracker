package Model;

/**
 * Letter grade derived from a student's marks.
 * Kept as an enum (instead of a raw String) so the compiler guarantees
 * every grade in the system is one of these valid values.
 */
public enum Grade {
    A_PLUS("A+"),
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    F("F");

    private final String label;

    Grade(String label) {
        this.label = label;
    }

    /**
     * Maps a numeric mark to its corresponding grade band.
     */
    public static Grade fromMarks(double marks) {
        if (marks >= 90) return A_PLUS;
        if (marks >= 80) return A;
        if (marks >= 70) return B;
        if (marks >= 60) return C;
        if (marks >= 50) return D;
        return F;
    }

    @Override
    public String toString() {
        return label;
    }
}