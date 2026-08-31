package behavioral.memento;

public class TextEditor {

    private String content = "";

    public void write(String text) {

        content += text;
    }

    public EditorMemento save() {

        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {

        if (memento == null) {
            throw new IllegalArgumentException(
                    "Memento cannot be null"
            );
        }

        content = memento.getContent();
    }

    public String getContent() {
        return content;
    }
}
