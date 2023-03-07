import java.util.*;
public class Matrices {
    int r,c;
    int mat[][];
    Matrices(){
        this.r = 2;
        this.c = 2;
        this.mat = new int[r][c];
    }
    Matrices(int r,int c){
        this.r = r;
        this.c = c;
        this.mat = new int[r][c];
    }
    Matrices(int r,int c,int mat[][]){
        this.r = r;
        this.c = c;
        this.mat = mat;
    }
    Matrices(Matrices A){
        this.r = A.r;
        this.c = A.c;
        this.mat = A.mat;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Matrix elements: ");
        for(int x = 0; x < this.r; x++)
            for(int y = 0; y < this.c; y++){
                System.out.print("Enter mat["+x+"]["+y+"]: ");
                mat[x][y] = sc.nextInt();
            }
    }
    void display(){
        System.out.println("Displaying Matrix elements: ");
        for(int x = 0; x < this.r; x++){
            for(int y = 0; y < this.c; y++)
                System.out.print(mat[x][y]+"  ");
            System.out.println();
        }
    }
    Matrices transpose(){
        Matrices TM = new Matrices(this.c,this.r);
        for(int x = 0; x < this.r; x++)
            for(int y = 0; y < this.c; y++)
                TM.mat[y][x] = this.mat[x][y];
        return TM;
        
    }
    void add(Matrices A){
        if(this.r == A.r && this.c == A.c){
            for(int x = 0; x < this.r; x++)
                for(int y = 0; y < this.c; y++)
                    this.mat[x][y] += A.mat[x][y];
            this.display();
        }
        else{
            System.out.print("Can't add Matrices with unmatched dimensions : ");
            System.out.println("("+this.r+" * "+this.c+") and ("+A.r+" * "+A.c+")");
        }
    }
    void add(Matrices A, Matrices B){
        if(A.r == B.r && A.c == B.c){
            for(int x = 0; x < A.r; x++)
                for(int y = 0; y < A.c; y++)
                    B.mat[x][y] += A.mat[x][y];
            this.display();
        }
        else{
            System.out.print("Can't add Matrices with unmatched dimensions : ");
            System.out.println("("+A.r+" * "+A.c+") and ("+B.r+" * "+B.c+")");
        }
    }
    boolean isScalar(){
        int ele = this.mat[0][0];
        if(this.r != this.c)
            return false;
        for(int x = 0; x < this.r; x++)
            for(int y = 0; y < this.c; y++)
                if(x != y && this.mat[x][y] != 0)
                    return false;
                else if(x == y && this.mat[x][y] != ele)
                    return false;
        return ele != 0;
    }
    boolean isEqual(Matrices A){
        if(this.r != A.r || this.c != A.c)
            return false;
        for(int x = 0; x < this.r; x++)
            for(int y = 0; y < this.c; y++)
                if(A.mat[x][y] != this.mat[x][y])
                    return false;
        return true;
    }
    boolean isDiagonal(){
        if(this.r != this.c)
            return false;
        for(int x = 0; x < this.r; x++)
            for(int y = 0; y < this.c; y++)
                if(x == y && this.mat[x][y] == 0)
                    return false;
                else if(x != y && this.mat[x][y] != 0)
                    return false;
        return true;
    }
}
