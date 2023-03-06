package javaLesson.javaio;

import javaLesson.collections.map.treemap.AverageStudentGrade;
import javaLesson.collections.map.treemap.SubjectGrade;
import javaLesson.collections.map.treemap.TreeMapRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.NavigableMap;
import java.util.Set;

public class IOMain {
    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\User\\IdeaProjects\\arifmetika\\src\\com\\javalesson\\javaio\\GradeBook.txt");
            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("=============================================\n");
                writer.write("Student: " + gradeKey.getName() + " Average grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    writer.write("Subject: " + grade.getSubject() + " Grade: " + grade.getGrade() + "\n");
                }
            }
            System.out.println("Done!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
