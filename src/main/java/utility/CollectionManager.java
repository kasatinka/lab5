package utility;

import data.SpaceMarine;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionManager {
    private Deque<SpaceMarine> marinesCollection = new ArrayDeque<>();
    private final LocalDateTime lastInitTime;
    private final LocalDateTime lastSaveTime;
    private FileManager fileManager;
    private MarineManager marineManager;
    public CollectionManager(String fileName) {
        this.lastInitTime = null;
        this.lastSaveTime = null;
        this.fileManager = new FileManager(fileName);
        this.marineManager = new MarineManager();
        loadCollection();
    }

    public Deque<SpaceMarine> getMarinesCollection() {
        return marinesCollection;
    }


    private void loadCollection() {

    }

    public void setMarinesCollection(Deque<SpaceMarine> d) {
        this.marinesCollection = d;
    }

    public String saveCollection() {
        return fileManager.save(this.marinesCollection);

    }
}
