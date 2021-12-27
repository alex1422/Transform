fun main() {

    val f = Rect(0,3,1,2)

    println("Rect")
    println("Actual position(" + f.c_pos() + ")")
    f.rotate(RotateDirection.Turn,0,1)
    println("Next position(" + f.c_pos() + ")")

    println("Actual area(" + f.area() + ")")
    f.resize(2)
    println("Next area(" + f.area() + ")")

    val f1 = Square(7,7,2)


    println("Square")
    println("Actual position(" + f1.c_pos() + ")")
    f1.rotate(RotateDirection.CounterTurn,7,4)
    println("Next position(" + f1.c_pos() + ")")

    println("Actual area(" + f1.area() + ")")
    f1.resize(2)
    println("Next area(" + f1.area() + ")")

    val f2 = Circle(2,2,3)

    println("Circle")
    println("Actual position(" + f2.c_pos() + ")")
    f2.rotate(RotateDirection.Turn,0,0)
    println("Next position(" + f2.c_pos() + ")")

    println("Actual area(" + f2.area() + ")")
    f2.resize(2)
    println("Next area(" +  f2.area() + ")")


}