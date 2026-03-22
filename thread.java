class Main1 extends Thread{
    public void run(){
        for (int i = 1;i<=4;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Main1 ob1 = new Main1();
        Main1 ob2 = new Main1();
        Main1 ob3 = new Main1();
        

        ob1.start();
        ob2.start();
        ob3.start();
    }
}