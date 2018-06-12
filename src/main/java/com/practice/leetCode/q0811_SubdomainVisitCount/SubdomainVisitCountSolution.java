package com.practice.leetCode.q0811_SubdomainVisitCount;

import java.util.HashMap;
import java.util.Map;

/**
 * Question:
 * <p>
 * website domain like "discuss.leetcode.com" consists of various subdomains.
 * At the top level, we have "com", at the next level, we have "leetcode.com",
 * and at the lowest level, "discuss.leetcode.com".
 * When we visit a domain like "discuss.leetcode.com",
 * we will also visit the parent domains "leetcode.com" and "com" implicitly.
 * <p>
 * Now, call a "count-paired domain" to be a count
 * (representing the number of visits this domain received), followed by a space,
 * followed by the address.
 * An example of a count-paired domain might be "9001 discuss.leetcode.com".
 * <p>
 * We are given a list cpdomains of count-paired domains.
 * We would like a list of count-paired domains, (in the same format as the input, and in any order),
 * that explicitly counts the number of visits to each subdomain.
 * <p>
 * Example 1:
 * Input:
 * ["9001 discuss.leetcode.com"]
 * Output:
 * ["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]
 * Explanation:
 * We only have one website domain: "discuss.leetcode.com". As discussed above,
 * the subdomain "leetcode.com" and "com" will also be visited.
 * So they will all be visited 9001 times.
 * <p>
 * <p>
 * Example 2:
 * Input:
 * ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
 * Output:
 * ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"]
 * Explanation:
 * We will visit "google.mail.com" 900 times, "yahoo.com" 50 times, "intel.mail.com" once
 * and "wiki.org" 5 times. For the subdomains, we will visit "mail.com" 900 + 1 = 901 times,
 * "com" 900 + 50 + 1 = 951 times, and "org" 5 times.
 *
 * @author bruce.sun
 * @date 2018/6/12
 */
public class SubdomainVisitCountSolution {

    public String[] solution(String[] strings) {
        Map<String, String> hashmap = new HashMap();
        for (String s : strings) {
            int i = s.indexOf(' ');
            int n = Integer.valueOf(s.substring(0,i));
            String domain=s.substring(i+1);

            for (i=0;i<s.length();++i){

            }

        }


    }

}
