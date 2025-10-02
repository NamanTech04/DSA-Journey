class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptyBottle = numBottles;
        int consumed = numBottles;

        while (emptyBottle >= numExchange) {
            emptyBottle -= numExchange;
            numExchange++;
            consumed++;
            emptyBottle++;
        }
        return consumed;
    }
}