package COM.CRM.VTiger.GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * this method help us to fetch the data from property file
	 * @Maharshi
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String dataFromPropertyFile(String key) throws IOException
	{
		FileInputStream f=new FileInputStream(Ipathconstant.propertyfilepath);
		Properties p=new Properties();
		p.load(f);
		String value=p.getProperty(key);
		return value;
	}
}
