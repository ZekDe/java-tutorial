public class BallFall {
    public static void fillSpace(int begin, int end)
    {
        for(int i = begin; i < end; ++i){
            System.out.print(" ");
        }
    }
    public static void fillBall(int ballIndex, int end)
    {
        fillSpace(0, ballIndex);
        System.out.print("*");
        fillSpace(ballIndex+1, end);
    }
    public static boolean updateRightFlag(boolean right, int ballIndex, int width)
    {
        if(ballIndex == 0)
            right = true;
        else if(ballIndex == width - 1)
            right = false;

        return right;
    }
    public static int updateBallIndex(boolean right, int ballIndex)
    {
        if(right)
            return ballIndex + 1;
        return ballIndex - 1;
    }

    public static void play(int width, int height)
    {
        boolean is_right = true;
        int ball_index = 0;
        for(int i = 1; i <= height; ++i){
            System.out.print("|");

            fillBall(ball_index, width);
            if(width != 1)
            {
                is_right = updateRightFlag(is_right, ball_index, width);
                ball_index = updateBallIndex(is_right, ball_index);
            }
            System.out.println("|");
        }
    }
}
