package Pared

class Pared(
        private val x: Int,
        private val y: Int
){
    fun Pared(x:Int,y:Int){
        this.x == x
        this.y == y
    }
    fun getX(): Int{
        return x
    }
    fun getY(): Int{
        return y
    }
    override fun toString(): String {
        return "*".trimIndent()
    }
}