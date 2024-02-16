package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    String name;
    int gradeKor;
    int gradeEng;
    int gradeMath;
    private int rank;

    // 생성자
    public Student(String name, int gradeKor, int gradeEng, int gradeMath) {
        super();
        this.name = name;
        this.gradeKor = gradeKor;
        this.gradeEng = gradeEng;
        this.gradeMath = gradeMath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeKor() {
        return gradeKor;
    }

    public void setGradeKor(int gradeKor) {
        this.gradeKor = gradeKor;
    }

    public int getGradeEng() {
        return gradeEng;
    }

    public void setGradeEng(int gradeEng) {
        this.gradeEng = gradeEng;
    }

    public int getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(int gradeMath) {
        this.gradeMath = gradeMath;
    }

    @Override
    public String toString() {
        return "Student [rank=" + rank + ", name=" + name + ", gradeKor=" + gradeKor + ", gradeEng=" + gradeEng
                + ", gradeMath=" + gradeMath + "]";
    }

    // 성적 총합
    public int getSum() {
        return gradeEng + gradeKor + gradeMath;
    }

    // 성적 평균
    public double getAvg() {
        return (gradeEng + gradeKor + gradeMath) / 3.0;
    }

    public static void main(String[] args) {
        // 생성자 생성
        Student stu1 = new Student("Tony", 80, 95, 70);
        Student stu2 = new Student("Tiffany", 90, 80, 70);
        Student stu3 = new Student("Jennifer", 90, 80, 70);

        // 성적 총합을 기준으로 정렬
        List<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        Collections.sort(students, Comparator.comparingInt(Student::getSum).reversed());

        // 등수 부여
        int rank = 1;
        int prevSum = -1;
        for (Student student : students) {
            if (student.getSum() == prevSum) {
                student.rank = rank - 1;
            } else {
                student.rank = rank++;
            }
            prevSum = student.getSum();
        }

        // 출력
        for (Student student : students) {
            System.out.println(student);
        }

        // 구분선 출력
        System.out.println("----------------------------");

        // 전체 총합, 평균, 등수 출력
        int totalSum = 0;
        double totalAvg = 0;
        for (Student student : students) {
            totalSum += student.getSum();
        }
        totalAvg = totalSum / (double) students.size();
        int totalRank = 1;
        for (Student student : students) {
            if (student.getSum() < students.get(0).getSum()) {
                totalRank++;
            } else {
                student.rank = totalRank;
            }
        }
        System.out.println("전체 총합: " + totalSum);
        System.out.println("전체 평균: " + totalAvg);
        System.out.println("전체 등수: " + totalRank);
    }
}
