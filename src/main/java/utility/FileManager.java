package utility;

import data.SpaceMarine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class FileManager {
    private final XMLHandler xmlHandler = new XMLHandler();
    private final File file;
    private Scanner fileScanner;
    private String fileName;
    private FileWriter fileWriter;

    public FileManager(String fileName) {
        this.fileName = fileName;
        this.file = new File(fileName);
        this.fileScanner = new Scanner(fileName);   ////
        try {
            this.fileWriter = new FileWriter(file); ////
        } catch (IOException e) {
            System.out.println("Can't access file");
        }
    }

    public String save(Deque<SpaceMarine> marinesCollection) {
        try (FileWriter collectionFileWriter = new FileWriter(file)) {
            String s = "";
            s += getXMLHeader();
            for (SpaceMarine marine : marinesCollection) {
                s += xmlHandler.spaceMarineToXML(marine);
            }
            s += getXMLFooter();
            collectionFileWriter.write(s);
            return "Collection is saved";
        } catch (IOException exception) {
            return "Can't access file";
        }
    }

    public ArrayDeque<SpaceMarine> load() {
        ArrayDeque<SpaceMarine> d = new ArrayDeque<>();
        //d.add(xmlHandler.xmlToSpaceMarine(this.file));


        return d;
    }

    private String getXMLHeader() {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>";
    }

    private String getXMLFooter() {
        return "";
    }
}
