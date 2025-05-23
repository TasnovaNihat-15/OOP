package practiceProblem_7;

public class Course {
    private long id;
    private String syllabus;
    private String title;
    private String credits;
    private String prerequisite;


    public Course(long id, String title, String syllabus, String credits, String prerequisite) {
        this.id = id;
        this.title = title;
        this.syllabus = syllabus;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", syllabus='" + syllabus + '\'' +
                ", credits='" + credits + '\'' +
                ", prerequisite='" + prerequisite + '\'' +
                '}';
    }
}
