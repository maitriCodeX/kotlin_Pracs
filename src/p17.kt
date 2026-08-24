fun main(){
    print("Enter no:")
    var no: Int = readln().toInt()
    var fac: Int = rec(no)
    println("Factorial of $no=$fac")
    fac= rec2(no)
    print("By tailrec keyword, factorial of $no=$fac")
}
fun rec(no: Int): Int{
    if (no <= 1)
        return 1
    return no * rec(no-1)
}

tailrec fun rec2(no: Int, result: Int = 1): Int {
    if (no <= 1)
        return result
    return rec2(no - 1, result * no)
}