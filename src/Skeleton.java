
public class Skeleton {

	private Bone baseBone;
	private float x;
	private float y;
	
	public Skeleton(Bone baseBone, float x, float y) {
		this.baseBone = baseBone;
		this.x = x;
		this.y = y;
	}

	public Bone getRootBone() {
		return baseBone;
	}

	public void setRootBone(Bone baseBone) {
		this.baseBone = baseBone;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
	
}
