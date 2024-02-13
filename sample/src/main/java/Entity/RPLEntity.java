package Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RPL_NER_STATUS")

public class RPLEntity {
	@Id
    @Column(name = "processor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String processor_id;
	
	private String transaction_id;
	private String status;
	private String error_msg;
	private String token_validated;
	private int entity_count;
	private Date start_time;
	private Date end_time;
	public String getProcessor_id() {
		return processor_id;
	}
	public void setProcessor_id(String processor_id) {
		this.processor_id = processor_id;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	public String getToken_validated() {
		return token_validated;
	}
	public void setToken_validated(String token_validated) {
		this.token_validated = token_validated;
	}
	public int getEntity_count() {
		return entity_count;
	}
	public void setEntity_count(int entity_count) {
		this.entity_count = entity_count;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	@Override
	public String toString() {
		return "RPLEntity [processor_id=" + processor_id + ", transaction_id=" + transaction_id + ", status=" + status
				+ ", error_msg=" + error_msg + ", token_validated=" + token_validated + ", entity_count=" + entity_count
				+ ", start_time=" + start_time + ", end_time=" + end_time + "]";
	}
	
}