public class seasonTester{
    
    enum Season{
        SPRING(10, 20,"Flowers bloom in spring",false ),
        SUMMER(25,35, "Warm and sunny days.", false),
        AUTUMN(15, 25,"Leaves fall during autumn", true ),
        WINTER(-5 , 5, "Cold and snowy days",true);
        
        private final int minTemp;
        private final int maxTemp;
        private final String description;
        private final boolean isRainy;
        
        Season(int minTemp, int maxTemp, String description, boolean isRainy){
            this.minTemp = minTemp;
            this.maxTemp = maxTemp;
            this.description = description;
            this.isRainy = isRainy;
}
           public int getminTemp(){
               return minTemp;
           }
           public int getmaxTemp(){
               return maxTemp;
           }
           public String getdescription(){
               return description;
           }
           public boolean  getisRainy(){
               return isRainy;
           }
           
          public static void describeSeasons() {
            for (Season season : Season.values()) {
                System.out.println(season.toString());
            }
          }
       @Override
       public String toString() {
       String rainyStatus = isRainy ? "Rainy" : "Not Rainy";
      return String.format("%s: %d-%d°C. %s (%s)",  this.name(), minTemp, maxTemp, description,
      rainyStatus);
      }

    }
    
 public static void main(String[] args) {
        System.out.println("All Seasons:");
        Season.describeSeasons();
 }
    
    
    
}
