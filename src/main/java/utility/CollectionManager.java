package utility;


import data.SpaceMarine;

import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionManager {
    private final Deque<SpaceMarine> marinesCollection = new ArrayDeque<>();
    private final LocalDateTime lastInitTime;
    private final LocalDateTime lastSaveTime;
    private final FileManager fileManager;

    public CollectionManager(FileManager fileManager) {
        this.lastInitTime = null;
        this.lastSaveTime = null;
        this.fileManager = fileManager;

        loadCollection();
    }


    private void loadCollection() {
    }
}
