package main.java.cmd.command;

import main.java.cmd.receiver.ExitCommandReceiver;

/**
 * 退出命令-具体命令
 */
public class ExitCommand extends Command {
    ExitCommandReceiver exitCommandReceiver;

    public ExitCommand() {
        exitCommandReceiver = new ExitCommandReceiver();
    }

    @Override
    public void execute() {
        exitCommandReceiver.exit();
    }
}
