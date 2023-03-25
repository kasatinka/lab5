package utility;

import data.SpaceMarine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class FileManager {
    private Scanner fileScanner;
    private String fileName;
    private final XMLHandler xmlHandler = new XMLHandler();
    private File file;

    public FileManager(String fileName) {
        this.fileName = fileName;
        this.file = new File(fileName);
        this.fileScanner = new Scanner(fileName);
    }

    public String save(Deque<SpaceMarine> marinesCollection) {
        try (FileWriter collectionFileWriter = new FileWriter(file)) {
            String s = "";
            for (SpaceMarine marine : marinesCollection) {
                s += xmlHandler.spaceMarineToXML(marine);
            }
            collectionFileWriter.write(s);
            return "Collection is saved";
        } catch (IOException exception) {
            return "Can't access file";
        }
    }

    public ArrayDeque<SpaceMarine> load() {
        ArrayDeque<SpaceMarine> d = new ArrayDeque<>();
        return d;
    }
}
