
public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String nameWithPrefix = "Hello ";
		if (isWoman) {
			if (isKnighted) {
				nameWithPrefix += "Lady " + name;
			} else {
				nameWithPrefix += "Ms. " + name;
			}
		}else {
			if(isKnighted) {
				nameWithPrefix += "Sir " + name;
				
				
				
			}
			else {
				nameWithPrefix += "Mr. " + name;
			}
		}
 return nameWithPrefix;
	}

}
