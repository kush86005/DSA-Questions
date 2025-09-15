package DSAFinal;
//What does result == 0 mean?
//
//This condition checks whether your guess is correct.
//
//Remember, the guess(int num) API returns:
//
//-1 → Your guess is too high
//
//1 → Your guess is too low
//
//0 → Your guess is correct ✅
public class Question041 {
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */

    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int left = 1;
            int right = n;

            while (left <= right) {
                int mid = left + (right - left) / 2; // Avoid potential overflow

                int result = guess(mid);

                if (result == 0) {
                    return mid; // Correct guess
                } else if (result < 0) {
                    right = mid - 1; // Guess is too high
                } else {
                    left = mid + 1; // Guess is too low
                }
            }

            // This line should never be reached if the input is valid
            return -1;
        }
    }
}
