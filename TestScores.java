public class TestScores{
    public void testScores(double[] s){
        for(int i=0;i<s.length;i++){
            if(s[i]>=0 && s[i]<=100) System.out.println("good");
            else throw new IllegalArgumentException("Element: " + i + "  Score: " + s[i]);
        }

    }
}
