package DesignPatterns.BehavioralDesignPatterns.CommandPattern;

import DesignPatterns.BehavioralDesignPatterns.CommandPattern.FileSystem.FileSystemReceiver;

/**
 * Created by Prashant on 18-07-2017.
 */
public class OpenFileCommand implements Command {

    private FileSystemReceiver fileSystemReceiver;

    OpenFileCommand(FileSystemReceiver receiver) {
        fileSystemReceiver = receiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.openFile();
    }
}
