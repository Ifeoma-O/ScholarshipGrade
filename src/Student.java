public class Student {
    int score;
    Student(){
        score = 180;
    }
    void printStatus(){
        if(score > 175){
            System.out.println("Scholarship granted");
        }
        else{
            System.out.println("Scholarship not granted");
        }
    }
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println("Scholarship status of David:");
        std.printStatus();
    }
}
