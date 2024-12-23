public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    /** Remove a student from the course */
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // Move students[i + 1] to students[i], etc.
                for (int k = i + 1; k < numberOfStudents; k++) {
                    students[k - 1] = students[k];
                }
                numberOfStudents--;
                break;
            }
        }
    }
}
