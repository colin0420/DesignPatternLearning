package main.java.cmd.client;

import main.java.cmd.command.Command;
import main.java.cmd.command.ExitCommand;
import main.java.cmd.command.HelperCommand;
import main.java.cmd.invoker.FunctionButtonInvoker;

public class Client {
    public static void main(String[] args) {
        FunctionButtonInvoker functionButtonInvoker = new FunctionButtonInvoker();

        // 执行退出命令
        Command command1 = new ExitCommand();
        functionButtonInvoker.setCommand(command1);
        functionButtonInvoker.click();

        // 执行帮助命令
        Command command2 = new HelperCommand();
        functionButtonInvoker.setCommand(command2);
        functionButtonInvoker.click();
    }
}
