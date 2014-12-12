
public class HumanBody {
	private Bone baseBone;
	private Bone head;
	private Bone torso;
	private Bone pelvis;
	private Bone leftArm, leftForeArm, leftHand;
	private Bone leftThigh, leftLeg, leftFoot;
	private Bone rightArm, rightForeArm, rightHand;
	private Bone rightThigh, rightLeg, rightFoot;
	
	public HumanBody() {
	
		this.baseBone = new Bone(0, 0, 90, Arranges.baseBone);
			this.pelvis = new Bone(this.baseBone, 90, Arranges.pelvis);
				this.torso = new Bone(this.pelvis, 90, Arranges.torso);
					this.head = new Bone(this.torso, 90, Arranges.head);
					this.leftArm = new Bone(this.torso, -150, Arranges.arm);
						this.leftForeArm = new Bone(this.leftArm, -120, Arranges.foreArm);	
							this.leftHand = new Bone(this.leftForeArm, -100, Arranges.hand);
						this.rightArm = new Bone(torso, -60, Arranges.arm);
							this.rightForeArm = new Bone(this.rightArm, -30, Arranges.foreArm);	
								this.rightHand = new Bone(this.rightForeArm, -10, Arranges.hand);		
		this.leftThigh = new Bone(this.baseBone, -120, Arranges.thigh);
			this.leftLeg = new Bone(this.leftThigh, -100, Arranges.leg);
				this.leftFoot = new Bone(this.leftLeg, -180, Arranges.foot);
		this.rightThigh = new Bone(this.baseBone, -60, Arranges.thigh);
			this.rightLeg = new Bone(this.rightThigh, -80, Arranges.leg);
				this.rightFoot = new Bone(this.rightLeg, 0, Arranges.foot);		
			
	}
}
