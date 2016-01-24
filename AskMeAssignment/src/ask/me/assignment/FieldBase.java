package ask.me.assignment;

import org.codehaus.jackson.annotate.JsonProperty;

public class FieldBase {

	private String type;
	private String size;
	private String defaultVal;
	private String description;
	private int length;
	private String notNull;

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setsize(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	@JsonProperty("default")
	public void setDefaultVal(String defaultVal) {
		this.defaultVal = defaultVal;
	}

	public String getDefaultVal() {
		return defaultVal;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setLenght(int length) {
		this.length = length;
	}

	public int getLenght() {
		return length;
	}

	@JsonProperty("not null")
	public void setNotNull(String notNull) {
		this.notNull = notNull;
	}

	public String getNotNull() {
		return notNull;
	}

}
