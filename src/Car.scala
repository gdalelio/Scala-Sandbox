/**
 *
 * @author <a href="geoff.dalelio@soabridge.com" >Geoff d'Alelio</a>
 * @since 1.0
 */
class CarFactory(brand:String, var color: String, numberOfPassengers: Int, gasMilage: Int){
  val vehicleType = "Car"
  val numberOfTires = 4
  var aColor = color
  var aBrand: String  = brand
  var aNumberOfPassengers = numberOfPassengers
  var aGasMilage = gasMilage

 //used to describe the car
  override def toString: String = s"The car is a $brand that is $color in color and can seat $numberOfPassengers. \n" +
   s"It will get $gasMilage mpg."
  //method to change car color
 def paintCar(car: CarFactory, newColor:String): CarFactory= {
   var carToPaint: CarFactory = car
   carToPaint.color = newColor    //seems to be showing this as an error - but complies.  Highlihting is wrong.
   carToPaint

 }
  CarFactory.numCarsCreated +=1

}

object CarFactory {

  var numCarsCreated: Int = 0
  def apply(): CarFactory = new CarFactory("BM", "Silver", 4, 35)
//  def apply(theBrand: String, theColor: String ) = new CarFactory("Ford", "Blue", 2,34)

}

object Runner extends App {
  var car1 : CarFactory = new CarFactory("Ford", "Red", 4, 35)
  var car2 : CarFactory = new CarFactory("Ford", "White", 4, 35)
  var car3 : CarFactory = new CarFactory("Ford", "Blue", 4, 35)

  println("Car1 Color is "+car1.color)
 car2 =  car2.paintCar(car2, "Pink")
  println("Car1 Color is "+car2.color)
 // val car4 = new CarFactory()   //i want this to create the bmw using the apply method...hmm?
  println("Car4 is a "+ car2.color+" "+car2.aBrand+ " and it can carry "+ car2.aNumberOfPassengers+" passengers.")
  println(car2)
  println(" \n We have created "+CarFactory.numCarsCreated+" cars from this factory!")
}
