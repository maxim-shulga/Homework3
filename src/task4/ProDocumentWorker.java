package task4;

public class ProDocumentWorker extends DocumentWorker{
    final public static String key = "456";

    public void editDocument(){
        System.out.println("The document is edited");
    }
    public void saveDocument(){
        System.out.println("The document is saved in the old format, Saving in other formats is only available in Expert version");
    }
}
