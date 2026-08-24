fun main(){
    var mon: Int = readln().toInt()

    println(
        when(mon){
            1 ->"january"
            2 ->"february"
            3 ->"March"
            4 ->"April"
            5 ->"May"
            6 ->"June"
            7 ->"July"
            8 ->"August"
            9 ->"September"
            10 ->"October"
            11 ->"November"
            12 ->"December"
            else -> "Enter valid number"
        }
    )
}