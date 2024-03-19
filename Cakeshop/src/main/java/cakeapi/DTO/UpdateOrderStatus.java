package cakeapi.DTO;

public class UpdateOrderStatus {

	private int id;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UpdateOrderStatus(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}

	@Override
	public String toString() {
		return "UpdateOrderStatus [id=" + id + ", status=" + status + "]";
	}

}
