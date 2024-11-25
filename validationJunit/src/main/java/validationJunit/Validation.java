package validationJunit;

public class Validation {

	public String validation(String uname,String pass) {
		if(uname.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
			return "sucess";
		}
			else
			{
				return "false";
			}
			
			
		}
}

