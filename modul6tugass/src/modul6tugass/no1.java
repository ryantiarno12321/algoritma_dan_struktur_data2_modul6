package modul6tugass;

public class no1 {

    public int ukuran;
          public long [] tumpukan;
        public int top;
        
public no1(int s){
    ukuran = s;
    tumpukan = new long [ukuran];
    top = -1;
}
public void push(long j){
    tumpukan[++top] = j;
}
public long pop(){
    return tumpukan[top--];
}
public long peek(){
    return tumpukan[top];
}
public boolean isEmpty(){
    return (top == ukuran-1);
}
public boolean isFull(){
    return (top == ukuran-1);
}
public void baca(){
    int i=top;
    while (i>=0){
        System.out.print(tumpukan[i]);
        System.out.print(" ");
        i--;
    }
}    
}
