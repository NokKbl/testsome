/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piglatin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vichakorn
 */
public class ScoreTable {

    private static ArrayList<String> easyScore = new ArrayList<String>();
    private static String[] topEasyScore;
    private static ArrayList<String> mediumScore = new ArrayList<String>();
    private static String[] topMediumScore;
    private static ArrayList<String> hardScore = new ArrayList<String>();
    private static String[] topHardScore;

    public static String recordScore(String namePlayer, String scorePlayer) {
        
        String text = "";
        text = String.format(text + "\n%s; %s", namePlayer, scorePlayer);
        return text;
    }

    public static void writeToFileEasy(String saveRecord) throws IOException, InterruptedException {
        File createTxt = new File("scoreData/TableScoreEasy.txt");
        FileOutputStream saveLog;
        try {
            saveLog = new FileOutputStream(createTxt, true);
            saveLog.write(saveRecord.getBytes());

        } catch (FileNotFoundException ex) {
            System.out.println("Couldn't open file " + createTxt);
            return;
        }
        saveLog.close();

    }

    public static void initEasy() {
		
                String readFile = "scoreData/TableScoreEasy.txt";
		ClassLoader loader = ScoreTable.class.getClassLoader();

		InputStream in = loader.getResourceAsStream(readFile);
		if (in == null) {
			System.out.println("Could not access file " + readFile);
			return;
		}

		Scanner scanFile = new Scanner(in);

		while (scanFile.hasNextLine()) {
			String line = scanFile.nextLine();
			if (line.startsWith("#") || line.startsWith(" #") || line.equals("")) {
				continue;
			}

			easyScore.add(line);
                        topEasyScore = easyScore.toArray(new String[easyScore.size()]);
		}
		scanFile.close();
		
		
	}
    
    public static String[] getEasyScore(){
        easyScore.removeAll(easyScore);
        return topEasyScore;
    }
    
    public static void writeToFileMedium(String saveRecord) throws IOException {
        File createTxt = new File("scoreData/TableScoreMedium.txt");
        FileOutputStream saveLog;
        try {
            saveLog = new FileOutputStream(createTxt, true);
            saveLog.write(saveRecord.getBytes());

        } catch (FileNotFoundException ex) {
            System.out.println("Couldn't open file " + createTxt);
            return;
        }
        saveLog.close();

    }

    public static void initMedium() {
		String readFile = "scoreData/TableScoreMedium.txt";
		ClassLoader loader = ScoreTable.class.getClassLoader();

		InputStream in = loader.getResourceAsStream(readFile);
		if (in == null) {
			System.out.println("Could not access file " + readFile);
			return;
		}

		Scanner scanFile = new Scanner(in);

		while (scanFile.hasNextLine()) {
			String line = scanFile.nextLine();
			if (line.startsWith("#") || line.startsWith(" #") || line.equals("")) {
				continue;
			}

			mediumScore.add(line);
                        topMediumScore = mediumScore.toArray(new String[mediumScore.size()]);
		}
		scanFile.close();
		
		
	}
    
    public static String[] getMediumScore(){
        mediumScore.removeAll(mediumScore);
        return topMediumScore;
    }
    
    public static void writeToFileHard(String saveRecord) throws IOException {
        File createTxt = new File("scoreData/TableScoreHard.txt");
        FileOutputStream saveLog;
        try {
            saveLog = new FileOutputStream(createTxt, true);
            saveLog.write(saveRecord.getBytes());

        } catch (FileNotFoundException ex) {
            System.out.println("Couldn't open file " + createTxt);
            return;
        }
        saveLog.close();

    }

    public static void initHard() {
		String readFile = "scoreData/TableScoreHard.txt";
		ClassLoader loader = ScoreTable.class.getClassLoader();

		InputStream in = loader.getResourceAsStream(readFile);
		if (in == null) {
			System.out.println("Could not access file " + readFile);
			return;
		}

		Scanner scanFile = new Scanner(in);

		while (scanFile.hasNextLine()) {
			String line = scanFile.nextLine();
			if (line.startsWith("#") || line.startsWith(" #") || line.equals("")) {
				continue;
			}

			hardScore.add(line);
                        topHardScore = hardScore.toArray(new String[hardScore.size()]);
		}
		scanFile.close();
		
		
	}
    public static String[] getHardScore(){
        hardScore.removeAll(hardScore);
        return topHardScore;
    }
}
