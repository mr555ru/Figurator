import java.util.ArrayList;


public class Bone {
	private float x;
	private float y;
	private float ang;
	private float size;
	private float mass;
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

	public float getX() {
		return x;
	}

	public Bone(float x, float y, float ang, float size) { //constructor without parent bone
		super();
		this.parent = null;
		this.x = x;
		this.y = y;
		this.ang = ang;
		this.size = size;
	}
	
	public Bone(Bone parent, float ang, float size) { //constructor with parent bone
		super();
		this.parent = parent;
		parent.constraints.add(this);
		this.x = (float) (parent.getX() + size*Math.cos(parent.ang));
		this.y = (float) (parent.getY() + size*Math.sin(parent.ang));
		this.ang = ang;
		this.size = size;
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
	
	public float getMass() {
		return mass;
	}

	public void setMass(float mass) {
		this.mass = mass;
	}
	
	public void connectTo(Bone constraintBone) {
		this.setParent(constraintBone);
		constraintBone.constraints.add(this);
	}
	
	public void diconnectFrom(Bone constraintBone) {
		this.setParent(null);
		constraintBone.constraints.remove(this);
	}
	
}
