class Students {
    int rollno;
    String name;
    int marks;

   
}


public class arrObj {
    public static void main(String[] args) {

        Students s1 = new Students();
        s1.rollno = 1;
        s1.name = "foex";
        s1.marks = 50;

        Students s2 = new Students();
        s2.rollno = 2;
        s2.name = "foex";
        s2.marks = 40;

        Students s3 = new Students();
        s3.rollno = 3;
        s3.name = "yves";
        s3.marks = 70;

        Students s4 = new Students();
        s4.rollno = 4;
        s4.name = "olly";
        s4.marks = 100;

        Students s5 = new Students();
        s5.rollno = 5;
        s5.name = "student f";
        s5.marks = 50;

        Students s6 = new Students();
        s6.rollno = 6;
        s6.name = "foex";
        s6.marks = 50;

        Students s7 = new Students();
        s7.rollno = 7;
        s7.name = "student 7";
        s7.marks = 50;

        Students s8 = new Students();
        s8.rollno = 8;
        s8.name = "student 5";
        s8.marks = 50;

        Students s9 = new Students();
        s9.rollno = 9;
        s9.name = "student 1";
        s9.marks = 50;

        Students s10 = new Students();
        s10.rollno = 10;
        s10.name = "student 2";
        s10.marks = 50;

        Students stud[] = new Students[10];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;
        stud[3] = s4;
        stud[4] = s5;
        stud[5] = s6;
        stud[6] = s7;
        stud[7] = s8;
        stud[8] = s9;
        stud[9] = s10;

        // for (int i = 0; i < stud.length; i++) {
        //     System.out.println(stud[i].rollno + " : " + stud[i].name + " , " + stud[i].marks);
        // }

        for (Students student : stud) {
            System.out.println(student.rollno + " : " + student.name + " , " + student.marks);
        }

        // s1.show();
        
    }

}
