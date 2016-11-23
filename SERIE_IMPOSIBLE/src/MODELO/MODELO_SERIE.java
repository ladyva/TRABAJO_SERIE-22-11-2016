/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Valeria
 */
public class MODELO_SERIE {
    public double A,B,lim;

    public MODELO_SERIE(double A, double B, double lim) {
        this.A = A;
        this.B = B;
        this.lim = lim;
    }

    public double getA() {
        return A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getB() {
        return B;
    }

    public void setB(double B) {
        this.B = B;
    }

    public double getLim() {
        return lim;
    }

    public void setLim(double lim) {
        this.lim = lim;
    }
    //metodo
    public double serie(){
        double R=0;
        double n=1;
        for (int i=1;i<=lim;i++){
            if (i==1){
                R=R+(1/A);
            }else{
                R=R+(1/(A+(n*B)));
                n+=1;
            }
            
        
        }
        return R;
    }

    
}
