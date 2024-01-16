fun max(a: Int, vararg b: Int): Int {
    var max=a
    for (num in b){
        if (max<num){
            max=num
        }
    }
    return max
}
fun main(){
    val element=List(7) { (0..100).random() }
    val mNum = max(element[0],*element.slice(1..3).toIntArray())
    println(mNum)
}