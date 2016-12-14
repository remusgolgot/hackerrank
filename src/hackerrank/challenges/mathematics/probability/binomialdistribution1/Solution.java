package hackerrank.challenges.mathematics.probability.binomialdistribution1;

/**
 * https://www.hackerrank.com/challenges/binomial-distribution-1
 * <p>
 * A blindfolded marksman finds that on the average he hits the target 4 times out of 5.
 * <p>
 * If he fires 4 shots, what is the probability of :
 * a) more than 2 hits?
 * b) at least 3 misses?
 */

public class Solution {

    /**

     ph = 0.800
     pm = 0.200

     p (4 hits) : 0.4096  ( ph ^ 4 )
     p (3 hits) : 0.4096  ( 4 * ph * ph * ph * pm )
     p (2 hits) : 0.1536  ( 6 * ph * ph * pm * pm )
     p (1 hit)  : 0.0256  ( 4 * ph * pm * pm * pm )
     p (0 hits) : 0.0016  ( pm ^ 4 )

     a) p(hits > 2)  = p3 + p4 = 0.8192
     b) p(hits <= 1) = p0 + p1 = 0.0272
     */
}
