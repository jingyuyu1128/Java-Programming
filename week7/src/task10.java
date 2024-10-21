public class task10 {
    public static void main(String[] args){
        System.out.println("get random upper case letter is "+getRandomUpperCaseLetter());
        System.out.println("get random lower case letter is "+getRandomLowerCaseLetter());
    }
    public static char getRandomCharacter(char ch1,char ch2)
    {
        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }
    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('a','z');
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('A','Z');
    }
}
