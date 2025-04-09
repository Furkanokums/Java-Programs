package UmlStudentCourseFaculty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;
    private long stdNum;
    private double GPA;
    private Course regCourse;
    private ArrayList<Course> courseList= new ArrayList<>(3);
    private Map<String,Double> transcript=new HashMap<String,Double>();
    private static ArrayList<Integer> assignedStdNumber= new ArrayList<>();

}
