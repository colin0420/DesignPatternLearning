package main.java.cmd.command;

import cmd.receiver.HelperCommandReceiver;

/**
 * 帮助命令-具体命令
 */
public class HelperCommand extends Command {
    HelperCommandReceiver helperCommandReceiver;

    public HelperCommand() {
        helperCommandReceiver = new HelperCommandReceiver();
    }

    @Override
    public void execute() {

    }
}
