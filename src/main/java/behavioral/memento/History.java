package behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {

    private final Deque<EditorMemento> history =
            new ArrayDeque<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {

        if (history.isEmpty()) {
            return null;
        }

        return history.pop();
    }
}
