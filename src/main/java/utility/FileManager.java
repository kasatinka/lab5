package utility;

import data.SpaceMarine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Deque;

public class FileManager {
    private String fileName;
    private final XMLHandler xmlHandler = new XMLHandler();
    private File file;

    public FileManager(String fileName) {
        this.fileName = fileName;
        this.file = new File(fileName);
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

    /*public ArrayDeque<SpaceMarine> load(){

    }*/
}
