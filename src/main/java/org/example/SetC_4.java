//In a publishing company, you need to process multiple documents.
// Each document contains a list of lines represented as String.
// You need to count the number of words across all documents.

package org.example;
import java.util.*;
import java.util.stream.*;
import java.util.*;

class Document {
    List<String> lines;

    Document(List<String> lines) {
        this.lines = lines;
    }
}

public class SetC_4 {
    static long countWordsInDocuments(List<Document> documents) {
         return documents.stream()
                .flatMap(d -> d.lines.stream())
                 .flatMap(s -> Arrays.stream(s.split(" ")))
                 .count();

    }

    public static void main(String[] args) {

        Document doc1 = new Document(Arrays.asList(
                "Java streams are powerful",
                "They simplify data processing"
        ));

        Document doc2 = new Document(Arrays.asList(
                "Streams work with collections",
                "They support functional style"
        ));

        List<Document> documents = Arrays.asList(doc1, doc2);

        long totalWords = countWordsInDocuments(documents);

        System.out.println("Total word count: " + totalWords);
    }
}
