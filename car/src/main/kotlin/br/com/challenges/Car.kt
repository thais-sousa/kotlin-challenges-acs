package br.com.challenges

class Car(val engine: Engine) {

    fun qualityNote(): String {
        return when {
            !engine.isEnvironmentalFriendly() -> "Nota C - O motor é prejudicial ao meio ambiente"
            engine.useFlammableFuel() -> "Nota B - O motor não é prejudicial ao meio ambiente, mas usa combustível fóssil"
            else -> "Nota A - O motor não é prejudicial ao meio ambiente e usa combustível não fóssil"
        }
    }
}