package amata1219.amalib.string;

import org.bukkit.entity.Player;

public class StringLocalize {

	public static String apply(String text, Player player){
		return text.split(" | ", 2)[player.getLocale().equals("ja_jp") ? 0 : 1];
	}

	public static String capply(String text, Player player){
		return StringColor.color(apply(text, player));
	}

}