/**
 * 📝 Description: See above.
 * The goal is to create a tiered, two-step discount calculation system
 * using a lambda factory pattern.
 */

typealias BonusDiscount = (Double) -> Double
typealias PriceCalculator = (Double, BonusDiscount) -> Double


fun main() {
    val vipCalculator: PriceCalculator = getCalculatorFor("VIP")

    println(vipCalculator(200.0) { price: Double -> price - 10.0 })
}

fun getCalculatorFor(customerStatus: String): PriceCalculator {
    return when (customerStatus) {
        "REGULAR" -> { basePrice: Double, bd: BonusDiscount -> bd(basePrice * 1.0) }
        "MEMBER" -> { basePrice: Double, bd: BonusDiscount -> bd(basePrice * 0.9) }
        "VIP" -> { basePrice: Double, bd: BonusDiscount -> bd(basePrice * 0.75) }
        else -> { _, _ -> 0.0}
    }
}