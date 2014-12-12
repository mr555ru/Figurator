
public class HumanBody {
	
	private Skeleton skeleton;
	
	private Bone baseBone;
	private Bone head;
	private Bone torso;
	private Bone pelvis;
	private Bone leftArm, leftForeArm, leftHand;
	private Bone leftThigh, leftLeg, leftFoot;
	private Bone rightArm, rightForeArm, rightHand;
	private Bone rightThigh, rightLeg, rightFoot;
	
	public HumanBody() {
		
	
		this.baseBone = new Bone(90, Arranges.baseBone); //does not work with current bone format
			this.pelvis = new Bone(90, Arranges.pelvis);
				this.torso = new Bone(90, Arranges.torso);
					this.head = new Bone(90, Arranges.head);
					this.leftArm = new Bone(-150, Arranges.arm);
						this.leftForeArm = new Bone(-120, Arranges.foreArm);	
							this.leftHand = new Bone(-100, Arranges.hand);
						this.rightArm = new Bone(-60, Arranges.arm);
							this.rightForeArm = new Bone(-30, Arranges.foreArm);	
								this.rightHand = new Bone(-10, Arranges.hand);		
		this.leftThigh = new Bone(-120, Arranges.thigh);
			this.leftLeg = new Bone(-100, Arranges.leg);
				this.leftFoot = new Bone(-180, Arranges.foot);
		this.rightThigh = new Bone(-60, Arranges.thigh);
			this.rightLeg = new Bone(-80, Arranges.leg);
				this.rightFoot = new Bone(0, Arranges.foot);
				
		this.skeleton = new Skeleton(baseBone, 0, 0);
			
	}
}
