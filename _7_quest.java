//Question: Create a Student class with private attributes name, rollNumber, and marks. Provide public getter and setter methods to access and update these attributes.

class Student {
    private String name;
    private int rollNumber;
    private int marks;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Name of student is: " + name);
        System.out.println("Roll number of student is: " + rollNumber);
        System.out.println("Marks of student is: " + marks);
    }
}

class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Aman");
        st.setRollNumber(101);
        st.setMarks(70);
        st.displayStudentDetails();
    }
}
