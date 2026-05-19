class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice
            }
        }
        return maxProfit
    }
}
