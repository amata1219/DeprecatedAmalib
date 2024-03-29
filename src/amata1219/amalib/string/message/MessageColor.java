package amata1219.amalib.string.message;

import amata1219.amalib.string.StringColor;

public class MessageColor {

	public static Message color(String text){
		return color('&', text);
	}

	public static Message color(char alternateColorCode, String text) {
		return Message.wrap(StringColor.color(alternateColorCode, text));
	}

}
