package WhyHAshCodeISImmuTABLEoBJECT.COM.DK;

public class FaceStudent extends Student {
	private String facstudentName;

	public FaceStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.setFacstudentName(name);
	}

	@Override
	public String getName() {
		return getFacstudentName();
	}

	public String getFacstudentName() {
		return facstudentName;
	}

	public void setFacstudentName(String facstudentName) {
		this.facstudentName = facstudentName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((facstudentName == null) ? 0 : facstudentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FaceStudent other = (FaceStudent) obj;
		if (facstudentName == null) {
			if (other.facstudentName != null)
				return false;
		} else if (!facstudentName.equals(other.facstudentName))
			return false;
		return true;
	}
	
}
