public class Main{
    public static void  main(String [] args){
        System.out.println("准备中");
        new ServerListener().start();
        System.out.println("服务端已启动！");
    }
}