
package DesignPatterns.BehavioralDesignPatterns.CommandPattern.FileSystem;

/**
 * Created by Prashant on 18-07-2017.
 */
public class UnixFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in Unix !!!");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Unix !!!");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Unix !!!");
    }
}
