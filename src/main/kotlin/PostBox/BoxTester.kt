package PostBox.kotlin


import java.util.*


fun main() {
var scanner = Scanner(System.`in`);
    print("Welcome to the postal system!")
    print(" Please enter object's length:")
    var length  = scanner.nextFloat()
    print("Please enter object's width:")
    var width = scanner.nextFloat()
    print(" Please enter object's height:")
    var height = scanner.nextInt()

    if( Box3().vaildate(length, width, height) == true){
        println("Box3")
    }else if(Box5().vaildate(length, width, height) == true){
        println("Box5")
    }else{
        println("No suitable Box size!")
    }

}
open class  Box(var  length:Float,var width:Float , var height:Int) {
    open fun vaildate(length: Float, width: Float, height: Int): Boolean {
        var box = false
        if (this.length > length && this.width > width && this.height > height) {
            box = true
        }
        return box
    }
}

class Box3 :Box(23f,14f,13){




}
class Box5 :Box(39.5f,27.5f,23){

}
