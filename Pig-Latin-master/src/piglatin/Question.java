package piglatin;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Question {

    static final String menuFileEasy = "qData/easyQandA.txt";
    static final String menuFileMedium = "qData/mediumQandA.txt";
    static final String menuFileHard = "qData/hardQandA.txt";
    static private String itemsEasy[];
    static private String itemsMedium[];
    static private String itemsHard[];
    static Random rand = new Random();

    static void setQEasy() {
        ClassLoader loader = Question.class.getClassLoader();
        ArrayList<String> easySet = new ArrayList<>();
        InputStream in = loader.getResourceAsStream(menuFileEasy);
        if (in == null) {
            System.out.println("Could not access file " + menuFileEasy);
            return;
        }
        Scanner scanFile = new Scanner(in);
        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            if (line.startsWith("#") || line.startsWith(" #") || line.equals("")) {
                continue;
            }
            easySet.add(line);
        }
        scanFile.close();

        itemsEasy = new String[10];
        for (int i = 0; i < itemsEasy.length; i++) {
            int r = rand.nextInt(easySet.size() - 1) + 1;
            itemsEasy[i] = easySet.get(r);
            easySet.remove(r);
        }

    }

    public static String[] getQEasy() {
        return itemsEasy;
    }

    static void setQMedium() {
        ClassLoader loader = Question.class.getClassLoader();
        ArrayList<String> mediumSet = new ArrayList<>();
        InputStream in = loader.getResourceAsStream(menuFileMedium);
        if (in == null) {
            System.out.println("Could not access file " + menuFileMedium);
            return;
        }
        Scanner scanFile = new Scanner(in);
        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            if (line.startsWith("#") || line.startsWith(" #") || line.equals("")) {
                continue;
            }
            mediumSet.add(line);
        }
        scanFile.close();

        itemsMedium = new String[10];
        for (int i = 0; i < itemsMedium.length; i++) {
            int r = rand.nextInt(mediumSet.size() - 1) + 1;
            itemsMedium[i] = mediumSet.get(r);
            mediumSet.remove(r);
        }
    }

    public static String[] getQMedium() {
        return itemsMedium;
    }

    static void setQHard() {
        ClassLoader loader = Question.class.getClassLoader();
        ArrayList<String> hardSet = new ArrayList<>();
        InputStream in = loader.getResourceAsStream(menuFileHard);
        if (in == null) {
            System.out.println("Could not access file " + menuFileHard);
            return;
        }
        Scanner scanFile = new Scanner(in);
        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            if (line.startsWith("#") || line.startsWith(" #") || line.equals("")) {
                continue;
            }
            hardSet.add(line);
        }
        scanFile.close();

        itemsHard = new String[5];
        for (int i = 0; i < itemsHard.length; i++) {
            int r = rand.nextInt(hardSet.size() - 1) + 1;
            itemsHard[i] = hardSet.get(r);
            hardSet.remove(r);
        }
    }

    public static String[] getQHard() {
        return itemsHard;
    }

}
