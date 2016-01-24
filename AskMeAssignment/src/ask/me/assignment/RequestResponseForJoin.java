package ask.me.assignment;

import org.codehaus.jackson.annotate.JsonProperty;

public class RequestResponseForJoin {

	private String help;
	private String count;
	private RecordsForJoin[] records;
	private String success;
	private Fields fields;

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public RecordsForJoin[] getRecords() {
		return records;
	}

	@JsonProperty("records")
	public void setRecords(RecordsForJoin[] records) {
		this.records = records;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Fields getFields() {
		return fields;
	}

	public void setFields(Fields fields) {
		this.fields = fields;
	}

}
