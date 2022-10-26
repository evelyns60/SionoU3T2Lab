public class SelectionMadness {

    public boolean flipCoin() {
        int number = (int)(Math.random() * 2) + 1;
        if (number == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int largest(int int1, int int2, int int3) {
        if (int1 > int2) {
            if (int1 > int3) {
                return int1;
            } else {
                return int3;
            }
        } else if (int2 > int3) {
            return int2;
        } else {
            return int3;
        }
    }

    public boolean rightTriangle(int side1, int side2, int side3) {
        int largestSide = largest(side1, side2, side3);
        int leg1;
        int leg2;
        if (side1 != largestSide && side2 !=largestSide) {
            leg1 = side1;
            leg2 = side2;
        } else if (side2 != largestSide && side3 != largestSide) {
            leg1 = side2;
            leg2 = side3;
        } else {
            leg1 = side3;
            leg2 = side1;
        }

        int aSquared = (int) Math.pow(leg1, 2);
        int bSquared = (int) (Math.pow(leg2, 2));
        int cSquared = (int) (Math.pow(largestSide, 2));

        if (aSquared + bSquared == cSquared) {
            return true;
        } else {
            return false;
        }
    }
}
