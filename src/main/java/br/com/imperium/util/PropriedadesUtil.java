package br.com.imperium.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropriedadesUtil {
	
	private static PropriedadesUtil instance;
	
	private static Properties prop = new Properties();
	private static InputStream input = null;
	
	private PropriedadesUtil() {
		
		try {
			input = new FileInputStream("imperium.properties");
			prop.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public String getPropriedade(String chave) {
		
		return prop.getProperty(chave);
		
	}
	
	public static PropriedadesUtil getInstance() {
		
		if (instance != null) {
			return instance;
		}
		
		return new PropriedadesUtil();
		
	}

}
