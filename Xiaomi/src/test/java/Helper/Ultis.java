package Helper;

public class Ultis {
	public static String getproprety(String property) throws Exception {
		InputStream input = new FileInputStream("src/Xiaomi/resources/Properties/Property");
		Properties properties = new Properties();
		properties.load(input);
		return(properties.getProperty(property));
		}
}
