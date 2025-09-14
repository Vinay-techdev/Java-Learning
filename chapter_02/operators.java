package chapter_02;

class operators {
    public static void main(String[] args) {
        Integer number = 5;
        boolean res;
        String res2;
    
        if (res = number instanceof Integer){
            System.out.println("number is an object of Integer. Hence: " + res);
        } else {
            System.out.println("number is not an object of Integer. Hence: " + res);
        }
        
        // conditional operator
        res2 = (number > 5) ? "number greater than five" : "number lesser than five";
        System.out.println(res2);
        
        // Arithmetic operator
        int a = 10;
        int b = 10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        
        //Inc operator
        System.out.println(++a); // inc 10(a) -> 11 & then print (a)11
        System.out.println(b++); // print 10(b) & then inc 10 -> 11
        // Dec operator
        System.out.println(--a); // dec 11(a) -> 10 & then print (a)10
        System.out.println(b--); // print 11(b) & then dec 11 -> 10

    }
}

