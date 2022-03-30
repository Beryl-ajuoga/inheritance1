fun main(){
    var car=Car("wwmt","Toyota","Red",400)
    car.carry(150)
    car.identit("white","subaru","legacy")
    car.calculatParkingfee(3)
    var bus=Bus("ntv","Nissan","Red",300)
    bus.maxTripfare(50.00)
    bus.calculatParkingfee(20)



}

open class Car(var make:String , var model:String , var colour:String , var capacity:Int){
    fun carry(people:Int){
        var numbers=people-capacity
        if (people <= capacity){
            println("carry $people passengers")
        }else {
            println("overcapacity by $numbers people")

        }
    }
fun identit(color:String , make:String , model:String){
    println("I am a $color $make $model")
}
open fun calculatParkingfee(hours:Int ):Int{
    var multiply = 20* hours
    println(multiply)
    return multiply
}
}

class Bus(make:String , model:String , color:String , capacity:Int):Car(make , model , color ,capacity){
fun maxTripfare(fare:Double ):Double{
    var w= 400 * fare
    println(w)
    return w
}

}






