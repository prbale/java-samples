package DesignPatterns.BehavioralDesignPatterns.CommandPattern;

/**
 * Created by Prashant on 17-07-2017.
 */

public class FileInvoker {

    public Command command;

    public FileInvoker(Command c) {
        command = c;
    }

    public void execute() {
        command.execute();
    }

}