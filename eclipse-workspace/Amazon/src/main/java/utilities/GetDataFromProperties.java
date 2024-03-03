package utilities;

import java.util.ResourceBundle;

public class GetDataFromProperties {

	public static String url;
	public static String username;
	public static String pwd;

	public static ResourceBundle readFromPropertyFile() {

		ResourceBundle file = ResourceBundle.getBundle("property");
		return file;
	}


	public static String getUrl() {
		return url= readFromPropertyFile().getString("url");
	}


	public static String getUsername() {
		return username = readFromPropertyFile().getString("username");
	}

	public static String getPwd() {
		return pwd = readFromPropertyFile().getString("pwd");
	}
}
