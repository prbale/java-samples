package DesignPatterns.BehavioralDesignPatterns.CommandPattern.FileSystem;

/**
 * Created by Prashant on 18-07-2017.
 */
public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
