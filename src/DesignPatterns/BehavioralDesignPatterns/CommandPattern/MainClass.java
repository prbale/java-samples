package DesignPatterns.BehavioralDesignPatterns.CommandPattern;

import DesignPatterns.BehavioralDesignPatterns.CommandPattern.FileSystem.FileSystemReceiver;

/**
 * Created by Prashant on 17-07-2017.
 */

/*
        FileSystemClient
 s*/
public class MainClass {

    public static void main(String[] args) {


        FileSystemReceiver receiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommand openFileCommand = new OpenFileCommand(receiver);
        FileInvoker file = new FileInvoker(openFileCommand);
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(receiver);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(receiver);
        file = new FileInvoker(closeFileCommand);
        file.execute();

    }
}