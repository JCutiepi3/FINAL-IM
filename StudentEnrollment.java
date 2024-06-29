
import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment {
    private String studentNumber;
    private List<String> courseCodes;
    private String term;
    private String academicYear;

    public StudentEnrollment(String studentNumber, String term, String academicYear) {
        this.studentNumber = studentNumber;
        this.courseCodes = new ArrayList<>();
        this.term = term;
        this.academicYear = academicYear;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public List<String> getCourseCodes() {
        return courseCodes;
    }

    public void addCourseCode(String courseCode) {
        courseCodes.add(courseCode);
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "studentNumber='" + studentNumber + '\'' +
                ", courseCodes=" + courseCodes +
                ", term='" + term + '\'' +
                ", academicYear='" + academicYear + '\'' +
                '}';
    }
}
