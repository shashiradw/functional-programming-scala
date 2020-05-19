object Fahrenheit extends App{
         
  def convert(){
    print("Enter Celsius value :")
    var celsius= readDouble()
    var fah= celsius*1.8+32.0
    println("fahrenheit value for "+celsius+" celsius is "+fah);
  }

  convert()
}


