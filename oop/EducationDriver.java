class Graduation {
    String degree;
    String university;
    String year;
    String grade;

    Graduation(String degree, String university, String year, String grade) {
        this.degree = degree;
        this.university = university;
        this.year = year;
        this.grade = grade;
    }

    void displayGraduationDetails() {
        System.out.println("***Graduation Details***");
        System.out.println("Degree: " + degree);
        System.out.println("University: " + university);
        System.out.println("Year: " + year);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

class Engineering extends Graduation {
    String branch;
    String specialization;

    Engineering(String degree, String university, String year, String grade, String branch, String specialization) {
        super(degree, university, year, grade);
        this.branch = branch;
        this.specialization = specialization;
    }

    void displayEngineeringDetails() {
        System.out.println("***Engineering Details***");
        System.out.println("Branch: " + branch);
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Mechanical extends Engineering {
    String projectTitle;
    String mentorName;

    Mechanical(String degree, String university, String year, String grade, String branch, String specialization, String projectTitle, String mentorName) {
        super(degree, university, year, grade, branch, specialization);
        this.projectTitle = projectTitle;
        this.mentorName = mentorName;
    }

    void displayMechanicalDetails() {
        System.out.println("***Mechanical Engineering Details***");
        System.out.println("Project Title: " + projectTitle);
        System.out.println("Mentor Name: " + mentorName);
        System.out.println();
    }
}

class EducationDriver {
    public static void main(String[] args) {
        Graduation grad = new Graduation("B.Sc.", "XYZ University", "2022", "A");
        grad.displayGraduationDetails();

        Engineering engg = new Engineering("B.E.", "ABC University", "2023", "A+", "Computer Science", "Artificial Intelligence");
        engg.displayGraduationDetails();
       

        Mechanical mech = new Mechanical("B.Tech", "DYP University", "2024", "A+", "Mechanical", "Robotics", "Autonomous Vehicles", "Dr. John SIR");
        mech.displayGraduationDetails();
      
    }
}