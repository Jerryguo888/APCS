import java.util.Scanner;

class APCS先加後乘與函數 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String q = Q(sc.next());

        System.out.println(Q(q));

    }

    static int lastDigits(boolean forward, String s, int sPos) {
        int idx = -1;
        int cur = sPos;
        while (cur >= 0 && cur < s.length() && Character.isDigit(s.charAt(cur))) {
            if (forward) {
                cur++;
            } else {
                cur--;
            }
        }
        if (forward) {
            idx = cur - 1;
        } else {
            idx = cur + 1;
        }
        return idx;
    }

    // return index ( inclusive )
    static int findStartOrEnd(int pos, String s) {
        int idx = -1;
        int pairCount = 0;
        int step = 0;
        if (s.charAt(pos) == '(') {
            // forward
            pairCount = 1;
            step = 1;
        } else if (s.charAt(pos) == ')') {
            // backward
            pairCount = -1;
            step = -1;
        }
        while (true) {
            pos += step;
            char ch = s.charAt(pos);
            if (ch == '(') {
                pairCount++;
            }
            if (ch == ')') {
                pairCount--;
            }
            if (pairCount == 0) {
                idx = pos;
                break;
            }
        }
        return idx;
    }

    static String addMut(char opchar, String s) {

        String prePart = "";
        String endPart = "";
        int op = s.indexOf(opchar);

        // before op
        int pi = op - 1;
        String digit_a = "";
        if (s.charAt(pi) == ')') {// f(...)
            int fAt = findStartOrEnd(pi, s) - 1;
            // f at iniParentheses - 1
            digit_a = Q(s.substring(fAt, op));// f(...)
            prePart = s.substring(0, fAt);
        } else {
            int sp = lastDigits(false, s, pi);
            digit_a = s.substring(sp, op);
            prePart = s.substring(0, sp);
        }

        // after op
        pi = op + 1; 
        String digit_b = "";
        if (s.charAt(pi) == 'f') {
            int endPar = findStartOrEnd(pi + 1, s);
            digit_b = Q(s.substring(pi, endPar + 1));
            endPart = s.substring(endPar + 1);
        } else {
            int ep = lastDigits(true, s, pi);
            digit_b = s.substring(op + 1, ep + 1);
            endPart = s.substring(ep + 1);
        }

        long a = Long.parseLong(digit_a);
        long b = Long.parseLong(digit_b);
        long c = 0;
        if (opchar == '+') {
            c = a + b;
        } else { // *
            c = a * b;
        }
        return prePart + c + endPart;
    }

    static String ffunc(String context ){
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        while (true) {            
            int cur = 0;
            int count = 0;
            while (cur<context.length()) {
                if (context.charAt(cur) == '(') {
                    count++;
                } else if (context.charAt(cur) == ')') {
                    count--;
                }
                if (count == 0 && context.charAt(cur) == ',') {
                    break;
                }
                cur++;
            }
            String t = context.substring(0, cur);
            String digit = Q(t);
            long x = Long.parseLong(digit);
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }

            if (cur == context.length()) {
                break;
            }

            context = context.substring(cur + 1); 
        }
        return ""+(max-min);
    }

    static String Q(String s) {

        // System.out.println(">>> "+s);        

        if (s.charAt(0) == 'f') {
            // f( , , , .. )
            // System.out.println("f====>"+s);
            int end = findStartOrEnd(1, s);
            String fcontext = s.substring(2, end);
            String r = ffunc(fcontext);           
            return Q( r+s.substring(end+1));

        } else if (s.indexOf("+") >= 0) {

            return Q(addMut('+', s));
        } else if (s.indexOf("*") >= 0) {

            return Q(addMut('*', s));
        } else {
            return s;
        }

    }
}