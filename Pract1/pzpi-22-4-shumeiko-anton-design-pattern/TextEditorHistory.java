import java.util.Stack;

public class TextEditorHistory {
    private final Stack<TextEditor.EditorState> history = new Stack<>();

    public void save(TextEditor editor) {
        history.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!history.isEmpty()) {
            editor.restore(history.pop());
        }
    }
}
