fun main(){
var c=Car("911","Carrera 4S","Sleek black",4)
    c.carry(4)
    c.identity()
    println(c.calculateParkingFee(2))
    var e=Bus("benz","marcedes","goldengrey",60)

    println(e.maxTripFare(580.00))


    

}class Car( make:String, model:String,colour:String, capacity:Int):vihicle(make, model, colour, capacity){}
  open class vihicle( var make:String,var model:String, var colour:String, var capacity:Int){
    fun carry(people:Int){
        var x=capacity-people
        if (capacity>=people){
            println("carrying $people passengers")
        }
        else(people>=capacity)
            println("overcapacity by $x passangers ")



    }


fun identity(){
    println("I am a $make $model $colour  porsche")

}
    open fun calculateParkingFee(hours:Int):Int{
        var f=hours*20
        return f

    }

}
class Bus(make: String,model: String,colour: String,capacity: Int):vihicle(make, model, colour, capacity){
    fun maxTripFare(fare:Double):Double{
        var maxi=0
        return maxi+fare

    }
    override fun calculateParkingFee(hours:Int):Int {

        return hours*capacity
    }
}