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

    public void fileWriter(String name, String content){
        isNameAlreadyUsed();
        String dir = "src/AppFiles/" + name + ".txt";
        try(FileWriter fileWriter = new FileWriter(dir)){
            fileWriter.write(content);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
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
        try(FileReader reader = new FileReader(name);
        BufferedReader br = new BufferedReader(reader)){
            String line;
        while((line = br.readLine()) !=null){
            System.out.println(line);
        }
        }catch(FileNotFoundException e){

        }catch (IOException a){}
    }

    private String chooseFile() {
        String name ="";
        String name2 = "";
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

}
