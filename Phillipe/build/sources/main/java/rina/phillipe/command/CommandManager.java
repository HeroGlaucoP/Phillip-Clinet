package rina.phillipe.command;

import com.mojang.realmsclient.gui.ChatFormatting;

import java.util.ArrayList;

public class CommandManager {
    private static ArrayList<Command> commands;
    boolean b;

    public static void addCommand(Command c) {
        commands.add(c);
    }

    public static ArrayList<Command> getCommands() {
        return commands;
    }

    public void callCommand(String input) {
        String[] split = input.split(" (?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        String command = split[0];
        String args = input.substring(command.length()).trim();
        b = false;
        commands.forEach(c -> {
            for (String s : c.getAlias()) {
                if (s.equalsIgnoreCase(command)) {
                    b = true;
                    try {
                        c.onCommand(args, args.split(" (?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)"));
                    } catch (Exception e) {
                        Command.sentClientMessage(ChatFormatting.DARK_RED + c.getSyntax());
                    }
                }
            }
        });
        if (!b) Command.sentClientMessage(ChatFormatting.DARK_RED + "Comando desconhecido!");
    }
}
