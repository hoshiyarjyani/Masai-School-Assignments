package com.masai.day9;

public class ScienceBioStudent extends Science{
	final static String BIO_PREFIX = "SB";
	private float bioTheoryMarks;
	private float bioPracticalMarks;
	public ScienceBioStudent(float bioTheoryMarks,float bioPracticalMarks, float physicsTheoryMarks, float physicsPracticalMarks,
			float chemistryTheoryMarks, float chemistryPracticalMarks) {
		super(BIO_PREFIX, physicsTheoryMarks, physicsPracticalMarks, chemistryTheoryMarks, chemistryPracticalMarks);
		// TODO Auto-generated constructor stub
	}
	public float getBioTheoryMarks() {
		return bioTheoryMarks;
	}
	public void setBioTheoryMarks(float bioTheoryMarks) {
		this.bioTheoryMarks = bioTheoryMarks;
	}
	public float getBioPracticalMarks() {
		return bioPracticalMarks;
	}
	public void setBioPracticalMarks(float bioPracticalMarks) {
		this.bioPracticalMarks = bioPracticalMarks;
	}
	public static String getBioPrefix() {
		return BIO_PREFIX;
	}
	@Override
	public double getPercentage() {
		double percentage = (((bioPracticalMarks+bioTheoryMarks)/100) + ((getPhysicsTheoryMarks() + getPhysicsPracticalMarks())/100)
				+ ((getChemistryTheoryMarks() + getChemistryPracticalMarks())/100)) / 3;
		return Math.round(percentage * 100.0);
	}
	
	
}
