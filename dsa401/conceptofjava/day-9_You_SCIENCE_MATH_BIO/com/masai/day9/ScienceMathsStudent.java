package com.masai.day9;

public class ScienceMathsStudent extends Science {
	final static String MATHS_PREFIX = "SM";
	private float mathsMarks;

	public ScienceMathsStudent(float mathsMarks, float physicsTheoryMarks, float physicsPracticalMarks,
			float chemistryTheoryMarks, float chemistryPracticalMarks) {
		super(MATHS_PREFIX, physicsTheoryMarks, physicsPracticalMarks, chemistryTheoryMarks, chemistryPracticalMarks);
		// TODO Auto-generated constructor stub
		this.mathsMarks = mathsMarks;
	}

	@Override
	public double getPercentage() {
		double percentage = ((mathsMarks/100) + ((getPhysicsTheoryMarks() + getPhysicsPracticalMarks())/100)
				+ ((getChemistryTheoryMarks() + getChemistryPracticalMarks())/100))/3;
		return Math.round(percentage * 100.0);
	}

	public float getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(float mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public static String getMathsPrefix() {
		return MATHS_PREFIX;
	}

}
