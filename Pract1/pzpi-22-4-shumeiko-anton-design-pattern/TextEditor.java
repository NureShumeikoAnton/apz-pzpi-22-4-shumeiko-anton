public class TextEditor {
    private String text = "";
    private String fontName = "Arial";
    private int fontSize = 12;

    public String getText() {
        return text;
    }

    public void write(String text) {
        this.text += text;
    }

    public void setFont(String fontName, int fontSize) {
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    // Створення знімка
    public EditorState save() {
        return new EditorState(text, fontName, fontSize);
    }

    // Відновлення зі знімка
    public void restore(EditorState memento) {
        this.text = memento.getText();
        this.fontName = memento.getFontName();
        this.fontSize = memento.getFontSize();
    }

    // Вкладений клас Memento
    public static class EditorState {
        private final String text;
        private final String fontName;
        private final int fontSize;

        private EditorState(String text, String fontName, int fontSize) {
            this.text = text;
            this.fontName = fontName;
            this.fontSize = fontSize;
        }

        private String getText() {
            return text;
        }

        private String getFontName() {
            return fontName;
        }

        private int getFontSize() {
            return fontSize;
        }
    }
}
