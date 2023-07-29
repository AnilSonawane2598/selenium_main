package congiguration_package;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readconfigfile_class {
	public Properties pro;

	public readconfigfile_class() {
		String s = "C:\\Users\\DELL\\eclipse-workspace\\Maven_project_File\\src\\test\\resources\\configuration_and_log4j\\config.properties";
		File f = new File(s);
		pro = new Properties();
		try {
			FileInputStream file = new FileInputStream(f);

			try {
				pro.load(file);
			} catch (IOException i) {
				i.printStackTrace();
			}
		} catch (FileNotFoundException t) {
			System.out.println(t.getMessage());
			t.printStackTrace();

		}
	}

	public String geturl() {
		return pro.getProperty("url");
	}

	public String getusername() {
		return pro.getProperty("username");
	}

	public String getpassword() {
		return pro.getProperty("password");
	}

	public String getchromedriver() {
		return pro.getProperty("chromedriver");
	}

	public String getedgedriver() {
		return pro.getProperty("edgedriver");
	}

}
