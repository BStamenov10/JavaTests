package school;

public class Discipline {

	private String nameOfDiscipline;
	private int numberOfLessons;
	private int nunberOfExercises;

	public Discipline(String nameOfDiscipline, int numberOfLessons, int nunberOfExercises) {
		this.nameOfDiscipline = nameOfDiscipline;
		this.numberOfLessons = numberOfLessons;
		this.nunberOfExercises = nunberOfExercises;
	}

	public String getNameOfDiscipline() {
		return nameOfDiscipline;
	}

	public int getNumberOfLessons() {
		return numberOfLessons;
	}

	public int getNunberOfExercises() {
		return nunberOfExercises;
	}

	@Override
	public String toString() {
		return "Discipline: " + nameOfDiscipline + ". Number of lessons: " + numberOfLessons
				+ ". Number of exercises: " + nunberOfExercises;
	}
	
	

}
