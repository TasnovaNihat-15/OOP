package practiceProblem_7;


import java.util.Date;

public class CourseOffering {
    private long studentId;
    private long instructorId;
    private long courseId;
    private Date time;
    private long sectionNo;
    private long roomId;
    private long year;
    private String semester;


    private Student student;

    private Course course;


    public CourseOffering(long studentId, long instructorId, long courseId,
                          Date time, long sectionNo, long roomId,
                          long year, String semester) {
        this.studentId = studentId;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }


    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(long instructorId) {
        this.instructorId = instructorId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public long getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(long sectionNo) {
        this.sectionNo = sectionNo;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }


    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return this.course;
    }

    @Override
    public String toString() {
        return "CourseOffering{" +
                "studentId=" + studentId +
                ", instructorId=" + instructorId +
                ", courseId=" + courseId +
                ", time=" + time +
                ", sectionNo=" + sectionNo +
                ", roomId=" + roomId +
                ", year=" + year +
                ", semester='" + semester + '\'' +
                '}';
    }
}
