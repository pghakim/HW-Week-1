package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//testing changes in git
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //List creation, adding elements and printing out
        List<String> studentList = new ArrayList<>();
        Collections.addAll(studentList, "Patrick", "John", "Marcus", "Grace");
        for (String s : studentList) System.out.println(s);
        System.out.println();

        //Set creation, adding elements and printing out, duplicate elements do not get added
        Set<Integer> studentID = new HashSet<>();
        Collections.addAll(studentID, 1, 1, 2, 3, 4);
        for (Integer s : studentID) System.out.println(s);
        System.out.println();

        //Map creation, adding key value pairs and printing out
        Map<String, Integer> studentGrade = new HashMap<String, Integer>();
        studentGrade.put("Patrick", 90);
        studentGrade.put("Patrick", 23);
        studentGrade.put("John", 74);
        studentGrade.put("Marcus", 100);
        studentGrade.put("Grace", 88);
        studentGrade.forEach((key, value) -> System.out.println(key + ":" + value));
        System.out.println();

        //Opens txt file and prints the contents
        try {
            File fruitList = new File("C:\\Users\\Patrick\\IdeaProjects\\maventest\\src\\main\\java\\org\\example\\fruit.txt");
            Scanner Reader = new Scanner(fruitList);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println();

        //Regex
        String regex = "\\w\\s\\w";
        String txt = "A B";

        Pattern regexPattern = Pattern.compile(regex);
        Matcher matcher = regexPattern.matcher(txt);

        boolean patternResult = matcher.matches();
        System.out.println("\nRegex result is " + patternResult);
    }
}