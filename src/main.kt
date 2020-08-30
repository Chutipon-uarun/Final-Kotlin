fun main() {
   var myanimal = animal()
    myanimal.eat()
    myanimal.roam()
    myanimal.MakeNoise()
    myanimal.sleep()

    var myhippo = hippo()
    myhippo.eat()
    myhippo.MakeNoise()

    var myfeline = feline()
    myfeline.roam()

    var mylion = lion()
    mylion.eat()
    mylion.roam()
    mylion.MakeNoise()
    mylion.sleep()

    var myCheetah = Cheetah()
    myCheetah.MakeNoise()
    myCheetah.eat()

    var myLynx = Lynx()
    myLynx.MakeNoise()
    myLynx.eat()

    var myCanine = Canine()
    myCanine.roam()

    var myWolf = Wolf()
    myWolf.MakeNoise()
    myWolf.eat()

    var myFox =Fox()
    myFox.MakeNoise()
    myFox.eat()

    var myVet =Vet()
    myVet.giveShot(myhippo)
    myVet.giveShot(mylion)
    myVet.giveShot(myCheetah)
    myVet.giveShot(myLynx)
    myVet.giveShot(myWolf)
    myVet.giveShot(myFox)
}
open class animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    val hunger = 10

    open fun MakeNoise() {
        println("This Animal is making noise!")
    }
    open fun eat() {
        println("This Animal is eating!")
    }
    open fun roam() {
        println("This Animal is roam")
    }
    open fun sleep() {
        println("This Animal is sleeping")
    }
}
class  hippo : animal(){
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun MakeNoise() {
        println("Grunt! Grunt!")
    }
    override fun eat() {
        println("The hippo is eating $food")
    }
}
open class feline : animal(){
    override fun roam() {
        println("คลาส feline กำลังเดินและปืนต้นไม้ไม่ได้")
    }
}
class lion : feline(){
    override val image = "lion.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "ถ้ำ"

    override fun MakeNoise() {
        println("ร้องคำรามแบบสิงโต")
    }
    override fun eat() {
        println("สิงโตกิน $food")
    }
}
class Cheetah: feline(){
    override  val image = "cheep.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "ถ้ำ"

    override fun MakeNoise(){
        println("เสือชีต้าคำรามแบบเสือ")
    }
    override fun eat() {
        println("เสือชีต้ากิน $food")
    }
}
class Lynx :feline(){
    override  val image = "Lynx.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "ถ้ำ"

    override fun MakeNoise(){
        println("แมวป่าร้องคำรามแบบแมวป่า")
    }
    override fun eat() {
        println("แมวป่ากิน $food")
    }
}
open class Canine : animal(){
    override fun roam() {
        println("คลาส canine เดินบนพื้นได้อย่างเดียว")
    }
}
class Wolf: Canine(){
    override val image = "fox.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "ถ้ำ"

    override fun MakeNoise(){
        println("หมาป่าร้องคำรามแบบหมาป่า")
    }
    override fun eat() {
        println("หมาป่ากิน $food")
    }
}
class Fox : Canine(){
    override val image = "fox.jpg"
    override val food = "เนื้อสัตว์"
    override val habitat = "บนบก"

    override fun MakeNoise(){
        println("หมาป่าร้องคำรามแบบหมาป่า")
    }
    override fun eat() {
        println("หมาป่ากิน $food")
    }
}
class Vet{
    fun giveShot(animal: animal){
        animal.MakeNoise()
    }
    fun main(arg: Array<String>){
        val animal = arrayListOf(hippo(), lion(),Cheetah(),Lynx(),Wolf(),Fox())
        for (item in animal)
            item.roam()
            item.eat()
    }
    val vet = Vet()
    val hippo = hippo()
    val lion = lion()
    val cheetah = Cheetah()
    val lynx = Lynx()
    val fox = Fox()
    vet.giveShot(hippo)
    vet.giveShot(lion)
    vet.giveShot(Cheetah)
    vet.giveShot(Lynx)
    vet.giveShot(Fox)

}