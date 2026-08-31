package behavioral.memento;

public class MementoDemo {

    public static void main(String[] args) {

        System.out.println("=== Memento Pattern ===");

        TextEditor editor =
                new TextEditor();

        History history =
                new History();

        editor.write("Hello ");

        history.save(editor.save());

        editor.write("Java ");

        history.save(editor.save());

        editor.write("Developer");

        System.out.println(
                "Current: " + editor.getContent()
        );

        EditorMemento previousState =
                history.undo();

        editor.restore(previousState);

        System.out.println(
                "After undo: " + editor.getContent()
        );
    }
}
