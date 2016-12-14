package hackerrank.challenges.mathematics.probability.binomialdistribution2;

/**
 * https://www.hackerrank.com/challenges/binomial-distribution-2
 * <p>
 * The ratio of boys to girls born in Russia is 1.09:1.
 * What proportion of Russian families with exactly 6 children will have at least 3 boys? (Ignore the probability of multiple births.)
 */
public class Solution {

    /**
     p(boy)    = 0.5215
     p(girl)   = 0.4784

     p(0 boys) = 0.0119
     p(1 boy)  = 0.0784
     p(2 boys) = 0.2136
     p(3 boys) = 0.3105
     p(4 boys) = 0.2539
     p(5 boys) = 0.1107
     p(6 boys) = 0.0201


     p ( boys >= 3  ) = 0.6952 => 0.696 ( 3 digit approximation )
     */

}
