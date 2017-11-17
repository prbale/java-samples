package DesignPatterns.BehavioralDesignPatterns.CommandPattern;

import DesignPatterns.BehavioralDesignPatterns.CommandPattern.FileSystem.FileSystemReceiver;

/**
 * Created by Prashant on 18-07-2017.
 */
public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    WriteFileCommand(FileSystemReceiver receiver) {
        fileSystemReceiver = receiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
