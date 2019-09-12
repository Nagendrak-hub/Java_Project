package Proporities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Reading {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\dev03\\eclipse-workspace\\SampleJava\\src\\Proporities\\Cofigu");

		prop.load(fis);
		System.out.println(prop.getProperty("Url"));
		System.out.println(prop.getProperty("browser"));
	}
}
