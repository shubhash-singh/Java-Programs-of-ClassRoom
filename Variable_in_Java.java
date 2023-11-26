import java.util.Random;

interface SharedConstant
{
    static int No = 0, Yes = 1, Maybe = 2;
    static int later = 3, soon = 4, Never = 5;
}

class Question implements SharedConstant
{
    static Random rand = new Random();
    int ask()
    {
        int prob = rand.nextInt(0,6);
        if (prob ==0)
            return No;
        else if (prob ==1)
            return Yes;
        else if (prob ==2 )
            return Maybe;
        else if (prob == 3)
            return later;
        else if (prob ==4)
            return soon; 
        else
            return Never;
    }
}

class Variable_in_Java implements SharedConstant
{
    static void answer (int result)
    {
        switch (result) {
            case No:
                System.out.println("No");
                break;
            case Yes:
                System.out.println("Yes");
                break;
            case Maybe:
                System.out.println("Maybe");
                break;
            case later:
                System.out.println("Later");
                break;
            case soon:
                System.out.println("Soon");
                break;
            case Never:
                System.out.println("Never");
                break;
            default:
                System.out.println("ValueError HAHAHA");
                break;
        }
    }

    public static void main(String[] args) {
        Question a = new Question();
        answer(a.ask());
        answer(a.ask());
        answer(a.ask());
        answer(a.ask());
        answer(a.ask());
        answer(a.ask());
        answer(a.ask());
        answer(a.ask());

    }
}