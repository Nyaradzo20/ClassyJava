public class Box{
   double Width;
   double Height;
   double Depth; 

   Box(double Width, double Height, double Depth){
    System.out.println("Constructindg new Box");
    this.Width = Width;
    this.Height= Height;
    this.Depth = Depth;
}

   void Volume(){
    double volume = Width * Height * Depth;
    System.out.println("Volume of the box is: " + volume);
   }
    public static  void main(String[] args){
     Box myBox = new Box(10.0, 5.0, 10.0);
     
     Box myBox2 = new Box(5.0, 3.0, 2.0);
    myBox.Volume() ;
    myBox2.Volume();
    
    }
   

}