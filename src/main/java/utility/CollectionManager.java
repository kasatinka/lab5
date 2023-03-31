package utility;

import data.SpaceMarine;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;

/*                 CollectionManager
                         info
                   collection itself
 *                       / \
 *                      /   \
 *                     /     \
 *           FileManager     MarineManager
              r/w file        id generator
                  |         validation logic
                  |
 *            XMLHandler

                  =)
 * */

public class CollectionManager {
    private final FileManager fileManager;
    private final MarineManager marineManager;
    private Deque<SpaceMarine> marinesCollection = new ArrayDeque<>();
    private LocalDateTime lastLoadTime;
    private LocalDateTime lastSaveTime;

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

    public void setMarinesCollection(Deque<SpaceMarine> d) {
        this.marinesCollection = d;
    }

    public void clearMarinesCollection() {
        this.marinesCollection = new ArrayDeque<>();
    }

    private void loadCollection() {
        lastLoadTime = LocalDateTime.now();
        setMarinesCollection(fileManager.load());
    }

    public String saveCollection() {
        lastSaveTime = LocalDateTime.now();
        return fileManager.save(this.marinesCollection);
    }
}
