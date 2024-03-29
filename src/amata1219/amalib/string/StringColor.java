package amata1219.amalib.string;

public class StringColor {

	private static final String COLORS = "0123456789AaBbCcDdEeFfKkLlMmNnOoRr";
	private static final String NULL = String.valueOf(Character.MIN_VALUE);

	public static String color(String text){
		return color('&', text);
	}

	public static String color(char alternateColorCode, String text) {
		//文字列を1文字ずつに分解する
		char[] characters = text.toCharArray();

		//各文字に対して処理をする
		for(int i = 0; i < characters.length - 1; i++){
			char color = characters[i + 1];

			//装飾コードでなければ戻る
			if(characters[i] != alternateColorCode || COLORS.indexOf(color) <= -1)
				continue;

			if(i > 0 && characters[i - 1] == '-')
				characters[i - 1] = Character.MIN_VALUE;

			characters[i] = '§';
			characters[i + 1] = Character.toLowerCase(color);

			if(i < characters.length - 2 && characters[i + 2] == '-'){
				characters[i + 2] = Character.MIN_VALUE;

				//2文字分先に進める
				i += 2;
			}else{
				//1文字分先にすすめる
				i++;
			}
		}
		return new String(characters).replace(NULL, "");
	}

}
