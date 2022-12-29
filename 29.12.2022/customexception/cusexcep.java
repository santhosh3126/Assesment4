class CusExcep extends Exception{
    CusExcep(String str)
	{
	   super(str);
	}
	static String stud_name[]={"Santhosh","Prem","Raja","Jannath","Anbu"};
	static int id[]={13,17,22,24,25};
	static int marks[]={95,72,76,94,26};
	static double att[]={90.0,80.6,72.2,55.8,79.0};
	
}
class MainCusExcep{
    public static void main(String...args){
	    for(int i=0;i<CusExcep.marks.length;i++){
		  try{
		       System.out.println("Student Name  :"+CusExcep.stud_name[i]+"\t"+ "Student Id :"+CusExcep.id[i]+"\t"+"Marks :"+CusExcep.marks[i]+"\t"+ "Attendance :"+CusExcep.att[i]);  
			     if(CusExcep.att[i]<60)
				 {
					 throw new CusExcep(CusExcep.stud_name[i]+"Secured less than 60 attendance");
				 }
				 
		  }
				 catch(CusExcep e)
				 {
					System.out.println(e.getMessage()); 
				 }
		     

		}
	}
}