package pl.exercise.ferry.screen.menu;

import pl.exercise.ferry.CruiseInfo;

import java.io.*;
import java.util.Scanner;

public class FileScreen {
    private final CruiseInfo cruiseInfo;
    Scanner in = new Scanner(System.in);

    public FileScreen(CruiseInfo cruiseInfo) {
        this.cruiseInfo = cruiseInfo;
    }

    public void exitWriter(){
        String dir = "src/AppFiles/" + cruiseInfo.getName() + ".txt";
        try(FileWriter fileWriter = new FileWriter(dir)){
            fileWriter.write(cruiseInfo.toString());
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    public void fileWriter(){
        isNameAlreadyUsed();
        exitWriter();
    }

    private void isNameAlreadyUsed() {
        File file = new File(cruiseInfo.getName());
        while(true){
            if(file.exists()) {
                System.out.println("Cruise name already in use, do you want to change it [0] or overwrite [1]?");
                int n = in.nextInt();
                if (n == 0){
                    System.out.println("Write new name");
                    cruiseInfo.setName(in.nextLine());
                    isNameAlreadyUsed();
                }
                else if(n==1) break;
            }
            break;
        }

    }

    public void readFile(){
        String name = chooseFile();
        String dir = "src/AppFiles/" + name;
        try(FileReader reader = new FileReader(dir);
        BufferedReader br = new BufferedReader(reader)){
            String line;
        while((line = br.readLine()) !=null){
            System.out.println(line);
        }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException a){
            System.out.println(a.getMessage());
        }
        System.out.println();
        pressAnyKeyToContinue();
    }

    private String chooseFile() {
        String name ="";
        File file = new File("src/AppFiles/");
        File[] listOfFiles = file.listFiles();
        for(int i =0; i<listOfFiles.length; i++){
            if(listOfFiles[i].isFile()){
                System.out.println("File: " + listOfFiles[i].getName());
            }
        }
        outerloop:
        while(true) {
            System.out.println("Which file you want to read ?");
            name = in.nextLine();
            for (int i = 0; i < listOfFiles.length; i++) {
                if(listOfFiles[i].getName().equals(name)) {
                    break outerloop;
                }
            }
        }
        return name;
    }
    private void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
