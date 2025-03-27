import java.util.*;

class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getDiscountedPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + getDiscountedPrice());
    }
}

public class CourseHierarchy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Course Name:");
        String courseName = in.nextLine();

        System.out.println("Enter Duration (weeks):");
        int duration = in.nextInt();
        in.nextLine();

        System.out.println("Enter Platform:");
        String platform = in.nextLine();

        System.out.println("Is the course recorded? (true/false):");
        boolean isRecorded = in.nextBoolean();

        System.out.println("Enter Course Fee:");
        double fee = in.nextDouble();

        System.out.println("Enter Discount Percentage:");
        double discount = in.nextDouble();

        PaidOnlineCourse paidCourse = new PaidOnlineCourse(courseName, duration, platform, isRecorded, fee, discount);
        
        System.out.println("\nCourse Details:");
        paidCourse.displayCourseDetails();
    }
}