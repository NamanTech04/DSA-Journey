class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottle = numBottles;
        int consumed = numBottles;

        while(emptyBottle >= numExchange) {
            int drinkextra = emptyBottle / numExchange;
            int remaining = emptyBottle % numExchange;

            consumed += drinkextra;
            emptyBottle = remaining + drinkextra;
        }
        return consumed;
    }
}