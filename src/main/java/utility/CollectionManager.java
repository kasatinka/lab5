package utility;

import data.SpaceMarine;
import exceptions.OutOfIDsException;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class CollectionManager {
    private Deque<SpaceMarine> marinesCollection = new ArrayDeque<>();
    private final LocalDateTime lastInitTime;
    private final LocalDateTime lastSaveTime;
    private FileManager fileManager;
    private List<Integer> IDs;

    public CollectionManager(String fileName) {
        this.lastInitTime = null;
        this.lastSaveTime = null;
        this.fileManager = new FileManager(fileName);
        loadCollection();
    }

    public Deque<SpaceMarine> getMarinesCollection() {
        return marinesCollection;
    }

    public Integer generateID() throws OutOfIDsException {
        for (Integer i = 1; i < Integer.MAX_VALUE; i++) {
            if (!IDs.contains(i)) {
                return i;
            }
        }
        throw new OutOfIDsException();

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
