package utility;

import data.SpaceMarine;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;

/*
 *                CollectionManager
 *                       / \
 *                      /   \
 *                     /     \
 *           FileManager     MarineManager
 *                |
 *                |
 *            XMLHandler
 * */

public class CollectionManager {
    private Deque<SpaceMarine> marinesCollection = new ArrayDeque<>();
    private LocalDateTime lastLoadTime;
    private LocalDateTime lastSaveTime;
    private FileManager fileManager;
    private MarineManager marineManager;

    public CollectionManager(String fileName) {
        this.lastLoadTime = null;
        this.lastSaveTime = null;
        this.fileManager = new FileManager(fileName);
        this.marineManager = new MarineManager();
        loadCollection();
    }

    public Deque<SpaceMarine> getMarinesCollection() {
        return marinesCollection;
    }


    private void loadCollection() {
        lastLoadTime = LocalDateTime.now();
        setMarinesCollection(fileManager.load());
    }

    public void setMarinesCollection(Deque<SpaceMarine> d) {
        this.marinesCollection = d;
    }

    public String saveCollection() {
        lastSaveTime = LocalDateTime.now();
        return fileManager.save(this.marinesCollection);
    }
}
