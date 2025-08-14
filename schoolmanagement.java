class Institute {
    String name;
    Institute(String name) {
        this.name = name;
        System.out.println("Institute name: " + name);
    }
}

class School extends Institute {
    String student_name = "Harika";
    int roll_no = 21;
    int marks = 85;
	
   School(String instituteName) {
        super(instituteName);
    }

    void display() {
        System.out.println("Student Name: " + student_name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks: " + marks);
		 System.out.println("attendance percentage:"+percentage);
        System.out.println("Grade:"+grade);
        System.out.println("section:"+section);
    }
}
public class  schoolmanagement {
    public static void main(String[] args) {
        School s = new School("Annamacharya");
        s.display();
    }
}