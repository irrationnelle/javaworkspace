package Programming06;

public class SmartPhone extends Phone {
	private String operationType;
	private int operationVersion;
	private int internalMem;
	private boolean isCamera;
	private boolean isBluetooth;
	
	public SmartPhone() {
		this("����", 50000, "3G", "iOS", 10, 64, true, true);
	}
	
	public SmartPhone(String company, int price, String commuType, String operationType, int operationVersion, int internalMem, boolean isCamera, boolean isBluetooth) {
		super(company, price, commuType);
		this.setOperationType(operationType);
		this.setOperationVersion(operationVersion);
		this.setInternalMem(internalMem);
		this.setCamera(isCamera);
		this.setBluetooth(isBluetooth);
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public int getOperationVersion() {
		return operationVersion;
	}

	public void setOperationVersion(int operationVersion) {
		this.operationVersion = operationVersion;
	}

	public int getInternalMem() {
		return internalMem;
	}

	public void setInternalMem(int internalMem) {
		this.internalMem = internalMem;
	}

	public boolean isCamera() {
		return isCamera;
	}

	public void setCamera(boolean isCamera) {
		this.isCamera = isCamera;
	}

	public boolean isBluetooth() {
		return isBluetooth;
	}

	public void setBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}
	
	@Override
	public String toString() {
		return "������: "+this.getCompany()+", ����: "+this.getPrice()+", ���Ÿ��: "+this.getCommuType()+", �ü�� Ÿ��: "+this.getOperationType()+", �ü�� ����: "+this.getOperationVersion()+", ���� �޸� �뷮: "+this.getInternalMem()+", ī�޶� ���� ����: "+this.isCamera+", ������� ���� ����: "+this.isBluetooth;
		
	}
}
