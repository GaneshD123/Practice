import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {

    private String studentName;
    private int phyMarks;
    private int mathMarks;
    private int chemMarks;

    public Student(String studentName, int phyMarks, int mathMarks, int chemMarks) {
        this.studentName = studentName;
        this.phyMarks = phyMarks;
        this.mathMarks = mathMarks;
        this.chemMarks = chemMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getPhyMarks() {
        return phyMarks;
    }

    public void setPhyMarks(int phyMarks) {
        this.phyMarks = phyMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getChemMarks() {
        return chemMarks;
    }

    public void setChemMarks(int chemMarks) {
        this.chemMarks = chemMarks;
    }

    public static void main(String[] args) throws InterruptedException {

       int[] nums ={2,7,11,15};
       int[] result={};
       int target=9;
       for(int i=0;i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
               if(nums[i]==target-nums[j]){
                   result= new int[]{nums[i], nums[j]};
               }
           }
       }

     Arrays.sort(nums);
      Arrays.stream(nums).sequential().forEach(i->System.out.println(i));

        //createbbbz000t4 students
       /* List<Student> studentsList=new ArrayList<>();

        studentsList.add(new Student("AA",30,40,50));
        studentsList.add(new Student("BB",40,50,60));
        studentsList.add(new Student("CC",50,60,70));
        studentsList.add(new Student("DD",60,70,80));
//calculate avg each student, and sort the list based on desc order
    //  Map<String,Integer> result=studentsList.stream().collect(Collectors.toMap(student->s)

        Map<String,Integer> result=studentsList.stream().collect(Collectors.toMap(Student::getStudentName,(student->student.getMathMarks()+student.getChemMarks()+student.getPhyMarks())));
*/
            //    mapToInt(student->student.getMathMarks()+student.getChemMarks()+student.getPhyMarks()).;

        //print 1 to 10 using multiple threads out of which one thread print odd and other one print even.
//Need to create threadpool with 2 size
//create number range from 1 to 10 using intstream
// T1-> will create odd number
//T2-> will create and print even number


        Thread t1=new Thread(()->{
           for(int i=1;i<=10;i+=2){
                System.out.println(i);

           }
        });

        Thread t2=new Thread(()->{
            for(int i=2;i<=10;i+=2){
                System.out.println(i);

            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();


    }

  //  Given City and School table, print cities and count of school in those cities where count is more than 10-
//City
    // one->many  city--> city_id,city_name,
    //school --> school_id,school_name,city_id

  //  select city.city-name,count(school.school_id) as schoolcount from city inner join school on city.city_id=school.city_id
    // group by city.city-name having schoolcount>10

    //
}
