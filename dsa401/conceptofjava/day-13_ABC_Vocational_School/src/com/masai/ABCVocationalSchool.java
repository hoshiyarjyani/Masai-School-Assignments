package com.masai;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ABCVocationalSchool {
	static long getCourseDurationinDays(String startDateText, String endDateText)
			throws InvalidDatesException, TooLongCourseException, TooShortCourseException {
		// write code to get duration in days between start date and end date
		// if duration of course is more than 30 days, throws TooLongCourseException
		// if duration of course is less than 15 days, throws TooShortCourseException
		// if start date is after end date, throws InvalidDatesException
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate strDate = LocalDate.parse(startDateText, formatter);
		LocalDate endDate = LocalDate.parse(endDateText, formatter);
		long duration = ChronoUnit.DAYS.between(strDate, endDate.plusDays(1));
		if (strDate.isAfter(endDate)) {
			throw new InvalidDatesException("Start Date must not be after end date");
		} else if (duration > 30) {
			throw new TooLongCourseException("Course duration should not be more than 30 days");
		} else if (duration < 15) {
			throw new TooShortCourseException("Course duration should not be less than 15 days");
		} else {
			return duration;
		}

	}

	static long getMedicalLeavesDurationinDays(String startDateText, String endDateText, long courseDurationInDays)
			throws InvalidDatesException, TooMuchMedicalLeavesException {
		// write code to get duration in days between start date and end date of medical
		// leave
		// if duration of medical leave is more than 20% to course duration, throws
		// TooMuchMedicalLeavesException
		// if start date is after end date, throws InvalidDatesException
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate strDate = LocalDate.parse(startDateText, formatter);
		LocalDate endDate = LocalDate.parse(endDateText, formatter);
		long medicalLeaves = ChronoUnit.DAYS.between(strDate, endDate.plusDays(1));
		if (strDate.isAfter(endDate)) {
			throw new InvalidDatesException("Start Date must not be after end date");
		} else if (medicalLeaves > 0.2 * courseDurationInDays) {
			throw new TooMuchMedicalLeavesException(
					"Maximum 20% of total course duration can be taken as medical leave");
		} else {
			return medicalLeaves;
		}

	}

	static double getAttendancePercentage(long courseDurationInDays, long medicalLeavesInDays, long attendanceInDays)
			throws TooShortAttendanceException {
		// code to return total percentage of attendance
		// throws TooShortAttendanceException if attendance is less than 75.00%
		double attendancePercentage = (Math
				.round(((double) attendanceInDays / (double) courseDurationInDays - medicalLeavesInDays) * 100.0));
		System.out.println("Attendance Percent " + attendancePercentage);
		if (attendancePercentage < 75.0) {
			throw new TooShortAttendanceException("Minimum 75% attendance is required to appear in examination");
		}
		return attendancePercentage;
	}

	static String getRemark(double attendancePercentage) {
		// return remark based on attendance percentage such that this method is called
		// when attendance percentage is more than or equals to 75.00

		if (attendancePercentage >= 95.00) {
			return "You got 10 out of 10 marks in discipline and extracurricular activity";
		} else if (attendancePercentage >= 90.00) {
			return "You got 8 out of 10 marks in discipline and extracurricular activity";
		} else if (attendancePercentage >= 85.00) {
			return "You got 6 out of 10 marks in discipline and extracurricular activity";
		} else if (attendancePercentage >= 80.00) {
			return "You got 4 out of 10 marks in discipline and extracurricular activity";
		} else {
			return "You got 2 out of 10 marks in discipline and extracurricular activity";
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter course start date of course ");
			String courseStartDate = sc.next();
			System.out.print("Enter course end date of course ");
			String courseEndDate = sc.next();
			long courseDurationInDays = getCourseDurationinDays(courseStartDate, courseEndDate);
			System.out.println("Total course duration is " + courseDurationInDays + " days");
			System.out.print("Have you taken medical leaves? (y/n) ");
			char takenMedicalLeave = sc.next().toLowerCase().charAt(0);
			long medicalLeavesInDays = 0;
			if (takenMedicalLeave == 'y') {

				System.out.print("Enter medical leave start date ");
				String medicalStartDate = sc.next();
				System.out.print("Enter medical leave end date ");
				String medicalEndDate = sc.next();
				medicalLeavesInDays = getMedicalLeavesDurationinDays(medicalStartDate, medicalEndDate,
						courseDurationInDays);
				System.out.println("Total medical leave duration is " + medicalLeavesInDays + " days");
			}
			System.out.print("Enter number of days you attended this course ");
			long attendanceInDays = sc.nextLong();
			double attendancePercentage = getAttendancePercentage(courseDurationInDays,
					medicalLeavesInDays, attendanceInDays);
			System.out.println(getRemark(attendancePercentage));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		sc.close();
	}
}