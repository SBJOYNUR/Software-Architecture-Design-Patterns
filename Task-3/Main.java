// Document.java
abstract class Document {
    public abstract String getContent();
}

// PlainTextDocument.java
class PlainTextDocument extends Document {
    private String content;

    public PlainTextDocument(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

// PDFDocument.java
class PDFDocument extends Document {
    private String content;

    public PDFDocument(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}

// Printer.java
class Printer {
    public void print(Document document) {
        String content = document.getContent();
        System.out.println("Printing the document:\n" + content);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Document plainTextDoc = new PlainTextDocument("SB Joynur");
        Document pdfDoc = new PDFDocument("This is a PDF document.");

        Printer printer = new Printer();
        printer.print(plainTextDoc);
        System.out.println("Software Engineering");
        printer.print(pdfDoc);
    }
}