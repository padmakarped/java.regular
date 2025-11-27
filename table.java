 class Table {

    synchronized void printTable (int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);

            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("\n");
    }
}

class MyThread1 extends Thread{
    
    Table T;

    MyThread1(Table T){
        this.T = T;
    }

    public void run(){
        T.printTable(5);
    }
}

class MyThread2 extends Thread{
    
    Table T;

    MyThread2(Table T){
        this.T = T;
    }

    public void run(){
        T.printTable(12);
    }
}

class TestTable {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}

