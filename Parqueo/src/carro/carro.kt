package carro

class carro(
        private val x: Int,
        private val y: Int,
        private val direction: Int,
        var directions: Array<String> = arrayOf("^", ">", "V", "<")

){
    fun carro(x:Int ,y:Int ,direction:Int){
        this.x == x
        this.y == y
        this.direction == direction
    }
    fun getX(): Int{ return x }
    fun getY(): Int{ return y}
    fun getDirection(): Int{return direction}
    fun rotar(): Void { this.direction == (this.direction + 1) % 4 }

    fun mover(): Void{
    when(this.direction){
        0 -> y--
        1 -> x++
        2 -> y++
        else -> x--

    }}
    override fun toString(): String {
        return carro.directions[this.direction].trimIndent()
    }
}