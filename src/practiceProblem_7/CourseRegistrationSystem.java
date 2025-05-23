package practiceProblem_7;

public class CourseRegistrationSystem {
    public static void main(String[] args) {

        Student student1 = new Student(1001, "John Smith", "Computer Science");
        Student student2 = new Student(1002, "Emma Johnson", "Information Technology");


        Instructor instructor1 = new Instructor(5001, "Dr. Michael Brown", "Computer Science", "Professor");
        Instructor instructor2 = new Instructor(5002, "Dr. Susan Miller", "Mathematics", "Associate Professor");


        Course course1 = new Course(3001, "Introduction to Programming", "Basic programming concepts and paradigms", "3", "None");
        Course course2 = new Course(3002, "Database Systems", "Database design and SQL", "4", "Introduction to Programming");


        CourseOffering offering1 = new CourseOffering(
                student1.getId(), instructor1.getId(), course1.getId(),
                new Date(), 1, 101, 2023, "FA"
        );

        CourseOffering offering2 = new CourseOffering(
                student2.getId(), instructor2.getId(), course2.getId(),
                new Date(), 2, 202, 2023, "FA"
        );


        offering1.setStudent(student1);
        offering1.setInstructor(instructor1);
        offering1.setCourse(course1);

        offering2.setStudent(student2);
        offering2.setInstructor(instructor2);
        offering2.setCourse(course2);


        System.out.println("===== Course Registration System Demo =====\n");

        System.out.println("Course Offering 1:");
        System.out.println("Student: " + offering1.getStudent().getName());
        System.out.println("Instructor: " + offering1.getInstructor().getName());
        System.out.println("Course: " + offering1.getCourse().getTitle());
        System.out.println("Section: " + offering1.getSectionNo());
        System.out.println("Room: " + offering1.getRoomId());
        System.out.println("Semester: " + offering1.getSemester() + " " + offering1.getYear());
        System.out.println();

        System.out.println("Course Offering 2:");
        System.out.println("Student: " + offering2.getStudent().getName());
        System.out.println("Instructor: " + offering2.getInstructor().getName());
        System.out.println("Course: " + offering2.getCourse().getTitle());
        System.out.println("Section: " + offering2.getSectionNo());
        System.out.println("Room: " + offering2.getRoomId());
        System.out.println("Semester: " + offering2.getSemester() + " " + offering2.getYear());
    }
}
