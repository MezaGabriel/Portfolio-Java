public class Immutable {
    public static void main(String[] args){
        int apples = 5;
        Integer applesWrapper = null;
        applesWrapper = 5;

        String str = applesWrapper.toString();

        System.out.println(apples);
        System.out.println(str);

        long stars = 1_000_000_000_000L;
        Long starsWrapper = 1_000_000_000_000L;
        
        System.out.println(stars);
        System.out.println(starsWrapper);
        starsWrapper.toString();
    }
}
