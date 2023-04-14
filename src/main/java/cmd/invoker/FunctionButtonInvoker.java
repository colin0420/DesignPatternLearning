package main.java.cmd.invoker;

import main.java.cmd.command.Command;

/**
 * 功能按钮-调用者角色
 */
public class FunctionButtonInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        if (command != null) {
            command.execute();
        }
        throw new NullPointerException();
    }
}
