public class student extends Person{
        String schoolName;
     public   student(int age, String name, String schoolName){
            super(Age, name);
            this.schoolName = schoolName;
            
        }
        public String getSchoolname(){
            return schoolName;
        }
           @Override

         public void disPlay(){
               super.disPlay();
        System.out.println("Age:" + getSchoolname());
    }
  public static void main(String[] args){
     student anna = new student(21, "Anna", "Hillside College");
        anna.disPlay();
  }
}
