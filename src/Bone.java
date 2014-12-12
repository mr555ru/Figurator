import java.util.ArrayList;


public class Bone {
	//private float x;
	//private float y; //don't need
	private float ang;
	private float size;
	//private float mass; //like wtf
	private Bone parent;
	private ArrayList<Bone> constraints;

	public Bone getParent() {
		return this.parent;
	}
	
	public void setParent(Bone parent) {
		this.parent = parent;
	}
	
	public void draw(){
		
	}

	public Bone(float ang, float size) { //constructor without parent bone
		super();
		this.parent = null;
		this.ang = ang;
		this.size = size;
	}
	
	public Bone(Bone parent, float ang, float size) { //constructor with parent bone
		super();
		this.parent = parent;
		this.ang = ang;
		this.size = size;
	}

	public float getAng() {
		return ang;
	}

	public void setAng(float ang) {
		this.ang = ang;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
	public void appendConstraint(Bone bone) {
		this.constraints.add(bone);
		bone.setParent(this);
	}
	
}
