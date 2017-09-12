public class Main {

	public static void main(String[] args) {
StudentGroup s1=new StudentGroup(5);
s1.getStudents();
s1.setStudents();
s1.getStudents(3);
s1.setStudents(kir,2);	
s1.addFirst(kir);
s1.addLast(pk);
s1.add(momo,4);
s1.remove(momo,4);	
s1.removeFromIndex(3);
s1.removeFromElement(pk);
s1.removeToElement(kir);
s1.bubbleSort();
s1.getByBirthDate(23);
s1.getBetweenBirthDates(11,23);
s1.getNearBirthDate(23,5);
s1.getCurrentAgeByDate(4);
s1.getStudentsByAge(12);
s1.getStudentsWithMaxAvgMark();
s1.getNextStudent(kir);
}



}
