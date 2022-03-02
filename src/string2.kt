fun main(){
    var a = "akirachix"
    println(a[0].toString() + a[2] + a[3])
    var f = len()
    println(f)
    structure("lona",54)
    confirm()

}
fun structure(n:String,age:Int){
    var text= "Hi, my name is $n and iam $age years old"
    println(text)

}
fun len():Int{
    var b = "Terrific Tuesday"
    var c = b.length
    return c

}
fun confirm(){
    var j = "LONA"
    if (j=="LONA"){
        println("That is my name!")
    }
    else{
        println("I  DO NOT KNOW WHO THAT IS!")
    }
}


