package student;

import java.util.Scanner;

public class StudentInterface {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Scanner scan = new Scanner(System.in);

        String name;
        int score;
        double highestavg;
        double highestscore;
        String highavg;
        String highscore;

        while (true) {
            //Input first Student's data
            System.out.println("Enter name for first student (min 1 letter): ");
            name = scan.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test score %d for %s> ", i, stu1.getName());
                score = scan.nextInt();
                stu1.setScore(i, score);
            }
            String errormsg = stu1.validateData();
            if (errormsg == null){
                break;
            } else {
                System.out.println(errormsg);
                scan.nextLine(); //clear scanner buffer
            }
        }
        scan.nextLine();
        System.out.println("\n=======================\n");
        //input the second students data       
        //input first student's data
        System.out.println("Enter name for second student (min 1 letter): ");
        name = scan.nextLine();
        stu2.setName(name);
        for (int i = 1; i <= 3; i++) {
            System.out.format("Enter test score %d for %s> ", i, stu2.getName());
            score = scan.nextInt();
            stu2.setScore(i, score);
        }
        System.out.println("\n=======================\n");
        //output the Student's information
        System.out.println(stu1);
        System.out.println("\n=======================\n");
        System.out.println(stu2);

        if (stu1.getAverage() > stu2.getAverage()) {
            highestavg = stu1.getAverage();
            highavg = stu1.getName();
        } else {
            highestavg = stu2.getAverage();
            highavg = stu2.getName();
        }

        if (stu1.gethighScore() > stu2.gethighScore()) {
            highestscore = stu1.gethighScore();
            highscore = stu1.getName();
        } else {
            highestscore = stu2.gethighScore();
            highscore = stu2.getName();
        }

        System.out.format("%s has the highest average with %.2f\n", highavg, highestavg);
        System.out.format("%s has the highest score with %.2f", highscore, highestscore);

    }

}
