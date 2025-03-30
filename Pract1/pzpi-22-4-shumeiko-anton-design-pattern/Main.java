public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorHistory history = new TextEditorHistory();

        // Перше редагування
        editor.write("Це перший абзац. ");
        editor.setFont("Times New Roman", 14);
        history.save(editor);

        // Друге редагування
        editor.write("Це другий абзац. ");
        history.save(editor);

        // Третє редагування
        editor.write("Це третій абзац. ");
        editor.setFont("Calibri", 16);

        // Відміна останніх змін
        System.out.println("Поточний текст: " + editor.getText());
        history.undo(editor);
        System.out.println("Після першого скасування: " + editor.getText());
        history.undo(editor);
        System.out.println("Після другого скасування: " + editor.getText());
    }
}