import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
       
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
	for(int i;i<length;i++)
         {
         return Student[i];
	 }	
	}

	@Override
	public void setStudents(Student[] students) {

	{try{
	if(index<0||index>=length)
	{
	throw()
	}
}
	catch(Exception e)
	{
	String msg="IllegalArgumentException";
	return msg;
	}
	}
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
	
	int element;
	int index=this.index;
	students[index]=element;
	try{
	if(index<0||index>=length)
	{
	throw()
	}
}
	catch(Exception e)
	{
	String msg="IllegalArgumentException";
	return msg;
	}
	}

		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	student = this.student;
	index=this.index;
	try{
	if(index<0||index>=length)
	{
	throw()
	}
}
	catch(Exception e)
	{
	String msg="IllegalArgumentException";
	return msg;
	}

	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
student=this.student;
	try{
	if(index<0||index>=length)
	{
	throw()
	}
}
	catch(Exception e)
	{
	String msg="IllegalArgumentException";
	return msg;
	}

	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int temp;
	try{
	if(index<0||index>=length)
	{
	throw()
	}
}
	catch(Exception e)
	{
	String msg="IllegalArgumentException";
	return msg;
	
	else{temp=student[index];
	}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	student=this.student;
	index=this.index;
	index=index+1;
	}

	@Override
	public void remove(int index) {
	int temp1; 
	index =this.index;
	temp1=student[index];	
	}
	
	}

	@Override
	public void remove(Student student) {
		String stu=this.student;
		int temp;
		temp=student[index];
	}

	@Override
	public void removeFromIndex(int index) {
	int i;
	i=this.index;
	i=i+1;
	}

	@Override
	public void removeFromElement(Student student) {
		int temp;
student=this.student;
	temp=student[index]}
}
	@Override
	public void removeToIndex(int index) {
		int temp;
student=this.student;
	temp=student[index]}
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		int temp;
student=this.student;
	temp=student[index]}
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
int temp;	for(int i=0;i<=length;i++)
	{	
	if(student[i]>student[j])
	temp=student[i];
	student[i]=student[j];
	student[j]=temp;
	}
while(true){return student;}
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
	date=this.date;
	
	return date;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
	fdate=this.firstDate;
	ldate=this.lastDate;
	try{
	if(fdate==NULL||ldate==NULL)	
	throw()
	}
	catch(Exception e)
	{	String msg="IllegalArgumentException";
	return msg;
	}
	while(index>fdate||index<ldate)
	{return student;}
}	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
	try
	{
	if(students == null)
	throw()
        
		return null;
	}
	else
	date=this.date;
	if(Bdate==date)
	return student;
}
	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
	if(Student[indexOfStudent]!=0)
	while(student[i]!=0)
	{
	if(student[i]==student[indexOfStudent])
	return age;
	}
	else
	try
	{
	if(students == null)
	throw()
}
	catch(Exception e)
	{
	String msg="Illegal Argument Exception";
	return msg;	
	}        	
	

		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
	ages=this.ages;
	return student[ages];
	}
	
	@Override
	public Student[] getStudentsWithMaxAvgMark() {
	try
	{
	if(students == null)
	throw()
        }while(index<=length)
	{
	if(max>student[index]
	max=student[index];
	}
		
	return max;
		
        catch(Exception e)
	{
	String msg="IllegalArgumentException";
	return msg;
	}
	

}
		// Add your implementation here
                	}

	@Override
	public Student getNextStudent(Student student) {
		if(pos=index+1)
		return student[pos];
		else
		{
	try
	{
	if(students == null)
	throw();
        }
        catch(Exception e)
	{
	String msg="IllegalArgumentException";
	return msg;
	}	
		}

		return null;
	

}
finally()
{
System.out.println("exception caught");
}
